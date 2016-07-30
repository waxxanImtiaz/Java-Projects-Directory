/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionprograms;


public class StackOverflowErrorTest {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        m2();
    }
     public static void m2(){
        m1();
    }
}
