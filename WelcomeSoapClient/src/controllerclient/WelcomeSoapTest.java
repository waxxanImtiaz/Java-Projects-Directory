/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerclient;

import controllerclient.WelcomeSoap;
import controllerclient.WelcomeSoapService;
    
public class WelcomeSoapTest {
    private WelcomeSoap welcomeSoapProxy;
    public WelcomeSoapTest(){
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
}//end of class
