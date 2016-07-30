
package exceptionprograms;

public class ErrorTest {
    public static void main( String[] args )
    {
        try{
        System.out.println("Error test");
        throw new Error("imtiaz");
            /* because errors are unchecked*/
        }catch( Error e){
            {
                System.out.println(e.getMessage());
            }
            }
        
    }
}
