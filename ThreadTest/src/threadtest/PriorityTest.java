/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

public class PriorityTest {
    public static void main( String[] args )
    throws InterruptedException
    {
     ChildThread t = new ChildThread();
     
     t.setPriority(10);
     System.out.println(Thread.currentThread().getPriority());
     t.start();
     
        System.out.println(t.getPriority());
     for( int i=0; i<10; i++)
     {
         System.out.println("Main thread");
     }
    }
}

class ChildThread extends Thread
{
    public void run()
    {
        for( int i =0; i<10; i++)
        System.out.println("child thread");
    }
}
