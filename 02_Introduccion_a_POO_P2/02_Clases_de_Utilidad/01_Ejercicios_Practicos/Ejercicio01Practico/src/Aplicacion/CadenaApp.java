package Aplicacion;

import java.util.Scanner;
import Entidades.Cadena;
import Servicios.CadenaServicios;

public class CadenaApp {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        //  Creamos un OBJETO de la clase 'CadenaServicios' para poder utilizar sus metodos.
        CadenaServicios objetoDeServicio = new CadenaServicios();

        //  Creamos un OBJETO de la clase 'Cadena' para poder cargar sus atributos a traves
        //  de la clase servicios
        Cadena cadena1;

        //  Asignamos los atributos a 'cadena1' a traves del metodo de 'insertarNuevaCadena' de
        //  la clase de 'CadenaServicios'
        cadena1 = objetoDeServicio.insertarNuevaCadena();

        // Utilizamos el metodo de 'mostrarVocales' para que nos diga la cantidad de vocales
        // que tiene el String que ingresamos.
        objetoDeServicio.mostrarVocales(cadena1);

        // Utilizamos el metodo de 'invertiFrase' para imprimir la frase ingresada al reves del
        // orden en que se ingresa.
        objetoDeServicio.invertirFrase(cadena1);

        // Le pedimos al usuario un caracter para buscarlo en la frase ingresada y contabilizar cuantas
        // veces se repite en la frase ingresada.
        System.out.println("");
        System.out.println("¿Que caracter desea buscar en la frase ingresada?");
        String caracter = entrada.nextLine();

        objetoDeServicio.vecesRepetido(cadena1, caracter);

        // Le pedimos al usuario una frase y comparamos la longitud de la misma con la frase ingresada
        // en el objeto 'cadena1'.
        System.out.println("");
        System.out.println("Ingrese una frase para comparar su longitud con la frase ingresada anteriormente");
        String frase = entrada.nextLine();

        objetoDeServicio.compararLongitud(cadena1, frase);

        //  Le pedimos al usuario que ingrese una letra que va a reemplazar a las letras 'a'
        //  de la frase ingresada al objeto.
        System.out.println("");
        System.out.println("Ingrese una letra para que reemplace a la letra 'a' en la frase del objeto");
        String letra1 = entrada.nextLine();

        objetoDeServicio.reemplazar(cadena1, letra1);

        //  Le pedimos al usuario que ingrese una letra para verificar si existe en la frase del objeto o no
        System.out.println("");
        System.out.println("Ingrese una letra para verificar si existe o no en la frase del objeto");
        String letra2 = entrada.nextLine();

        objetoDeServicio.contiene(cadena1, letra2);

        entrada.close();

    }

}
