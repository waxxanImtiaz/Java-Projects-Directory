
package typesofgettinginput;

import java.io.*;
public class TypesOfGettingInput {

    
    public static void main(String[] args) {
//        BufferedReaderInput object = new BufferedReaderInput();
//        object.goBuffer();
        
        ConsoleExample obj = new ConsoleExample();
        obj.goConsole();
    }
    
}
/*===================EXAMPLE OF BUFFEREDREADER INPUT==============*/
class BufferedReaderInput{
    
    public void goBuffer(){
        try{
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            
            System.out.println("Enter your name:");
            //String name = br.readLine();
            System.out.println("Welecome "+br.readLine());
        }catch( IOException e )
        {
            System.err.println(e.getMessage());
        }
    }
}
/*=========================EXAMPLE OF CONSOLE INPUT======================*/

class ConsoleExample {
    
    public void goConsole(){
   
        Console consoleObj = System.console();
        
        System.out.println("Enter your password");
        char[] pass = consoleObj.readPassword();
        System.out.println("Password is "+String.valueOf(pass));
        
    }
  
  
    public  ConsoleExample getObject(){
        
        return this;
    }
    
}
