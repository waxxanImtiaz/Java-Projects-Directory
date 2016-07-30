
package controller;


public class ConcreteClass {
    public static void main( String[] args )
    {
        Concrete obj = new Concrete();
    }
}
abstract class Concrete {
    
    public void print(){
        System.out.println("Concrete classs");
    }
}
