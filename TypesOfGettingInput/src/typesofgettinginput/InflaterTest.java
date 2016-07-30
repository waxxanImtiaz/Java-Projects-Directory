/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typesofgettinginput;
import java.io.*;  
import java.util.zip.*;  
  
public class InflaterTest{  
public static void main(String args[]){  
  
try{  
FileInputStream fin=new FileInputStream("E:/def.txt");  
InflaterInputStream in=new InflaterInputStream(fin);  
  
FileOutputStream fout=new FileOutputStream("E:/D.java");  
  
int i;  
while((i=in.read())!=-1){  
fout.write((byte)i);  
fout.flush();  
}  
  
fin.close();  
fout.close();  
in.close();  
  
}catch(Exception e){System.out.println(e);}  
System.out.println("rest of the code");  
}  
}  
