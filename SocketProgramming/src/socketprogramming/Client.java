/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramming;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
   
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private Socket client;
    String message = "";
    String chatServer = "127.0.0.1";
    private Scanner sc = new Scanner(System.in);
     public void start()
    {
        sendData(sc.next());
    }
    public void runClient()
	{
            
	try{
            connectToServer();
            getStreams();
            processConnection();
            
        }catch( EOFException e )
        {
            System.out.println("\nClient terminated connection" );
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }
        finally{
            closeConnection();
        }
			
		
	}//end of method runClient
        public void connectToServer()throws IOException
	{
		System.out.println( "Waiting for connection" );
		client = new Socket( InetAddress.getByName( chatServer ),12345 );
		System.out.println( "Connected to:"+client.getInetAddress().getHostName() );
	}//end of connectToServer method
	//get streams to send and recieve data
	public void getStreams() throws IOException
	{
		output = new ObjectOutputStream( client.getOutputStream() );
		output.flush();
		
		input = new ObjectInputStream(client.getInputStream() );
		
		System.out.println( "\nGot I\\O streams\n" );
	}//end of method getStreams
	
	private void processConnection() throws IOException
	{
		String message = "Connection successful";
		sendData( message );
		
		
		
		do{
			try{
				message = ( String )input.readObject();
				System.out.println( "\n"+message );
                                start();
			}catch( ClassNotFoundException e )
			{
				System.out.println( "\nUnknown object type recieved" );
			}//end try-catch
		}while( !message.equals("CLIENT>>>ok") );
	}// end of method processConnection.
	
	public void closeConnection()
	{
		System.out.println( "\nClosing Connection" );
                
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
			System.out.println( "\nCLIENT>>> "+message );
		}
		catch( IOException e )
		{
			System.out.println( "\nError writing object" );
		}//end catch
	}//end method sendData
	
}
