package Aplicacion;

// Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
// arreglo B de 20 números reales. Crear la clase ArregloService, en el
// paquete servicio, con los siguientes métodos:
//
//      - Método inicializarA recibe un arreglo por parámetro y lo inicializa con
//        números aleatorios.
//
//      - Método mostrar recibe un arreglo por parámetro y lo muestra por
//        pantalla.
//
//      - Método ordenar recibe un arreglo por parámetro y lo ordena de
//        mayor a menor.
//
//      - Método inicializarB copia los primeros 10 números del arreglo A en el
//        arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
//
// En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
// mostrar A y B.

import java.util.Arrays;
import Servicios.ArregloServicio;

public class ArregloApp {
    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        ArregloServicio objetoDeServicio = new ArregloServicio();

        System.out.println("----------Inicializamos arregloA----------");
        objetoDeServicio.inicializarArrayA(arregloA);
        System.out.println("");

        System.out.println("----------Mostramos arregloA----------");
        objetoDeServicio.mostrarArray(arregloA);
        System.out.println("");

        System.out.println("---El vector 'arregloA' ordenado de mayor a menor es igual a:---");
        objetoDeServicio.ordenarArray(arregloA);
        System.out.println("");

        System.out.println("----------Inicializamos arregloB----------");
        arregloB = objetoDeServicio.inicializarB(arregloA);
        System.out.println("");

        System.out.println("----------Mostramos arregloA----------");
        System.out.println( Arrays.toString( arregloA ) );
        System.out.println("");

        System.out.println("----------Mostramos arregloB----------");
        System.out.println( Arrays.toString( arregloB ) );
        System.out.println("");

    }
}
