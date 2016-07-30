/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionprograms;


public class ExceptionInIntializerErrorTest {
    //static int i = 10/0;
    static{
   // String s = null;
        System.out.println("static");
    }
    {
      System.out.println("Instance block1");
    }//this is instance block is executed when object is created
    public static void main( String[] ars )
    {
        ExceptionInIntializerErrorTest o = new ExceptionInIntializerErrorTest();
        
        
    }
        {
            System.out.println("instance block2");
        }
         int speed;  
      
    ExceptionInIntializerErrorTest(){
        System.out.println("speed is "+speed);
    }  
   
    {
        speed=100;
    } 
    public void m(){
        {
            System.out.println("m method");
        }
    }
}
