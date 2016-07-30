package serializationproject;

import java.io.*;

public class Animal implements Serializable {
    private transient String animalName;
    
    public Animal()
    {
        this( "" );
    }
    public Animal( String animalName )
    {
        setAnimalName( animalName );
    }
    public void setAnimalName( String animalName )
    {
        this.animalName = animalName;
    }
    public String getAnimalName()
    {
        return animalName;
    }
}//end of class
