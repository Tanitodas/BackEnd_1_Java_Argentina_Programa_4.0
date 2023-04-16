//  Ponemos en practica la clase de circunferencia aunque no se pide en el ejercicio

import Entidades.Circunferencia;

public class CircunferenciaApp {

    public static void main(String[] args) {
        
        // Creamos un OBJETO de la clase circunferencia con el constructor vacio.
        Circunferencia circulo1 = new Circunferencia();

        // Creamos un OBJETO de la clase circunferencia con el constructor con parametros.
        Circunferencia circulo2 = new Circunferencia(5);

        // Imprimimos los ATRIBUTOS de ambos objetos a traves de los metodos getters

        System.out.println("");
        System.out.println("-------Circulo1--------");
        System.out.println("El radio del circulo es: " + circulo1.getRadio() );
        System.out.println("-------Circulo2--------");
        System.out.println("El radio del circulo es: " + circulo2.getRadio() );
        System.out.println("");

        // Imprimimos los valores de el perimetro y el area de las circunferencias

        circulo1.calcularArea();
        circulo2.calcularPerimetro();
        
        // Modificamos el radio del circulo1 con los setters.

        circulo1.setRadio(2.2);

        // Imprimimos los ATRIBUTOS de ambos objetos a traves de los metodos getters para ver la modificacion de radio en circ1

        System.out.println("");
        System.out.println("-------Circulo1--------");
        System.out.println("El radio del circulo es: " + circulo1.getRadio() );
        System.out.println("-------Circulo2--------");
        System.out.println("El radio del circulo es: " + circulo2.getRadio() );
        System.out.println("");

        // Imprimimos los valores de el perimetro y el area de las circunferencias nuevamente luego de la modificacion.

        circulo1.calcularArea();
        circulo2.calcularPerimetro();

    }

}
