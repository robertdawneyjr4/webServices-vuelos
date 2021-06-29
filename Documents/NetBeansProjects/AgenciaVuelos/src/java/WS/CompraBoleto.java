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

    
    @WebMethod(operationName = "boletos")
    public int boletos(@WebParam(name = "tipo") String tipor, @WebParam(name = "hora") String hora, @WebParam(name = "fPago") String fPago, @WebParam(name = "nombre") String nombre, @WebParam(name = "telefono") String telefono, @WebParam(name = "correo") String correo, @WebParam(name = "fecha") String fecha, @WebParam(name = "precio") int precio) {
        int multi=0;
        if(tipor.equals("Ligero")){
                      
          for(int i=0; i<=precio;i++){
             multi= 500*i;
          }
           return multi ;
        }
        
        
        
          if(tipor.equals("Extra")){
              for(int i=0; i<=precio;i++){
             multi= 1000*i;
          }
               return multi;
          }    
          else{
               return -1;
          }  
     
                 
    }

   
}
