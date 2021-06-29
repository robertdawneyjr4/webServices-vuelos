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
@WebService(serviceName = "CompraBoleto")
public class CompraBoleto {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CompraBoleto")
    public String CompraBoleto(@WebParam(name = "tipo") String tipo, @WebParam(name = "hora") String hora, @WebParam(name = "pago") String pago) {
        //TODO write your implementation code here:
        return tipo+"  "+ hora+"  "+ pago;
    }

   
}
