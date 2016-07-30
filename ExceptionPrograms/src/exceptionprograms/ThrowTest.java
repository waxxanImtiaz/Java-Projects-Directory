package exceptionprograms;

public class ThrowTest extends RuntimeException {
 
    public static native void x();
    static {
    System.loadLibrary("Happy");
    }
   
    public static void main(String[] args) throws ThrowTest {
       // throw new ArithmeticException("Division by zero");
        /*
        Object o = new Object();
        
        String s = (String)o; CE: ClassCastException will occur here
        */
        /*
        Object o = new String("Imtiaz");
        String s = (String)o; 'it is a valid casting'
        */
        System.out.println("imtiaz");
        throw new ArithmeticException("arthmatic");
    }
}
