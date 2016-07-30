
package testprograms;


public class TestOne implements Runnable {
  
    public static void main( String[] args ) throws Exception
    {
        Thread t = new Thread( new TestOne());
        Thread t1 = new Thread( new newThread() );
        t1.start();
        t.run();
        t.run();
        t.run();
        t.start();
         System.out.println("Started");
        t.join(50000);
        System.out.println(" t Completed");
        t1.join();
       
        System.out.println("t1 Completed");
    }
    @Override
    public void run(){
        
        for(  int i = 0; i<4; i++  )
        {
            System.out.println(i);
        }
    }
    
}
 class newThread implements Runnable
{
    @Override
    public void run()
    {
    for( int i = 0; i <4; i++ )
            System.out.println("new Thread");
        }
}
