/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcomecontroller;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
@WebService()
public class WelcomeSoap {
    @WebMethod(operationName="welcome")
    public String welcome(@WebParam(name="name")String name)
    {
        return "Assalam o Alaikum my name is Imtiaz Ali";
    }

}
