package NepressoAplicacion;

import Entidades.NespressoClass;
import NepressoServicio.NespressoServicios;

//  Ponemos en practica los metodos de la clase servicios para probar si funcionan
//  bien todos ellos.

public class NespressoApp {
    public static void main(String[] args) {
        
        // Instanciamos un OBJETO de la clase 'NespressoServicio' para asi poder unir el 
        // package 'Servicios' con el 'main'.
        NespressoServicios objetoDeServicio = new NespressoServicios();

        // Ahora vamos a crear un OBJETO 'cafetera1' pero a traves del metodo de que
        // se encuentra en la clase 'NespressoServicio'

            // Creamos una variable de tipo 'NespressoClass' que va a almacenar
            // al OBJETO que nos devuelve el metodo 'crearCafeteraNespresso' de la clase 'NespressoServicio'
            NespressoClass cafetera1;

            // Asignamos el objeto a la variable 'cafetera1'
            cafetera1 = objetoDeServicio.crearCafetereNespresso();

        //  Imprimimos los atributos del OBJETO 'cafetera1' para verificar si se asignaron
        //  correctamente los valores de los atributos al objeto.
            System.out.println( cafetera1.toString() );

        //  Aplicamos los metodos de servicio para verificar las aplicaciones.
            
            // Añadimos 3 Lt de cafe a la cafetera.
            objetoDeServicio.agregarCafé(cafetera1, 3);

            // Imprimimos los atributos de la cafetera
            System.out.println("-----Añadimos 3 lt de cafe-----");
            System.out.println( cafetera1.toString() );

            //  Servimos una taza de cafe desde la cafetera1.
            System.out.println("---Servimos una taza---");
            objetoDeServicio.servirTaza(cafetera1);

            //  Imprimimos los atributos de la cafetera.
            System.out.println("-----Atributos despues de servir una taza-----");
            System.out.println( cafetera1.toString() );

            //  Llenamos la cafetera
            System.out.println("---Llenamos la cafetera---");
            objetoDeServicio.llenarCafetera(cafetera1);

            //  Imprimimos los atributos de la cafetera.
            System.out.println("-----Atributos despues de llenar la cafetera-----");
            System.out.println( cafetera1.toString() );

            //  Vaciamos la cafetera.
            System.out.println("---Vaciamos la cafetera---");
            objetoDeServicio.vaciarCafetera(cafetera1);

            //  Imprimimos los atributos de la cafetera.
            System.out.println("-----Atributos despues de vaciar la cafetera-----");
            System.out.println( cafetera1.toString() );

    }
    
}
