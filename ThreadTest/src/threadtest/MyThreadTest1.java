
package threadtest;


public class MyThreadTest1 {
    public static void main( String[] args )
    throws InterruptedException 
    {
        Thread t1 = new Thread( new ThreadTest1() );
        Thread t2 = new Thread( new ThreadTest1() );
        Thread t3 = new Thread( new ThreadTest1() );
        
        t1.setName("t1 Thread:");
        t2.setName("t2 Thread:");
        t3.setName("t3 Thread:");
        t1.setDaemon(true);
        t3.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
       
        
        t1.interrupt();
        t2.interrupt();
        t3.join();
        t1.join();
        t2.join();
        
        System.out.println("Main thread ended");
    }
}

class ThreadTest1 implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" is going to sleep");
            Thread.sleep(200);
            
        }catch(InterruptedException e){
            
            System.out.println(Thread.currentThread().getName()+" is interrupted");
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+" is woke up.");
    }
} 