package serializationproject;

import java.io.*;

public class Teacher implements Externalizable  {
    public  String name;
    public int id;
    
    //readExternal
    //writeExternal
    
    public Teacher()
    {
        System.out.println( "Default constructor" );
    }//end of default constructor
    
    public Teacher( String name, int id )
    {
        this.name = name;
        this.id = id;
    }//end of constructor
    @Override
    public void writeExternal( ObjectOutput out )
    throws IOException
    {
        out.writeObject( name );
        out.writeInt( id );
    }
    @Override
    public void readExternal( ObjectInput in )
    throws ClassNotFoundException,IOException
    {
        name = (String)in.readObject();
        id = in.readInt();
    }
}
