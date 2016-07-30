package threadtest;

public class SynchronzedBlockDemo1 {
    public static void main( String[] args )
    {
        DisplayD d1 = new DisplayD();
        DisplayD d2 = new DisplayD();

        
        MyThread8 t1 = new MyThread8( d1,"imtiaz");
        t1.start();
        MyThread8 t2 = new MyThread8( d2,"kamran");
        t2.start();
    }
}
class DisplayD{
    
    public  void wish( String name )
    {
        ;;;;;;;;;//1 lacs of code
        System.out.println("Before loop");
        synchronized(DisplayD.class){
        for( int i =0; i<10; i++ )
        {
            try{
                System.out.println("Good morning:");
                Thread.sleep(2000);
            }catch(InterruptedException e)
            {
                System.out.println("I am distrubed.");    
            }
            System.out.println(name);
            
        }
        }
        
        ;;;;;;;;;// 1 lac of code
        System.out.println("After loop");
    }
}


class MyThread8 extends Thread{
    private DisplayD d;
    private String name;
    public MyThread8( DisplayD d,String name )
    {
        this.d = d;
        this.name = name;
    }
    public void run()
    {
        d.wish(name);
    }
}
