/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramming;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class ServerProgram {
     public static void main(String[] args) {

        ServerSocket server = null;
        Socket con = null;
        ObjectInputStream is = null;
        ObjectOutputStream os = null;
        try{
            server = new ServerSocket(27);
            System.out.println("Waiting for connection.\n");
            con = server.accept();
            System.out.println("Connection one recieved from"+con.getInetAddress().getHostName());
            os = new ObjectOutputStream( con.getOutputStream() );
            
            is = new ObjectInputStream(con.getInputStream());
            
            System.out.println("Got I/O stream");
            String message = null;
            do{
                
                try{
                    message = (String)is.readObject();
                    System.out.println(message+"\n");
                }catch(ClassNotFoundException e)
                {
                    
                }
            }while( !message.equals("ok") );
           
            }catch( IOException e )
            {
                System.out.println("");
            }finally{
                try{
                    os.close();
                    is.close();
                    server.close();
                    con.close();
                }catch( Exception e )
                {
                    
                }
            }
        }
        
       
        
    }
    

