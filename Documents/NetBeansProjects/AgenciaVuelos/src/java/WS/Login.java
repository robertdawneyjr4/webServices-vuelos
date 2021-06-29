/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author lizbe
 */
@WebService(serviceName = "Login")
public class Login {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") String contraseña) {
       if(usuario.equals("liz") && contraseña.equals("12345")){
            return true;
        }else
        {
            return false;
        }
    }
   
}
