/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionprograms;

/**
 *
 * @author waxxan
 */
public class ClassCastExceptionTest {
    public static void main( String[] args )
    {
        Object o = new Object();
        String s = (String)o;//ClassCastException
    }
}
