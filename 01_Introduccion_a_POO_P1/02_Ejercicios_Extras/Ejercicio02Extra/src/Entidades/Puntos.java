// Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
// atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
// usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
// en los atributos del objeto. Después, a través de otro método calcular y devolver la
// distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
// como calcular la distancia entre dos puntos consulte el siguiente link:
// http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

package Entidades;

import java.util.Scanner;

public class Puntos {
    
    //  ATRIBUTOS
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    //  CONSTRUCCTORES
        // Constructor vacio
        public Puntos() {
        }

        // Constructor con parametros
        public Puntos(int x1, int x2 , int y1 , int y2) {

            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            
        }

    //  METODOS PERSONALIZADOS
        
        // Metodo para crear un punto.
        public void crearPuntos() {
            
            Scanner entrada = new Scanner(System.in);

            System.out.println("----Ingrese las coordenadas del 1er Punto----");
            System.out.println("Ingrese la coordenada 'x1' ");
            this.x1 = entrada.nextInt();
            System.out.println("Ingrese la coordenada 'y1' ");
            this.y1 = entrada.nextInt();

            System.out.println("----Ingrese las coordenadas del 2do Punto----");
            System.out.println("Ingrese la coordenada 'x2' ");
            this.x2 = entrada.nextInt();
            System.out.println("Ingrese la coordenada 'y2' ");
            this.y2 = entrada.nextInt();

            entrada.close();

        }

        // Metodo para calcular la distancia entre las coordenadas de los dos puntos.
        public double calcularDistancia() {
            
            double distanciaEntrePuntos;

            distanciaEntrePuntos = Math.sqrt( Math.pow( ( x2 - x1 ) , 2 ) + Math.pow( ( y2 - y1 ) , 2) );

            return distanciaEntrePuntos;

        }


}
