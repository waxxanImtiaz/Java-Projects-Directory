
package threadtest;

import java.io.*;
import java.util.*;
public class AccessFiles {
      private boolean flag;
      private String name;
      private Formatter output;
      private Scanner input;
      public AccessFiles(){
          try{
          output = new Formatter( new File("E:/imtiaz/threadtest.txt") );
          input = new Scanner( "E:/imtiaz/threadtest.txt" );
          flag = false;
              System.out.println("File oppened.");
          }catch( FileNotFoundException e )
          {
              e.printStackTrace();
          }
      }
      public synchronized void setName( String name ){
          try{
          while( getFlag()){
              System.out.println("File does not read, please wait.");
              wait();
          }
          }catch(InterruptedException e )
          {
              e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName());
          this.name = name;
          setFlag( true );
          notify();
      }
      public synchronized void  readName(){
          try{
          while(!getFlag()){
              System.out.println("File could not write, please wait.");
              wait();
          }
          }catch(InterruptedException e )
          {
              e.printStackTrace();
          }
          
          setFlag( false );
          System.out.println(Thread.currentThread().getName());
          System.out.println( this.name );
          notify();
      }
      public boolean getFlag(){
          return flag;
      }
      public void setFlag( boolean flag )
      {
          this.flag = flag;
      }
      public static void main( String[] args )
      {
          AccessFiles af = new AccessFiles();
          
          Thread p = new Thread( new Producer( af ) );
          Thread c = new Thread( new Consumer( af ) );
          p.setName("Producer");
          c.setName("Consumer");
          p.start();
          c.start();
          
          System.out.println("Main Ends.");
      }
}


class Producer implements Runnable
{
    private AccessFiles af;
    public Producer( AccessFiles af )
    {
        this.af = af;
    }
    @Override
    public void run(){
        for( int i = 1; i<10; i++ )
        {
            af.setName("Name "+i);
        }
    }
}
class Consumer implements Runnable
{
    private AccessFiles af;

    public Consumer( AccessFiles af )
    {
        this.af = af;
    }
    @Override
    public void run(){
        for( int i = 1; i<10; i++ )
        {
            af.readName();
        }
    }
}