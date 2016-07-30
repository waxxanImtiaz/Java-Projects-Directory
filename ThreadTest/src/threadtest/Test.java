/*
 
A thread can have multiple locks simultaneously...
 */
package threadtest;

/**
 *
 * @author waxxan
 */
public class Test {
    public static void main( String[] args )
    {
        X x = new X();
        
        T1 t1 = new T1( x );
        T2 t2 = new T2( x );
        
        t1.start();
        
        t1.suspend();
        
        System.out.println("t1 suspended");
        t2.start();
        
        t1.resume();
        System.out.println("t1 resumed");
    }
}
class T1 extends Thread{
    X x;
    T1( X x)
    {
        this.x = x;
    }
    public void run()
    {
        x.m1();
    }
}
class T2 extends Thread{
    X x;
    T2( X x)
    {
        this.x = x;
    }
    public void run()
    {
        x.m1();
    }
}

class X{
     public void m1(){
         System.out.println(Thread.currentThread().getName());
        System.out.println("Class x");
        Y y = new Y();
        synchronized( y )
        {
            Z z = new Z();
            y.m2();
            synchronized( z ){
                z.m3();
            }
        }
    }
}

class Y{
     public void m2(){
        System.out.println("Class y");
    }
}
class Z{
    
    public void m3(){
        System.out.println("Class Z");
    }
}