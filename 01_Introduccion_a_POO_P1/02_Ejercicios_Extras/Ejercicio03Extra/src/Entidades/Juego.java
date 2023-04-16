// Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
// a dos jugadores jugar un juego de adivinanza de números. El primer
// jugador elige un número y el segundo jugador intenta adivinarlo. El
// segundo jugador tiene un número limitado de intentos y recibe una pista
// de "más alto" o "más bajo" después de cada intento. El juego termina
// cuando el segundo jugador adivina el número o se queda sin intentos.
// Registra el número de intentos necesarios para adivinar el número y el
// número de veces que cada jugador ha ganado.

package Entidades;

import java.util.Scanner;

public class Juego {
    
    //  ATRIBUTOS DE LA CLASE
        public int numeroAdivinar;
        public int numeroAdivinador;
        private int numIntentos;

    //  CONSTRUCTORES DE LA CLASE
    
        public Juego() {
        }

    //  METODOS GETTERS Y SETTERS
        public int getNumeroAdivinar() {
            return numeroAdivinar;
        }

        public void setNumeroAdivinar(int numeroAdivinar) {
            this.numeroAdivinar = numeroAdivinar;
        }

        public int getNumeroAdivinador() {
            return numeroAdivinador;
        }

        public void setNumeroAdivinador(int numeroAdivinador) {
            this.numeroAdivinador = numeroAdivinador;
        }

        public int getNumIntentos() {
            return numIntentos;
        }

        public void setNumIntentos(int numIntentos) {
            this.numIntentos = numIntentos;
        }

    //  MÉTODOS PERSONALIZADOS

        // Este bloque de codigo es un pseudo menu de inicio del juego
        // y , dependiendo de que elija uno de los jugadores , llama a un metodo
        // con la logica del juego o sino sale del mismo.
        public void iniciarJuego() {
            
            Scanner entrada = new Scanner(System.in);
            byte opcion;

            do {
                
                System.out.println("----------------------------------------");
                System.out.println("BIENVENIDOS AL JUEGO DEL ADIVINADOR");
                System.out.println("----------------------------------------");
                System.out.println("¿Desea iniciar el juego? ( 1 = SI ; 0 = NO )");
                opcion = entrada.nextByte();

                if ( opcion == 1 ) {
                    
                    aplicacionJuego();

                } else if ( opcion == 0 ) {

                    System.out.println("Que Lastima :c . No jugaremos");

                } else {

                    System.out.println(" ");
                    System.out.println("Ingresó una opcion incorrecta");
                    System.out.println(" ");

                }

            } while ( opcion != 1 && opcion != 0 );

            entrada.close();

        }

        //  En este metodo desarrollamos la logica del juego.
        public void aplicacionJuego() {
            
            Scanner entrada = new Scanner(System.in);

            boolean respuesta = true;

            do {

                System.out.println("----------------------------------------");
                System.out.println("JUEGO DEL ADIVINADOR INICIADO");
                System.out.println("----------------------------------------");
                System.out.println("Ingresa la cantidad de intentos para adivinar");
                this.numIntentos = entrada.nextInt();

                System.out.println("Jugador 1: Elige el número a adivinar");
                this.numeroAdivinar = entrada.nextInt();
                
                int contador = 1;
                
                do {
                    
                    System.out.println("Jugador 2: Ingrese un número para adivinar");
                    this.numeroAdivinador = entrada.nextInt();

                    if ( numeroAdivinador > numeroAdivinar ) {

                        System.out.println("Más bajo");

                    } else if ( numeroAdivinador < numeroAdivinar ) {

                        System.out.println("Más alto");

                    }

                    contador++;

                } while ( contador < numIntentos && numeroAdivinar != numeroAdivinador );
            
                if ( numeroAdivinar != numeroAdivinador ) {

                    System.out.println("No adivinaste :c");

                } else {

                    System.out.println("Adivinaste!!!");

                }

                System.out.println("¿Desea finalizar el juego? (SI para salir)");
                String respu = entrada.next();

                if (respu.equalsIgnoreCase("SI")) {

                    respuesta = false;

                }

            } while (respuesta);

            entrada.close();

        }
        
}
