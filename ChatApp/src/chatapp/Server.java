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
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class Server extends JFrame {
	private JTextField enterField;
	private JTextArea displayArea;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	private int counter =1;
	public Server()
	{
		super( "Server" );
		
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
	
	//runServer method
	
	public void runServer()
	{
		try{
			server = new ServerSocket( 12345,100 );
			
			while( true )
			{
				try{
					waitForConnection();
					getStreams();
					processConnection();
				}catch( EOFException e )
				{
					displayMessage( "\nServer terminated connection" );
				}
				finally{
					closeConnection();
					++counter;
				}
			}
		}catch( IOException e ){
			e.printStackTrace();
		}//end of try-catch
	}//end of method runServer
	
	public void waitForConnection() throws IOException
	{
		displayMessage( "Waiting for connection" );
		connection = server.accept();
		displayMessage( "Connection "+counter+" received from:"+connection.getInetAddress().getHostName() );
	}//end of waitForConnection method
	
	//get streams to send and recieve data
	public void getStreams() throws IOException
	{
		output = new ObjectOutputStream( connection.getOutputStream() );
		output.flush();
		
		input = new ObjectInputStream(connection.getInputStream() );
		
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
		displayMessage( "\nTerminating Connection" );
		setTextFieldEditable( false );
		
		try{
			output.close();
			input.close();
			connection.close();
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
			output.writeObject( "Server>>>"+message );
			output.flush();
			displayMessage( "\nSERVER>>> "+message );
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

