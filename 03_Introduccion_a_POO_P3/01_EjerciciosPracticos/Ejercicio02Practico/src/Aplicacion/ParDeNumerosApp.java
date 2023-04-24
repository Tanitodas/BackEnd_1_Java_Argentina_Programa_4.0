package Aplicacion;

import Entidades.ParDeNumerosClass;
import Servicios.ParDeNumerosServicios;

public class ParDeNumerosApp {
    public static void main(String[] args) {
        
        // Instanciamos la clase 'ParDeNumerosServicios'
        ParDeNumerosServicios objetoDeServicio = new ParDeNumerosServicios();

        // Instanciamos la clase 'ParDeNumerosClass' con valores aleatorios
        ParDeNumerosClass parDeNumeros1 = new ParDeNumerosClass();

        // Instanciamos la clase 'ParDeNumerosClass' con valores ingresados por nosotros
        ParDeNumerosClass parDeNumeros2 = new ParDeNumerosClass(6, 7.9);

        // Mostramos los valores de los dos objetos
        System.out.println("-----Mostramos los valores del objeto 1-----");
        objetoDeServicio.mostrarValores( parDeNumeros1 );

        System.out.println("-----Mostramos los valores del objeto 2-----");
        objetoDeServicio.mostrarValores( parDeNumeros2 );

        // Devolvemos cual es el valor maximo de los pares
        objetoDeServicio.devolverMayor(parDeNumeros1);

        objetoDeServicio.devolverMayor(parDeNumeros2);

        // Calculamos las potencias de los diferentes objetos
        objetoDeServicio.calcularPotencia(parDeNumeros1);

        objetoDeServicio.calcularPotencia(parDeNumeros2);

        // Calculamos las raices de los diferentes objetos.
        objetoDeServicio.calcularRaiz(parDeNumeros1);

        objetoDeServicio.calcularRaiz(parDeNumeros2);

    }
    
}
