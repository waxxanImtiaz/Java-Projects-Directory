
package file.handling;


import java.io.*;
public class CompareTwoFiles {

   
    public static void main(String[] args) {
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        try{
            
           file1 = new FileInputStream("E:/file1.txt");
           file2 = new FileInputStream("E:/file2.txt");
           int ch1 = 0;
           int ch2 = 0;
           int x = file1.available();
            System.out.println(x);
            while( ((ch1 = file1.read()) != -1) ){
                System.out.print((char)ch1);
            }
//           while( ((ch1=file1.read()) != -1)||((ch2=file2.read())!= -1) ){
//               
////               System.out.println((char)ch1);
////               System.out.println((char)ch2);
//               
            
//               
//              
//               if( ch1 == ch2 ){
//                   System.out.println((char)ch1);
//               }
//           }
           
          
        }catch( IOException e)
        {
            
        }
        
        finally{
            try{
            file1.close();
            file2.close();
            }catch(IOException e){
                System.out.println("Files not closed");
            }
        }
    }
    
}
