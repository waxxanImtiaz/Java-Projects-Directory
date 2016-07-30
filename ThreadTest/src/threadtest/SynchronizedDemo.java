package threadtest;

public class SynchronizedDemo {
    public static void main( String[] args )
    {
        Display d1 = new Display();
        Display d2 = new Display();

        MyThread7 t1 = new MyThread7(d1,"imtiaz");
        MyThread7 t2 = new MyThread7(d2,"kamran");
//        MyThread7 t3 = new MyThread7(d,"Khadim");
//        MyThread7 t4 = new MyThread7(d,"Murtaza");
//       
        t1.start();     /*In this case we will get consistent output.. bcoz method is static
                         .. every java class have class class object in case of static members   */
        t2.start(); 
//        t3.start();
//        t4.start();
//        
        
    }
}
 
class MyThread7 extends Thread{
    private Display d;
    private String name;
    public MyThread7( Display d,String name )
    {
        this.d = d;
        this.name = name;
    }
    public void run()
    {
        d.wish(name);
    }
}
class Display{
    
    public static synchronized void wish( String name )
    {
        
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
}