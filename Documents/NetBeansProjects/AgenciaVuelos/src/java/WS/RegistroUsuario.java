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
@WebService(serviceName = "RegistroUsuario")
public class RegistroUsuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistroUser")
    public String RegistroUser(@WebParam(name = "nombre") String nombre, @WebParam(name = "telefono") String telefono, @WebParam(name = "correo") String correo, @WebParam(name = "fecha") String fecha, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        return nombre+" "+ telefono+" "+correo+"  "+fecha+"  "+password;
    }

    
}
