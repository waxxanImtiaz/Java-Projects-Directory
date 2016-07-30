/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionprograms;


public class IllegalStateExceptionTest {
    public static void main( String[] args )
    {
        Thread1 t = new Thread1();
        
        t.start();                  //it is ok
        System.out.println("Main thread");
        t.start();                  /*but it will throw IllegalThreadException
                                    because we called start() at wrong time.. actually it
                                    IllegalStateException( calling a method at wrong time )
                                    */
    }
}
class Thread1 extends Thread{
    
    public void run(){
        System.out.println("Child Thread");
    }
}
