package Servicios;

import java.util.Scanner;
import Entidades.Ahorcado;

public class AhorcadoService {
    
    //  Atributo de la clase service

        Scanner entrada = new Scanner(System.in);

    //  CONSTRUCTOR

        public AhorcadoService() {
        }
    
    //  MÉTODOS PERSONALIZADOS DEL SERVICIO

        public Ahorcado crearJuego() {
            
            System.out.println("------CREANDO NUEVO JUEGO AHORCADO------");
            System.out.println("");
            System.out.println("Ingrese la PALABRA A ADIVINAR");
            String palabra = entrada.nextLine();
            System.out.println("");
            System.out.println("Ingrese la CANTIDAD DE INTENTOS que se van a tener para adivinar la palabra");
            int numeroIntentos = entrada.nextInt();
            
            // Realizamos la asignacion de la longitud de la palabra a una variable
            int longitudPalabra = palabra.length();

            //Definimos un vector para cargar la palabra con la longitud de la misma
            String[] palabraBuscar = new String[longitudPalabra];

            // Valuamos el vector con las letras de la palabra
            for (int i = 1; i < palabra.length() + 1 ; i++) {
                
                palabraBuscar[i-1] = palabra.substring(i-1, i);

            }

            return new Ahorcado(palabraBuscar, longitudPalabra, numeroIntentos);
            
        }

        public int longitud( Ahorcado juego ) {
            
            return juego.getPalabraBuscar().length;

        }

        // **************************************************************************************************************
        
        public String buscarLetra( Ahorcado juego , String letra ) {
            
            String mensaje;
            int contadorCoincidencia = 0;
            //  Creamos un vector auxiliar para asignar los valores del vector de la 'palabraBuscar'.
            String[] vectorAux = juego.getPalabraBuscar();

            // Recorremos el 'vectorAux' para verificar si existen o no coincidencia.
            for (int i = 0; i < juego.getLongitudPalabra() ; i++) {
                
                if ( letra.equalsIgnoreCase(vectorAux[i]) ) {
                    
                    contadorCoincidencia++;

                }

            }

            //  Asignamos un valor a 'mensaje' dependiendo si se encontraron o no coincidencias.
            if ( contadorCoincidencia >= 1 ) {
                
                mensaje = "La letra SI se encuentra en la palabra";

            } else {

                mensaje = "La letra NO se encuentra en la palabra";

            }

            return mensaje;

        }

        // **************************************************************************************************************

        public String encontradas( Ahorcado juego , String letra ) {
        
            int contadorCoincidencia = 0;
            
            //  Creamos un vector auxiliar para asignar los valores del vector de la 'palabraBuscar'.
            String[] vectorAux = juego.getPalabraBuscar();

            // Recorremos el 'vectorAux' para contar las veces de coincidencia y discrepancia.
            for (int i = 0; i < juego.getLongitudPalabra() ; i++) {
                
                if ( letra.equalsIgnoreCase(vectorAux[i]) ) {
                    
                    contadorCoincidencia++;

                }

            }

            juego.setCantidadDeLetrasEncontradas( contadorCoincidencia + contadorCoincidencia );
            juego.setCantidadDeLetrasRestantes( juego.getLongitudPalabra() - juego.getCantidadDeLetrasEncontradas() );

            //  Convertimos el 'int' a 'String'
            String cantidadDeEncontradas = String.valueOf( juego.getCantidadDeLetrasEncontradas() );
            String cantidadDeNoEncontradas = String.valueOf( juego.getCantidadDeLetrasRestantes() );

            return " ( " + cantidadDeEncontradas + " ; " + cantidadDeNoEncontradas + ")";

        }

        // **************************************************************************************************************

        public int intentos( Ahorcado juego ) {
            
            return juego.getCantidadDeIntentos();

        }

        // **************************************************************************************************************

        public void juego( ) {

            int contadorVueltas = 0;
            
            Ahorcado nuevoAhorcado = crearJuego();

            do {
                
                System.out.println("Ingrese una letra");
                String letra = entrada.next();

                System.out.println("------------------------------------------------------------------");

                System.out.println(" La longitud de la palabra es : {" + longitud(nuevoAhorcado) + "}" );

                System.out.println( " Mensaje : " + buscarLetra(nuevoAhorcado, letra) );

                System.out.println(" Numero de letras ( 'encontradas' ; 'faltantes' ) " + encontradas(nuevoAhorcado, letra) );

                System.out.println(" Numero de intentos faltantes " + (intentos(nuevoAhorcado) - contadorVueltas) );

                contadorVueltas++;

            } while ( contadorVueltas <= intentos(nuevoAhorcado) );

        }

}
