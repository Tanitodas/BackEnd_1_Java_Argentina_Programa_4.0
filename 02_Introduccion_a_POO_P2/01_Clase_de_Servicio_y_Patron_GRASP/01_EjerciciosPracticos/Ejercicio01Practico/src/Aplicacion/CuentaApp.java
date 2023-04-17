package Aplicacion;

import Entidades.CuentaClass;
import Servicio.CuentaServicios;


//  Realizamos unas pequeñas pruebas sobre el main para probar si todo funciona como lo esperamos.

public class CuentaApp {
    
    public static void main(String[] args) {
       
        // Vinculo el 'CuentaServicio' con el main a traves de la
        // creacion de este objeto de tipo 'CuentaServicio'.
        CuentaServicios objetoDeServicio = new CuentaServicios();

        // Ahora vamos a crear una cuenta pero a traves del metodo de que
        // se encuentra en la clase 'CuentaServicio'

            // Creamos una variable de tipo cuenta que va a almacenar
            // al objeto que nos devuelve el metodo 'crearCuenta' de la
            CuentaClass cuenta1;

            // Asignamos el objeto a la variable 'cuenta1'
            cuenta1 = objetoDeServicio.crearCuentaBancaria();

        // Imprimimos un 'toString' para ver los valores del objeto cuenta1.
           System.out.println(cuenta1.toString()); 

    }
}
