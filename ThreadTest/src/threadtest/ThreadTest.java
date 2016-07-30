package threadtest;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException{
        ThreadClass.mt = Thread.currentThread();
        
        ThreadClass t = new ThreadClass();
        t.start();
        t.yield();
        for(int i = 0; i<10; i++)
        {
            System.out.println("Main thread");
            Thread.sleep(200);
        }
    }
    
}
class ThreadClass extends Thread
{
    public static Thread mt;
    @Override
    public void run()
    {
        try{
            //mt.start();
            mt.join();
        }
        catch(InterruptedException e)
        {
            
        }
        for( int i= 0; i<10; i++)
        {
            System.out.println("Child thread1");
        }
    }
}
class ThreadClass2 extends Thread
{
    @Override
    public void run()
    {
        
        for( int i= 0; i<10; i++)
        {
            System.out.println("Child thread2");
        }
    }
}
