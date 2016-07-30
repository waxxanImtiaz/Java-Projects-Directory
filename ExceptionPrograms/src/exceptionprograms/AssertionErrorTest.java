/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionprograms;

public class AssertionErrorTest {
    public static void main( String[] args )
    {
     int x = 100;
     try{
     assert(x>10); //if x>10 AssertionError should occur
     }catch(Error e)
     {
         System.out.println(e.getMessage());
     }
     System.out.println("Main thread");
    }
}
