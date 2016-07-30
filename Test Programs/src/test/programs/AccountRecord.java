package test.programs;


public class AccountRecord {
    private String name;
    private int accNum;
   
    
    
    public AccountRecord()
    {
        this( "",0 );
    }
    public AccountRecord( String name,int accNum )
    {
        setName( name );
        setAccNum( accNum );
        
    }
    
    public void setName( String name )
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAccNum( int accNum )
    {
        this.accNum = accNum;
    }
    public int getAccNum()
    {
        return accNum;
    }
   
}//end of class AccountRecord
