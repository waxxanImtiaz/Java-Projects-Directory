
package threadtest;


public class ThreadTestJoin {
    public static void main( String[] args ) throws InterruptedException
    {
        MyThread2 t = new MyThread2();
        
        t.start();
        t.interrupt();;
        System.out.println("Main thread end");
    }
}

class MyThread extends Thread
{
    public void run()
    {
        try{
            for( int i = 0; i<10; i++ )
            {
                System.out.println("I am lazy thread.");
                Thread.sleep(5000);
            }
        }catch( InterruptedException e)
        {
            System.out.println("I am interrupted");
        }
    }
}

class MyThread2 extends Thread
{
    public void run()
    {
        try{
            for( int i = 1; i<=20000; i++ )
            {
                System.out.println("I am lazy thread."+i);
                
            }
                System.out.println("I m going to sleep");
               Thread.sleep(5000);
        }catch( InterruptedException e)
        {
            System.out.println("I am interrupted");
        }
    }
}
