package socketprogramming;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;
import java.util.Scanner;
public class Server {
    private ServerSocket server;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private Socket con;
    private Scanner sc = new Scanner(System.in);
    public void runServer(){
        try{
            server = new ServerSocket(12345,27);
            while( true )
            {
            waitForConnection();
            getStream();
            proccessConnection();
            
            }
        }catch( IOException e )
        {
            System.out.println("Server terminated connection.");
        }finally{
            closeConnection();
        }
    }
    public void start()
    {
        System.out.println("\nServer enter data.");
        sendData(sc.next());
        
    }
    public void waitForConnection() throws IOException{
        System.out.println("Waiting for connection.");
        con = server.accept();
    }//end of method waitForConnection
    public void getStream() throws IOException
    {
        output = new ObjectOutputStream( con.getOutputStream() );
        output.flush();
        
        input = new ObjectInputStream( con.getInputStream() );
        
        System.out.println("Got I/O streams.");
    }// end of method getStream
    public void proccessConnection() throws IOException{
        String message = "Connection succesful imtiaz";
        sendData( message );
        
        do{
            try{
                message = (String)input.readObject();
                System.out.println("\n"+message);
                start();
            }catch( ClassNotFoundException e )
            {
                System.out.println("\nUnknown object recieved.");
            }
        }while( !message.equals("ok") );
    }//end of method proccessConnection
    public void sendData( String message )
    {
        try{
            output.writeObject("\nServer>>"+message);
            output.flush();
            System.out.println("\nServer>>"+message);
        }catch( IOException e )
        {
            System.out.println("\nError writting object. ");
        }
    }//end of method sendData
    public void closeConnection(){
        try{
            server.close();
            con.close();
            output.close();
            input.close();
        }catch(IOException e)
        {
            
        }
    }
}
