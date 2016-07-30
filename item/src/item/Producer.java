package item;
import java.util.Random;
public class Producer implements Runnable {

    private Item shared;
    private Random rand;
    
    public Producer(Item s)
    {
        rand=new Random();
        shared=s;
}
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
            shared.setx(rand.nextInt(1000));
            System.out.println("prducer produced "+shared.getx());
    }
        catch(InterruptedException e)
        {
            e.printStackTrace();
    }
    }
}
