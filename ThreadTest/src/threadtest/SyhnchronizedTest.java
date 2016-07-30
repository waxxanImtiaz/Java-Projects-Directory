package threadtest;

public class SyhnchronizedTest {
    public static void main(String[] args)
    {
        DisplayTest d =  new DisplayTest();
        
        Thread1 t1 = new Thread1( d );
        
        Thread2 t2 = new Thread2( d );
        t1.start();
        t2.start();
    }
}

class DisplayTest
{
    public synchronized void displayn(){
        
        for( int i = 1; i<=10; i++ )
        {
            System.out.print(i);
            try{
            Thread.sleep( 2000 );
        }catch( InterruptedException e ) {  }
       }
    }
    public synchronized void displayc(){
        
        for( int i = 65; i<=75; i++ )
        {
            System.out.print((char)i);
            try{
            Thread.sleep( 2000 );
        }catch( InterruptedException e ) {  }
       }
    }
}
//thread class 1
class Thread1 extends Thread{
    DisplayTest d;
    public Thread1(DisplayTest d)
    {
        this.d = d;
    }
    public void run(){
        d.displayn();
    }
            
}
//thread class 2
class Thread2 extends Thread{
    DisplayTest d;
    public Thread2(DisplayTest d)
    {
        this.d = d;
    }
    public void run(){
        d.displayc();
    }
            
}