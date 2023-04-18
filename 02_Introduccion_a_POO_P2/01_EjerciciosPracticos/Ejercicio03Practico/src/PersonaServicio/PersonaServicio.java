package PersonaServicio;

// Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
// sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
// otro atributo, puede hacerlo. Los métodos que se implementarán son:
//      
//      • Un constructor por defecto.
//
//      • Un constructor con todos los atributos como parámetro.
//
//      • Métodos getters y setters de cada atributo.
//
//      • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//        al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//        Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//        O. Si no es correcto se deberá mostrar un mensaje
//
//      • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//        que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//        fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//        está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//        fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//        función devuelve un 1.
//
//      • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//        devuelve un booleano.
//
// A continuación, en la clase main hacer lo siguiente:
// Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
// los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
// tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
// persona es mayor de edad.
// Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
// en distintas variables, para después en el main, calcular un porcentaje de esas 4
// personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
// encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
// cuantos menores.

import java.util.Scanner;
import Entidades.PersonaClass;

public class PersonaServicio {
    
    //  ATRIBUTOS DE LA CLASE SERVICIOS

        // Asignamos al Scanner como atributo de la clase para tenerlo como clase global
        // y poder utilizarla en los diferentes metodos.
        Scanner entrada = new Scanner(System.in);

    //  CONSTRUCTOR DE LA CLASE SERVICIOS

        // Este constructor nos va a permitir crear un metodo que nos devuelva un OBJETO
        // de tipo PersonaClass.

        public PersonaClass crearPersona( ) {

            /*  No cerramos la 'escucha' del objeto 'entrada' ya que al querer utilizar nuevamente el metodo
            *  'crearPersona' nos arroja el siguiente error:
            * 
            *      Exception in thread "main" java.util.NoSuchElementException: No line found
            *      at java.base/java.util.Scanner.nextLine(Scanner.java:1651)
            *      at Entidades.Persona.crearPersona(Persona.java:126)
            *      at PersonaApp.main(PersonaApp.java:40)
            * 
            *  No encontre una solucion posible para este problema, ya que nos arroja una advertencia en la 
            *  creacion del objeto 'entrada'.
            */ 

            System.out.println("Ingrese el NOMBRE de la nueva persona");
            String nombrePersona = entrada.nextLine();

            System.out.println("Ingrese la EDAD de la nueva persona ( en Años )");
            int edad = entrada.nextInt();

            System.out.println("Ingrese la ALTURA de la nueva persona ( en Metros ) (Ingresar la ALTURA con ',') : ");
            double altura = entrada.nextDouble();

            System.out.println("Ingrese el PESO de la nueva persona ( en KG ) (Ingresar el PESO con ',') : ");
            double peso = entrada.nextDouble();

            String sexo;

            entrada.nextLine(); // Limpiamos el buffer.
            
            do {

                System.out.println("Ingrese el SEXO de la persona (M/H/O)");
                sexo = entrada.next();

                if ( sexo.equalsIgnoreCase("H") ) {
                    
                    sexo = "H";

                } else if ( sexo.equalsIgnoreCase("M") ) {

                    sexo = "M";

                } else if ( sexo.equalsIgnoreCase("O") ) {

                    sexo = "O";

                } else {

                    System.out.println("");
                    System.out.println("Ingresó una opcion no valida");
                    System.out.println("");

                }

            } while ( !sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O") );

            entrada.nextLine(); // Limpiamos el buffer.

            // En esta linea devolvemos la construccion de un Objeto de tipo Cuenta con el constructor
            // que utiliza parametros.
            return new PersonaClass(nombrePersona, edad, sexo, peso, altura);

        }

    //  METODOS PERSONALIZADOS DE LA CLASE SERVICIO

        //  Método para calcular el indice IMC
        public int calcularIMC( PersonaClass nuevaPersona ) {

            int valorIndiceIMC = -2; // Inicializamos la variable en -2 de manera aleatoria.
            double indiceIMC;

            indiceIMC =  nuevaPersona.getPeso() / ( nuevaPersona.getAltura() * nuevaPersona.getAltura() );

            if (indiceIMC < 20) {
                
                valorIndiceIMC = -1;
                
            } else if ( indiceIMC >= 20 && indiceIMC <= 25 ) {

                valorIndiceIMC = 0;

            } else if ( indiceIMC > 25 ) {

                valorIndiceIMC = 1;

            }

            return valorIndiceIMC;

        }

        //  Metodo para calcular si la persona es mayor de edad o no.
        public boolean esMayorDeEdad( PersonaClass nuevaPersona ) {
            
            boolean esMayorDeEdad = true; // Inicializamos la variable por error en 'return'

            if ( nuevaPersona.getEdad() >= 18 ) {

                esMayorDeEdad = true;

            } else if ( nuevaPersona.getEdad() < 18 ) {

                esMayorDeEdad = false;

            }

            return esMayorDeEdad;

        }

}
