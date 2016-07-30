
package serializationproject;

//import java.io.*;

public class Cat extends Animal  {
    private transient int i;
    private int j;
    
    public Cat()
    {
        setI( 0 );
        setJ( 0 );
        
    }
    public Cat( int i,int j  )
    {
        setI( i );
        setJ( j );
    }
    public void setI( int i )
    {
        this.i = i;
    }
    public int getI()
    {
        return i;
    }
    public void setJ( int j )
    {
        this.j = j;
    }
    public int getJ()
    {
        return j;
    }
}
