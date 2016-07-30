package genericsprograms;

public class GenericClass <T> {
    
    
    public GenericClass(){
        
    }
    public void print(T[] t)
    {
        for( T temp: t )
        {
            System.out.print(temp+" ");
        }
        System.out.println("");
    }
    
    public <T extends Comparable> T maximum(T x,T y)
    {
        T max = x;
        if(x.compareTo(y)>0)
            max = x;
        else
            max = y;
        
    return max;
    }
}
