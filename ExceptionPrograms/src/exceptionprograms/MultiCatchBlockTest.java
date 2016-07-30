/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionprograms;
import java.io.*;

public class MultiCatchBlockTest {
    public static void main( String[] args )
    {
        try{
           // System.out.println(10/0);
            Object o = new Object();
            String s = (String)o;
        }catch(ClassCastException|ArithmeticException|IllegalArgumentException|NullPointerException e)
        {
            e.printStackTrace();
        }
//        try{
//            
//        }catch(Exception|ArithmeticException e)
//        {
//            e.printStackTrace();
//        }
        
    }
}
