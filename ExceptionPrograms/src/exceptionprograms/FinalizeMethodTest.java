/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionprograms;


public class FinalizeMethodTest {
    public static void main( String[] args )
    {
        FinalizeMethodTest f = new FinalizeMethodTest();
         FinalizeMethodTest t = new FinalizeMethodTest();
          FinalizeMethodTest d = new FinalizeMethodTest();
           FinalizeMethodTest c = new FinalizeMethodTest();
        //f.finalize();
        t= null;
        d = null;
        c = null;
        f = null;
        System.gc();
        System.out.println("main method ended");
    }
    public void finalize(){
        System.out.println("finalize method called.");
        System.out.println(10/0);
        throw new RuntimeException("Hello");
        
    }
}
