/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.*;
import java.net.*;

public class Serverr {
        public static void main(String[] args)  {
            try{
             ServerSocket s = new ServerSocket(6666);
             Socket socket = s.accept();
             
             DataInputStream in = new DataInputStream( socket.getInputStream() );
             DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
             BufferedReader br = new BufferedReader( new InputStreamReader( System.in )  );
             
             String data ="";
             String c = "";
             while( !data.equals("stop") ){
                 System.out.println("Server says:");
                 data = br.readLine();
                 dos.writeUTF(data);
                 dos.flush();
                 c = (String)in.readUTF();
                 System.out.println("Cleint says:"+c);
             }
             br.close();
             in.close();
             dos.close();
             s.close();
             
                System.out.println("Welecome "+data);
                s.close();
            }catch( IOException e ){
                System.out.println(e.getMessage());   
            }
            
    }
}
