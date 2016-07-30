package threadtest;

public class ThreadYieldDemo {
    public static void main( String[] args )
    {
        MyThreadYield t = new MyThreadYield();
        
        t.start();
        
        for( int i = 0; i<10; i++)
        {
            System.out.println("Main thread");
        }
    }
}

class MyThreadYield extends Thread{
    
    public void run()
    {
        for( int i = 0; i<10; i++)
        {
            System.out.println("Child Thread");
            //Thread.yield();
        }
    }
}