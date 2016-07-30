package threadtest;

public class MyThreadJoin {
    public static void main( String[] args )
            throws InterruptedException
    {
        MyThread5 t = new MyThread5();
        t.start();
        t.join(10000);
        for( int i =0; i<10; i++ )
        {
            System.out.println("Main thread");
        }
    }
}
class MyThread5 extends Thread
{
    public void run(){
        
        try{
            for( int i = 0; i<10; i++)
            {
                System.out.println("Child thread");
                Thread.sleep(2000);
            }
        }catch( InterruptedException e)
        {
            
        }
    }
}