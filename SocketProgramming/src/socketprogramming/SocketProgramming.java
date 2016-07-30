
package socketprogramming;
import java.net.Socket;
import java.io.*;
import java.io.IOException;

public class SocketProgramming {

    public static void main(String[] args) {

        Socket client = null;
        ObjectInputStream is = null;
        ObjectOutputStream os = null;
        try{
            client = new Socket("Imtiaz",27);
            os = new ObjectOutputStream( client.getOutputStream() );
            os.flush();
            is = new ObjectInputStream(client.getInputStream());
            
            
             if( (client != null) && is != null && os != null )
                {
                os.writeBytes("Hello Imtiaz");
                os.writeBytes("ok");
                }
             String readline = null;
             while((readline = is.readLine())!= null)
              {
                  System.out.println("Server:"+readline);
                  if( readline.equals("ok") ) 
                      break;
                     }
        }catch(IOException e )
        {
            System.out.println("");
        }finally{
            try{
            os.close();
            is.close();
            client.close();
            }catch( IOException e )
            {
                System.out.println("");
            }
        }
        
       
        
    }
    
}
