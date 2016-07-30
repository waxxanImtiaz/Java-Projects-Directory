
package item;


public class Consumer implements Runnable {
 
    private Item shared;
    
    public Consumer(Item s)
    {
        shared=s;
        
    }
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println("Consumer Consumed "+shared.getx());
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}