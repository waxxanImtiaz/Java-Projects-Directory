/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionprograms;


public class CreateOwnException {
    public static void main( String[] args )
    {
        int x = 27;

        
        if(x>60)
            throw new TooOldException( "Too old Exception" );
        else if( x<18 )
            throw new TooYoungException( "too young exception");
        else
            System.out.println("Age is ok");
    }
}

class TooOldException extends RuntimeException /*it is recommended to extend RtE*/
{
    TooOldException( String s )
    {
        super( s );
    }
    
}
class TooYoungException extends RuntimeException /*it is recommended to extend RtE*/
{
    TooYoungException( String s )
    {
        super( s );
    }
    
}
