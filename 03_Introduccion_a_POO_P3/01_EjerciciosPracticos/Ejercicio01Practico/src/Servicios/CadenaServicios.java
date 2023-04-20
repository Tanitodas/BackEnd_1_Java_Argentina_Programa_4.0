package Servicios;

// Realizar una clase llamada Cadena, en el paquete de entidades, que
// tenga como atributos una frase (String) y su longitud. Agregar
// constructor vacío y con atributo frase solamente. Agregar getters y
// setters. El constructor con frase como atributo debe setear la longitud
// de la frase de manera automática. Crear una clase CadenaServicio en el
// paquete servicios que implemente los siguientes métodos:
//
//      a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
//         que tiene la frase ingresada.
//
//      b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
//         por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
//         asac".
//
//      c) Método vecesRepetido(String letra), recibirá un carácter ingresado
//         por el usuario y contabilizar cuántas veces se repite el carácter en la
//         frase, por ejemplo:
//         
//         Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
//         veces.
//
//      e) Método compararLongitud(String frase), deberá comparar la longitud
//         de la frase que compone la clase con otra nueva frase ingresada por
//         el usuario.
//
//      f) Método unirFrases(String frase), deberá unir la frase contenida en la
//         clase Cadena con una nueva frase ingresada por el usuario y mostrar
//         la frase resultante.
//
//      g) Método reemplazar(String letra), deberá reemplazar todas las letras
//         “a” que se encuentren en la frase, por algún otro carácter
//          seleccionado por el usuario y mostrar la frase resultante.
//
//      h) Método contiene(String letra), deberá comprobar si la frase contiene
//         una letra que ingresa el usuario y devuelve verdadero si la contiene y
//         falso si no.

import java.util.Scanner;
import Entidades.CadenaClass;

public class CadenaServicios {
    
    //  ATRIBUTOS

        Scanner entrada = new Scanner(System.in);

    //  CONSTRUCTOR de la clase servicio

        //  Constructor CadenaServicios vacio
        public CadenaServicios() {
        }

        //  Constructor para crear un objeto de la clase 'Cadena'
        public CadenaClass insertarNuevaCadena() {

            String frase;

            System.out.println("Ingrese la frase que quiere asignar al nuevo objeto");
            frase = entrada.nextLine();

            return new CadenaClass(frase);

        }
            
    //  MÉTODOS PERSONALIZADOS

        public void mostrarVocales( CadenaClass nuevaCadena ) {
            
            int contadorVocales = 0;
            String letra;

            for (int i = 1; i < nuevaCadena.getLongitud() + 1 ; i++) {
                
                letra = nuevaCadena.getFrase().substring( i-1 , i );
            
                if ( "A".equalsIgnoreCase(letra) || "E".equalsIgnoreCase(letra) || "I".equalsIgnoreCase(letra) || "O".equalsIgnoreCase(letra) || "U".equals(letra) ) {
                    contadorVocales++;
                }

            }

            System.out.println("La cantidad de vocales que tiene {" + nuevaCadena.getFrase() + "} es igual a: [" + contadorVocales + "]" );

        }

        public void invertirFrase( CadenaClass nuevaCadena ) {
            
            // Creamos un arrays en donde vamos a almacenar los caracteres de la frase.
            String[] vectorFrase = new String[nuevaCadena.getLongitud()];

            // Asignamos los caracteres de la frase a cada espacion dentro del vector

            for (int i = 1; i < vectorFrase.length + 1 ; i++) {
                
                vectorFrase[i-1] = nuevaCadena.getFrase().substring( i-1 , i );

            }

            System.out.println("La frase ingresada escrita al reves es:");
            for (int i = vectorFrase.length ; i > 0; i--) {
                
                System.out.print( vectorFrase[i-1] + " " );

            }

        }

        public void vecesRepetido( CadenaClass nuevaCadena ,  String caracter ) {
            
            String letra;
            int contadorRepetidas = 0;

            for (int i = 1; i < nuevaCadena.getLongitud() + 1 ; i++) {
                
                letra = nuevaCadena.getFrase().substring( i-1 , i );
            
                if ( letra.equalsIgnoreCase( caracter ) ) {
                    contadorRepetidas++;
                }

            }

            System.out.println(" La cantidad de veces repetidas el caracter [" + caracter + "] es igual a: [" + contadorRepetidas + "]" );

        }

        public void compararLongitud( CadenaClass nuevaCadena , String frase ) {
            
            System.out.println("La longitud de la frase {" + nuevaCadena.getFrase() + "} es igual a: [" + nuevaCadena.getLongitud() + "]");
            System.out.println("La longitud de la frase ingresada {" + frase + "} es igual a: [" + frase.length() + "]");

        }

        public void unirFrases( CadenaClass nuevaCadena , String frase ) {
            
            System.out.println(" Las frases unidas son las siguientes: ");
            System.out.println( nuevaCadena.getFrase() + " " + frase );

        }

        public void reemplazar( CadenaClass nuevaCadena ,  String letraIngresada ) {
            
            String letraDeFrase;
            String[] fraseDespuesDeReemplazar = new String[ nuevaCadena.getLongitud() ];

            for (int i = 1; i < nuevaCadena.getLongitud() + 1 ; i++) {

                letraDeFrase = nuevaCadena.getFrase().substring( i-1 , i );
            
                if ( letraDeFrase.equalsIgnoreCase("A") ) {
                    
                    fraseDespuesDeReemplazar[ i - 1 ]  = letraIngresada;

                } else {

                    fraseDespuesDeReemplazar[ i - 1 ]  = nuevaCadena.getFrase().substring( i-1 , i );

                }

            }

            System.out.println("La frase despues de reemplazar la letra {a} por la que ingreso el usuario, que es: {" + letraIngresada + "}.");
            System.out.println("Es igual a : " );
            for (int i = 0; i < fraseDespuesDeReemplazar.length; i++) {
                System.out.print(fraseDespuesDeReemplazar[i]);
            }

        }

        public void contiene( CadenaClass nuevaCadena , String caracter ) {
            
            String letra;
            boolean tieneLaLetra = false;
    
            for (int i = 1; i < nuevaCadena.getLongitud() + 1 ; i++) {
                    
                letra = nuevaCadena.getFrase().substring( i-1 , i );
                
                if ( letra.equalsIgnoreCase( caracter ) ) {
                    tieneLaLetra = true;
                }
    
            }
    
            System.out.println(" El caracter [" + caracter + "] existe en la frase [" + tieneLaLetra + "]" );
    
        }

}
