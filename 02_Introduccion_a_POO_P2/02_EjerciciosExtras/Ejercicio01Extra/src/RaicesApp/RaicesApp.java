package RaicesApp;

import RaicesEntidades.RaicesClass;
import RaicesServicio.RaicesServicio;

public class RaicesApp {
    public static void main(String[] args) {
        
        // Instanciamos un OBJETO de la clase 'RaicesServicio' para asi poder unir el 
        // package 'Servicios' con el 'main'.
        RaicesServicio objetoDeServicio = new RaicesServicio();

        // Ahora vamos a crear un OBJETO 'ecuacion1' pero a traves del metodo de que
        // se encuentra en la clase 'RaicesServicio'

            // Primero creamos una variable de tipo 'RaicesClass' que va a almacenar
            // al OBJETO que nos devuelve el metodo 'crearNuevaEcuacion' de la clase 'RaicesServicio'
            RaicesClass ecuacion1;

            // Asignamos el objeto a la variable 'cafetera1'
            ecuacion1 = objetoDeServicio.crearNuevaEcuacion();

        // Creamos una variable llamada 'discriminante' para almacenar el valor de la funcion
        // que nos va a dar la funcion en la clase 'RaicesServicio' que nos calcula el determinante
        // de la 'ecuacion1'.
        
        double discriminante = objetoDeServicio.getDiscriminante(ecuacion1);
        
        if (discriminante == 0) {
            
            objetoDeServicio.tieneRaiz(ecuacion1);
            objetoDeServicio.tieneRaiz(ecuacion1);
            
        } else if ( discriminante > 0 ) {

            objetoDeServicio.tieneRaices(ecuacion1);
            objetoDeServicio.obtenerRaices(ecuacion1);
            
        } else {

            System.out.println("La ecuacion no tiene solucion REAL");

        }
       
    }
}
