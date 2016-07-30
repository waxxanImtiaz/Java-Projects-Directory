/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author waxxan
 */
public class MainMethod {
    public static void main( String[] args )
    throws InterruptedException
    {
        threadtest.MyRunnable r = new threadtest.MyRunnable();
        
        Thread t = new Thread( r ,"imtiaz");
        
        t.start();
        t.join();
        for(  int i =0; i<10; i++ )
        {
            System.out.println("Main Thread");
        }
        
//        MyThread3 t = new MyThread3();
//        
//        Thread t2 = new Thread( t );
//        
//        t2.start();;
//        System.out.println("main thread");
//        
    }
}

class MyThread3 extends Thread
{
    public void run()
    {
        System.out.println("child thread");
    }
}