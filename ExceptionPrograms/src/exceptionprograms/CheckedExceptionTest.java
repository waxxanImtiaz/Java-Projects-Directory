package exceptionprograms;

import java.io.*;

public class CheckedExceptionTest {

    public static void main( String[] args )
            throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter( "abc.txt" );
        pw.println("Hello world");
    }   
         
}
