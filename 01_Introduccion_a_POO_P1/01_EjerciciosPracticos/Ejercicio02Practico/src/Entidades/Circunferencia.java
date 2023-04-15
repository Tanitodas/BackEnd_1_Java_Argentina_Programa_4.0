// Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
// de tipo real. A continuación, se deben crear los siguientes métodos:
//      a) Método constructor que inicialice el radio pasado como parámetro.
//      b) Métodos get y set para el atributo radio de la clase Circunferencia.
//      c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//         del objeto.
//      d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//      e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).

package Entidades;

import java.util.Scanner;

public class Circunferencia {
    
    // ATRIBUTOS DE LA CLASE
    private double radio;

    // CONSTRUCTORES de la clase
    
        // Constructor vacio
        public Circunferencia(){
        }

        // Constructor con radio como parametro
        public Circunferencia(double radio) {
            this.radio = radio;
        }

    // GETTERS y SETTERS 
        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }
    
    // METODOS PERSONALIZADOS de la clase 'Circunferencia'

        // metodo para asignar valor al atributo de circunferencia.
        public void crearCircunferencia(){

            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese el radio de la cirfunferencia: ");
            this.radio = entrada.nextDouble();

            entrada.close();

        }

        // metodo para calcular el area de la circunferencia.
        public void calcularArea() {

            double area = radio * 3.1415;
            System.out.println("El ÁREA de la circunferencia es: " + area);

        }

        // metodo para calcular el perimetro de la circunferencia.
        public void calcularPerimetro () {

            double perimetro = radio * 3.1415 * 2;
            System.out.println("El PERIMÉTRO de la circunferencia es: " + perimetro);

        }

}
