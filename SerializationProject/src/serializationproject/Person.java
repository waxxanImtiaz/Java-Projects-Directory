package serializationproject;

import java.io.Serializable;
import java.util.NoSuchElementException;

public class Person implements Serializable {
    private  String name;
    private String cast;

    public Person()
    {
        this( "","" );
    }
    public Person( String name,String cast )
    {
        setName( name );
        setCast( cast );
    }
    
    public void setName( String name )
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setCast( String cast )
    {
        this.cast = cast;
    }
    public String getCast()
    {
        return cast;
    }
    
    @Override
    public String toString()
    {
        return String.format("\nname=%s,cast=%s\n", name,cast);
    }
    
}
