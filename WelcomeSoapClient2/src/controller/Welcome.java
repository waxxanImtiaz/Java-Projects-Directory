/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import welcomecontroller.WelcomeSoapService;
import welcomecontroller.WelcomeSoap;

public class Welcome {
    private WelcomeSoap welcomeSoapProxy;
    public Welcome(){
        try{
            WelcomeSoapService service = new WelcomeSoapService();
            welcomeSoapProxy = service.getWelcomeSoapPort();
        }catch(Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }//end of default constructor
    public void perfomAction(){
        String message = welcomeSoapProxy.welcome("Imtiaz Ali");
        System.out.println(message);
    }
}
