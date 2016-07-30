/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatapp;



import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class Client extends JFrame {
	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private Socket client;
	String message = "";
	String chatServer;
	
	public Client( String host )
	{
		super( "Client" );
		
		chatServer = host;
		
		enterField = new JTextField();
		enterField.setEditable( false );
		
		enterField.addActionListener(  
		new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				sendData( e.getActionCommand() );
				enterField.setText( " " );
			}
		}
				);
		add( enterField, BorderLayout.NORTH);
		
		displayArea = new JTextArea();
		
		add( new JScrollPane( displayArea ),BorderLayout.CENTER );
		
		setSize( 300,150 );
		setVisible( true ); 
	}//end of constructor
	
	//runClient method
	
	public void runClient()
	{

			
				try{
					connectToServer();
					getStreams();
					processConnection();
				}catch( EOFException e )
				{
					displayMessage( "\nClient terminated connection" );
				}
				catch( IOException e )
				{
					e.printStackTrace();
				}
				finally{
					closeConnection();
				}
			
		
	}//end of method runClient
	
	public void connectToServer() throws IOException
	{
		displayMessage( "Waiting for connection" );
		client = new Socket( InetAddress.getByName( chatServer ),12345 );
		displayMessage( "Connected to:"+client.getInetAddress().getHostName() );
	}//end of connectToServer method
	
	//get streams to send and recieve data
	public void getStreams() throws IOException
	{
		output = new ObjectOutputStream( client.getOutputStream() );
		output.flush();
		
		input = new ObjectInputStream(client.getInputStream() );
		
		displayMessage( "\nGot I\\O streams\n" );
	}//end of method getStreams
	
	private void processConnection() throws IOException
	{
		String message = "Connection successful";
		sendData( message );
		
		setTextFieldEditable(  true );
		
		do{
			try{
				message = ( String )input.readObject();
				displayMessage( "\n"+message );
			}catch( ClassNotFoundException e )
			{
				displayMessage( "\nUnknown object type recieved" );
			}//end try-catch
		}while( !message.equals("CLIENT>>>TERMINATE") );
	}// end of method processConnection.
	
	public void closeConnection()
	{
		displayMessage( "\nClosing Connection" );
		setTextFieldEditable( false );
		
		try{
			output.close();
			input.close();
			client.close();
		}//end try
		catch( IOException e )
		{
			e.printStackTrace();
		}//end catch
	}//end of method closeConnection
	
	//send message to client
	public void sendData( String message )
	{
		try
		{
			output.writeObject( "CLIENT>>>"+message );
			output.flush();
			displayMessage( "\nCLIENT>>> "+message );
		}
		catch( IOException e )
		{
			displayArea.append( "\nError writing object" );
		}//end catch
	}//end method sendData
	
	private void displayMessage( final String message )
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				displayArea.append( message );
                               
			}
		});
	}//end of method displayMessage
	
	public void setTextFieldEditable( final boolean editable )
	{
		SwingUtilities.invokeLater( new Runnable()
		{
			public void run()
			{
				enterField.setEditable( editable );
			}
		});
	}//end of method setTextFieldEditable
}

