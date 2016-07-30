/*
 try with resources reduces the code complexity. the need of finally block is
removed, because resources opened by our program, are automatically closed by 
try resource(Either Exception occur or not). Because all resources(DB,BR,FR,network 
resources etc) are 
already implemented in java.lang.AutoCloseable interface so,being a programmer 
we have not worry to close the resources and this interface came in 1.7V
and it contains only one method close() ..
Note: A resource is said to be AutoCloseable if and only if coresponding class implements
java.lang.AutoCloseable interface.
All I/O resources,database resource and network related resources are already implemented
in AutoCloseable interface.
Note: All the try block resources declared in try(;;) are implicitly final. reassigning 
them will be an exception
 */
package exceptionprograms;

import java.io.*;
public class TrywithResources {
    public static void main( String[] args )
            throws IOException 
    {
        try( BufferedReader br = new BufferedReader(new FileReader("abc.txt")); BufferedReader brr = new BufferedReader(new FileReader("abc.txt")); ){
            
         //   br = new BufferedReader(new FileReader("abc.txt")); //error
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        
        //This is ok
        try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"));){
            System.out.println("imtiaz");
        }
    }
}
