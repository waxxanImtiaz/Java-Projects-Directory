
package item;

public class Item {

    int x;
    public synchronized void setx(int x)
    {
        this.x=x;
        
    }
    public synchronized int getx()
    {
        return x;
    }
    public static void main(String[] args) {

        Item obj=new Item();
        Producer p=new Producer(obj);
        Consumer c=new Consumer(obj);
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        
        
        
            t1.start();
            t2.start();
        
        t1.setPriority( 1 );
        t2.setPriority( 2 );
        
        System.out.println("main thread completed");
    }
    
}
