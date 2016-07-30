/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionprograms;


public class NativeMethodCode {
        
    public static native void printText();
    static {
    System.loadLibrary("happy");
    }
   
    public static void main(String[] args) {
        Happy happy = new Happy();
        happy.printText();
        
    }
}
class Happy{
    public native void printText();
    static{
        System.loadLibrary("happy");
    }
}