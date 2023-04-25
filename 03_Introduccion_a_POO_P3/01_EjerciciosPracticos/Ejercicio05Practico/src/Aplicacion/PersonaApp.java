package Aplicacion;

import java.util.Scanner;

import Entidades.PersonaClass;
import Servicio.PersonaServicio;

public class PersonaApp {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        // Creamos una instancia de la clase servicios 'PersonaServicio'
        PersonaServicio objetoDeServicio = new PersonaServicio();

        // Creamos una instancia de la clase PersonaClass
        PersonaClass persona1 = new PersonaClass();

        // Valuamos la persona1 con los métodos de 'objetoDeServicio'
        persona1 = objetoDeServicio.crearPersona();

        // Calculamos la edad de la persona1
        int edad = objetoDeServicio.calcularEdadPersona(persona1);

        System.out.println("La edad de la persona es igual a: " + edad);

        // Verificamos si la persona es menor de cierta cantidad de años
        System.out.println("Ingrese la cantidad de años control");
        int anios = entrada.nextInt();

        boolean menorQue = objetoDeServicio.menorQue( persona1 , anios );

        System.out.println("La persona es menor que " + anios + "? : " + menorQue );

        // Mostramos los valores de los atributos que tiene la persona1
        objetoDeServicio.toString();

        entrada.close();

    }

}
