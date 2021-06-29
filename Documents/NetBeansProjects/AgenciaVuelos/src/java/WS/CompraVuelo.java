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
@WebService(serviceName = "CompraVuelo")
public class CompraVuelo {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CompraVuelo")
    public String CompraVuelo(@WebParam(name = "origen") String origen, @WebParam(name = "destino") String destino, @WebParam(name = "fecha") String fecha, @WebParam(name = "personas") String personas, @WebParam(name = "tipo") String tipo) {
        //TODO write your implementation code here:
        return origen+" "+ destino+"  "+fecha+" "+personas+" "+tipo;
    }

    
}
