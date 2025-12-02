

package com.mycompany.pruebasacciones;


public class GestorDescuentos {

    public static  int calcularDescuento(Cliente c){
        if(c.getAntiguedad() > 5){
            return 10; 
        }else{
            return 0; 
        }
    }
    
}
