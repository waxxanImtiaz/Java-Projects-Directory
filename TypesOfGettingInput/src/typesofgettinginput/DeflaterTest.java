/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typesofgettinginput;

import java.io.*;
import java.util.zip.*;

/**
 *
 * @author waxxan
 */
public class DeflaterTest {
         public static void main(String[] args) throws IOException {
          
             FileInputStream fis = new FileInputStream("E:/Acount.java");
             
             FileOutputStream fos = new FileOutputStream("E:/account.txt");
             DeflaterOutputStream df = new DeflaterOutputStream(fos);
             int i;
             while( (i = fis.read()) != -1  ){
                 df.write((byte)i);
                 df.flush();
             }
             df.close();
             fos.close();
             fis.close();
    }
}
