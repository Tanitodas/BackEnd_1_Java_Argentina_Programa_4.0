// Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
// FechaService, en paquete Servicios, que tenga los siguientes métodos:
//
//      a) Método fechaNacimiento que pregunte al usuario día, mes y año de
//         su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//         El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
//         new Date(anio, mes, dia);
//
//      b) Método fechaActual que cree un objeto fecha con el día actual. Para
//         esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//         fechaActual = new Date();
//         El método debe retornar el objeto Date.
//
//      c) Método diferencia que reciba las dos fechas por parámetro y retorna
//         la diferencia de años entre una y otra (edad del usuario).
// 
// Si necesiten acá tienen más información en clase Date: Documentacion
// Oracle

package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicios {
    
    //  ATRIBUTOS

        Scanner entrada = new Scanner(System.in);

    //  CONSTRUCTOR VACIO

        public FechaServicios() {
        }

    //  MÉTODOS PERSONALIZADOS

        public Date fechaNacimiento( ) {
            
            System.out.println("Ingrese el AÑO de la fecha de su cumpleaños");
            int year = entrada.nextInt();

            System.out.println("Ingrese el MES de la fecha de su cumpleaños");
            int month = entrada.nextInt();

            System.out.println("Ingrese el DIA de la fecha de su cumpleaños");
            int day = entrada.nextInt();

            return new Date(year-1900, month - 1, day);

        }

        public Date fechaActual() {

            return new Date();

        }

        public void diferencia( Date fechaActual , Date fechaNacimiento ) {
            
            int edad = fechaActual.getYear() - fechaNacimiento.getYear();

            System.out.println("La edad del usuario es igual a: " + edad);

        }

}
