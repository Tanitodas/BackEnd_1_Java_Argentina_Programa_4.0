package Servicios;

import java.util.Scanner;
import Entidades.Clase;

public class ClaseServicios {
    
    //  ATRIBUTOS DE LA CLASE DE SERVICIOS

        Scanner entrada = new Scanner(System.in);

    //  CONSTRUCTOR DE LA CLASE SERVICIO    

        public ClaseServicios() {
        }

    //  MÉTODOS PERSONALIZADOS DE LA CLASE SERVICIO
        
        // Creamos un metodo para asignar un mes aleatorio al atributo 'mesSecreto'
        public void asignacionMesAleatorio( Clase clase ) {

            String[] arregloDeLosMeses = clase.getArregloDeMeses();
            int j = (int) (Math.random() * 12);

            for ( int i = 0; i < arregloDeLosMeses.length; i++) {
                
                if ( i == j ) {
                    
                    clase.setMesSecreto( arregloDeLosMeses[i] );

                }

            }

        }
    
}
