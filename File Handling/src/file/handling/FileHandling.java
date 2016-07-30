/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.handling;

import java.io.*;
public class FileHandling {

   
    public static void main(String[] args) {
        FileInputStream in;
        FileOutputStream out;
        try{
            
           in = new FileInputStream("E:/input.txt");
           out = new FileOutputStream("E:/output.txt");
           int ch;
           
           while( (ch = in.read()) != -1 ){
               out.write(ch);
           }
        }catch( IOException e)
        {
            
        }
        
        finally{
            
            
        }
    }
    
}
