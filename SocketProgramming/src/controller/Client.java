
package controller;

import java.io.*;
import java.net.*;

public class Client {
   public static void main( String[] args )
   {
       try{
           Socket s = new Socket("localhost",6666);
           
           DataOutputStream dos= new DataOutputStream(s.getOutputStream());
           DataInputStream dis = new DataInputStream( s.getInputStream() );
           BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
           
           String c = "";
           String server = "";
           while( !c.equals("stop") ){
               System.out.println("Server sys "+dis.readUTF());
               System.out.println("Client sys:");
               c = br.readLine();
               dos.writeUTF(c);
               dos.flush();
           }
           dos.close();
           s.close();
       }catch( IOException e )
       {
           System.err.println(e.getMessage()); 
       }
   }
}
