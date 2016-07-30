
package enumtest;

 class InnerClass {
    private int x;
    public int y;
    protected int z;
    
    InnerClass()
    {
        x = 10;
        y = 200;
        z = 29;
        
        
    }
    public class MyInner extends InnerClass
    {
        public void print(){
            System.out.println("x = "+x+",y="+y+",z="+z);
        }
    }
    
}
enum A
{
    
    
}
 enum B  
{
    APPLE(1),MANGO(3),BANANA(5);
    
    public int y;
    public static void main( String[ ] args )
    {
        B obj = B.APPLE;
        if( B.APPLE.equals(B.BANANA) )
        {
            System.out.println(obj.APPLE);
        }
    }
    B( int y )
    {
        this.y = y;
    }
    public int getY()
    {
        return y;
    }
    void setY( int y)
    {
        this.y = y;
    }
    @Override
    public String toString()
    {
        return "y="+y;
    }

}