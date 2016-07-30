package controller2;

import java.io.*;
import java.util.Date;

public class TestDateStream {
  public static void main( String [] args )
  {
      String str = new String("Garbage in, garbage out");
      String dirName = "E:/imtiaz/";
      
      try{
          File dir = new File(dirName);
          
          if( !dir.exists() )
          {
              dir.mkdir();
          }
          else{
              if(!dir.isDirectory()){
                     System.err.println( dirName+" is not a directory" );
                     return;
              }
              
              File afile = new File( dir,"newFile.txt" );
              afile.createNewFile();
              
              DataOutputStream dos = new DataOutputStream( new FileOutputStream(afile,true) );
              
              dos.writeBoolean(true);
              
              dos.writeChars(str);
          }
      }catch( IOException e )
      {
          e.printStackTrace();
      }
  }
}
