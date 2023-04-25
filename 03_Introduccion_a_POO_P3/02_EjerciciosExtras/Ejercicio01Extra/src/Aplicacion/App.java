import java.util.Scanner;

import Entidades.Clase;
import Servicios.ClaseServicios;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        //  Instanciamos la 'ClaseServicios' para utilizar el metodo de esa clase
        ClaseServicios objetoDeServicios = new ClaseServicios();

        //  Instanciamos la 'Clase'
        Clase objeto1 = new Clase();

        // Utilizamos el método de la clase de servicio para asignar un 'mesSecreto'
        // de manera aleatoria al 'objeto1' de tipo 'Clase'.
        objetoDeServicios.asignacionMesAleatorio( objeto1 );

        String mesAdivinador;

        do {
            
            // Le pedimos al usuario que adivine el 'mesSecreto'.
            System.out.println("Ingrese el mes que piensa que es el 'mesSecreto' (ingresar el mes en MINUSCULAS) " );
            mesAdivinador = entrada.nextLine();

            if ( mesAdivinador.equals( objeto1.getMesSecreto() )) {
                System.out.println("Ha acertado!!");
            } else {

                System.out.println("Ha ingreado un mes incorrecto :c");
                System.out.println("Vuelva a intentarlo");

            }

        } while ( !mesAdivinador.equals( objeto1.getMesSecreto() ) );

        entrada.close();

    }

}
