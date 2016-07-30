
package controller;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public class Table
{
    public static void main(String[] args)
    {
        final TableTest table = new TableTest();
        
        Thread t1 = new Thread(){
           
          @Override
          public void run()
          {
              table.printNum(4);        
          }
        };
        Thread t2 = new Thread(){
         @Override
          public void run()
          {
              
              table.printNum( 3 );
          }
        };
        Thread t3 = new Thread(){
         @Override
          public void run()
          {
              
              table.printNum( 3 );
          }
        };
        
        Thread t4 = new Thread(){
         @Override
          public void run()
          {
              
              table.printNum( 3 );
          }
        };
        System.out.println( "Thread starting." );
        ExecutorService exe = Executors.newCachedThreadPool();
        
        exe.execute(t1);
        exe.execute(t2);
        exe.execute(t3);
        exe.execute(t4);
        System.out.println("Main method ended");
        exe.shutdown();
        
        try{
            boolean taskEnded = exe.awaitTermination( 1,TimeUnit.MINUTES);
            if(taskEnded)
            {
                System.out.println("ok");
            }
            else
                System.out.println("Timed out while waiting for tasks to finish.");
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class TableTest {
    public void printNum(int n){
        System.out.println("printNum method started");
     synchronized(this)
    {
        for(int i = 1; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.print((i+n)+" ");
        }
    }
        System.out.println("synchronized ended");
        System.out.println(Thread.currentThread().getName());
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
}

}
