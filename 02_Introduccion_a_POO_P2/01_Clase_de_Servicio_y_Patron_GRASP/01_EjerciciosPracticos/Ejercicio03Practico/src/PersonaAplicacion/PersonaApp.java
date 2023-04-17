package PersonaAplicacion;
// A continuación, en la clase main hacer lo siguiente:
//
//      Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//      los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//      tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//      persona es mayor de edad.
//
//      Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
//      en distintas variables, para después en el main, calcular un porcentaje de esas 4
//      personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
//      encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
//      cuantos menores.

import Entidades.PersonaClass;
import PersonaServicio.PersonaServicio;

public class PersonaApp {
    public static void main(String[] args) {

        // Instanciamos un OBJETO de la clase 'PersonaServicio' para asi poder unir el 
        // package 'Servicios' con el 'main'.
        PersonaServicio objetoDeServicio = new PersonaServicio();
        
        PersonaClass persona1 ; // Creamos el primer OBJETO de la clase persona.
        PersonaClass persona2 ; // Creamos el segundo OBJETO de la clase persona.
        PersonaClass persona3 ; // Creamos el tercer OBJETO de la clase persona.
        PersonaClass persona4 ; // Creamos el cuarto OBJETO de la clase persona.

            //  Llenamos los atributos de 'persona1'.
            System.out.println("Ingrese los datos de la PERSONA 1");
            persona1 = objetoDeServicio.crearPersona();

            //  Llenamos los atributos de 'persona2'.
            System.out.println("Ingrese los datos de la PERSONA 2");
            persona2 = objetoDeServicio.crearPersona();

            //  Llenamos los atributos de 'persona3'
            System.out.println("Ingrese los datos de la PERSONA 3");
            persona3 = objetoDeServicio.crearPersona();

            //  Llenamos los atributos de 'persona4'
            System.out.println("Ingrese los datos de la PERSONA 4");
            persona4 = objetoDeServicio.crearPersona();

        //Imprimimos los valores de atributos de cada persona.
            
            //  Imprimimos el valor de los atributos de la persona 1
            System.out.println("----------Persona1----------");
            System.out.println( "El nombre es: " + persona1.getNombre() );
            System.out.println( "La edad es: " + persona1.getEdad() );
            System.out.println( "El peso es: " + persona1.getPeso() );
            System.out.println( "El sexo es: " + persona1.getSexo() );

            //  Imprimimos el valor de los atributos de la persona 2
            System.out.println("----------Persona2----------");
            System.out.println( "El nombre es: " + persona2.getNombre() );
            System.out.println( "La edad es: " + persona2.getEdad() );
            System.out.println( "El peso es: " + persona2.getPeso() );
            System.out.println( "El sexo es: " + persona2.getSexo() );

            //  Imprimimos el valor de los atributos de la persona 3
            System.out.println("----------Persona3----------");
            System.out.println( "El nombre es: " + persona3.getNombre() );
            System.out.println( "La edad es: " + persona3.getEdad() );
            System.out.println( "El peso es: " + persona3.getPeso() );
            System.out.println( "El sexo es: " + persona3.getSexo() );

            //  Imprimimos el valor de los atributos de la persona 4
            System.out.println("----------Persona4----------");
            System.out.println( "El nombre es: " + persona4.getNombre() );
            System.out.println( "La edad es: " + persona4.getEdad() );
            System.out.println( "El peso es: " + persona4.getPeso() );
            System.out.println( "El sexo es: " + persona4.getSexo() );


        // Llamamos al metodo para calcular el indice IMC de cada persona.

            int[] valorIndiceIMC = new int[4];

            System.out.println("Calculamos IMC de la PERSONA 1");
            valorIndiceIMC[0] = objetoDeServicio.calcularIMC(persona1);

            System.out.println("Calculamos IMC de la PERSONA 2");
            valorIndiceIMC[1] = objetoDeServicio.calcularIMC(persona2);

            System.out.println("Calculamos IMC de la PERSONA 3");
            valorIndiceIMC[2] = objetoDeServicio.calcularIMC(persona3);

            System.out.println("Calculamos IMC de la PERSONA 4");
            valorIndiceIMC[3] = objetoDeServicio.calcularIMC(persona4);

        // Llamamos al metodo 'esMayorDeEdad' para saber si los objetos personas son mayores de edad o no.

            boolean[] esMayorDeEdad = new boolean[4];

            System.out.println("Calculamos si la PERSONA 1 es o no mayor de edad");
            esMayorDeEdad[0] = objetoDeServicio.esMayorDeEdad(persona1);

            System.out.println("Calculamos si la PERSONA 2 es o no mayor de edad");
            esMayorDeEdad[1] = objetoDeServicio.esMayorDeEdad(persona2);

            System.out.println("Calculamos si la PERSONA 3 es o no mayor de edad");
            esMayorDeEdad[2] = objetoDeServicio.esMayorDeEdad(persona3);
            System.out.println("Calculamos si la PERSONA 4 es o no mayor de edad");
            esMayorDeEdad[3] = objetoDeServicio.esMayorDeEdad(persona4);

        // Realizamos un contador para despues poder decir cuantas personas son mayores de edad y cuantas estan en su peso ideal o no.

            double contPesoIdealPorDebajo = 0.0 , contPesoIdeal = 0.0 , contPesoIdealPorEncima = 0.0;

            for (int i = 0; i < valorIndiceIMC.length; i++) {
                
                if ( valorIndiceIMC[i] == -1 ) {
                    
                    contPesoIdealPorDebajo++;

                } else if ( valorIndiceIMC[i] == 0 ) {

                    contPesoIdeal++;

                } else if ( valorIndiceIMC[i] == 1 ) {

                    contPesoIdealPorEncima++;

                }

            }
        
        // Realizamos el contador para saber cuantas personas son mayores de edad y cuantas no.

            double mayorDeEdad = 0.0 ,  menorDeEdad = 0.0 ;

            for (int i = 0; i < esMayorDeEdad.length; i++) {
                    
                if ( esMayorDeEdad[i] ) {
                    
                    mayorDeEdad++;

                } else if ( !esMayorDeEdad[i] ) {

                    menorDeEdad++;

                }
            }

        // Escribimos por consola cuantas personas estan por debajo, en su peso , o por encima de su peso ideal
        // Tambien expresamos cuantas personas hay mayores y menores de edad.

        System.out.println("La CANTIDAD de personas que estan POR DEBAJO DE SU PESO IDEAL es: " + contPesoIdealPorDebajo);
        System.out.println("La CANTIDAD de personas que estan EN SU PESO IDEAL es: " + contPesoIdeal );
        System.out.println("La CANTIDAD de personas que estan POR ENCIMA DE SU PESO IDEAL es: " + contPesoIdealPorEncima);
        System.out.println("");
        System.out.println("La CANTIDAD de personas MAYORES DE EDAD es: " + mayorDeEdad);
        System.out.println("La CANTIDAD de personas MENORES DE EDAD es: " + menorDeEdad);

        //  Calculamos el porcentaje de lo anterior en base a la cantidad total de objetos.

        double porcentajePesoPorDebajo , porcentajePesoIdeal , porcentajePesoPorEncima;
        double porcentajeMayorEdad , porcentajeMenorEdad;

        porcentajePesoPorDebajo = ( contPesoIdealPorDebajo * 100 ) / 4;
        porcentajePesoIdeal = ( contPesoIdeal * 100 ) / 4;
        porcentajePesoPorEncima = ( contPesoIdealPorEncima * 100 ) / 4;
        porcentajeMayorEdad = ( mayorDeEdad * 100 ) / 4;
        porcentajeMenorEdad = ( menorDeEdad * 100 ) / 4;
        
        //  Imprimimos en cosola los porcentajes anteriormente calculados.
        System.out.println("El PORCENTAJE de personas que estan POR DEBAJO DE SU PESO IDEAL es: " + porcentajePesoPorDebajo);
        System.out.println("El PORCENTAJE de personas que estan EN SU PESO IDEAL es: " + porcentajePesoIdeal );
        System.out.println("El PORCENTAJE de personas que estan POR ENCIMA DE SU PESO IDEAL es: " + porcentajePesoPorEncima);
        System.out.println("");
        System.out.println("El PORCENTAJE de personas MAYORES DE EDAD es: " + porcentajeMayorEdad);
        System.out.println("El PORCENTAJE de personas MENORES DE EDAD es: " + porcentajeMenorEdad);

    }

}
