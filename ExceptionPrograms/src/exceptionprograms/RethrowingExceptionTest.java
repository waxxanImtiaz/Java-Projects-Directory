package exceptionprograms;

/**
 To convert one exception type to another is called exception rethrowing..
 * and we can use this to convert one exception to another exception type
 * 
 */
public class RethrowingExceptionTest {
    public static void main( String[] args)
    {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e)
        {
            throw new NullPointerException();
        }
    }
}
