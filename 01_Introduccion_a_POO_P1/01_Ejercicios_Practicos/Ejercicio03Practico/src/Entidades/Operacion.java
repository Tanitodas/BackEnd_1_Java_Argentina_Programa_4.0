// Crear una clase llamada Operacion que tenga como atributos privados numero1 y
// numero2. A continuación, se deben crear los siguientes métodos:
//
//      a) Método constructor con todos los atributos pasados por parámetro.
//
//      b) Metodo constructor sin los atributos pasados por parámetro.
//
//      c) Métodos get y set.
//
//      d) Método para crearOperacion(): que le pide al usuario los dos números y los
//         guarda en los atributos del objeto.
//
//      e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//
//      f) Método restar(): calcular la resta de los números y devolver el resultado al main.
//
//      g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
//         si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
//         error. Si no, se hace la multiplicación y se devuelve el resultado al main.
//
//      h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
//         pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//         error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//         al main.

package Entidades;

import java.util.Scanner;

public class Operacion {
    
    //  ATRIBUTOS DE LA CLASE
    private double numero1;
    private double numero2;
    
    //  CONSTRUCTORES
        
        //  Constructor vacio.
        public Operacion() {
        }

        //  Constructor con parametros.
        public Operacion(int numero1, int numero2) {

            this.numero1 = numero1;
            this.numero2 = numero2;

        }

    //  GETTERS y SETTERS 
        
        public double getNumero1() {
            return numero1;
        }

        public void setNumero1(int numero1) {
            this.numero1 = numero1;
        }

        public double getNumero2() {
            return numero2;
        }

        public void setNumero2(int numero2) {
            this.numero2 = numero2;
        }

    //  METODOS PERSONALIZADOS 
        
        // Método para inicializar una operacion. Le pide los numeros al usuario.
        public void crearOperacion() {

            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Ingrese el numero 1 para operar: ");
            this.numero1 = entrada.nextDouble();

            System.out.println("");
            System.out.println("Ingrese el numero 2 para operar: ");
            this.numero2 = entrada.nextDouble();

            entrada.close();

        }

        // Método para sumar los numeros.
        public void sumar() {

            double sumar = numero1 + numero2;

            System.out.println("La SUMA de los numeros es igual: " + sumar);

        }

        // Método para restar los numeros.
        public void restar() {

            double resta = numero1 - numero2;

            System.out.println("La RESTA de los numeros es igual: " + resta);

        }

        // Método para multiplicar los numeros.
        public void multiplicar() {

            if ( numero1 == 0 || numero2 == 0) {

                System.out.println("La MULTIPLICAION de los numeros es igual: 0 ");

            } else {

                double multiplicar = numero1 * numero2;

                System.out.println("La MULTIPLICAION de los numeros es igual: " + multiplicar);

            }

        }

        // Método para dividir los numeros.
        public void dividir() {

            if ( numero2 == 0) {

                System.out.println("La DIVICION de un numero por CERO no esta definida");
                
            } else if ( numero1 == 0 ) {

                System.out.println("La DIVICION de los numeros es igual: 0 ");

            } else {

                double dividir = numero1 / numero2;

                System.out.println("La DIVICION de los numeros es igual: " + dividir);

            }

        }

}
