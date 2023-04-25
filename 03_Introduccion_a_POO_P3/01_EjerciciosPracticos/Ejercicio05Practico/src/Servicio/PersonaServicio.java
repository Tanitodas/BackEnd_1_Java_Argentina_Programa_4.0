package Servicio;

import java.util.Date;
import java.util.Scanner;
import Entidades.PersonaClass;

public class PersonaServicio {
    
    // ATRIBUTOS DE LA CLASE

        Scanner entrada = new Scanner(System.in);

    // CONSTRUCTORES DE LA CLASE SERVICIO

        public PersonaServicio() {
        }

    //  MÉTODOS PERSONALIZADOS
        
        public PersonaClass crearPersona( ) {
            
            System.out.println("Ingrese el nombre de la persona");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese el DIA de la fecha de nacimiento de la persona");
            int dia = entrada.nextInt();

            System.out.println("Ingrese el MES de la fecha de nacimiento de la persona");
            int mes = entrada.nextInt();

            System.out.println("Ingrese el AÑO de la fecha de nacimiento de la persona");
            int año = entrada.nextInt();

            /*
			year - 1900 es requisito porque así está implementada la clase
			month - 1 es más de lo mismo: los mese van de 0 a 11
		    */
            Date fechaNacimiento = new Date(año-1900, mes-1, dia); // Creamos el objeto de tipo 'Date' con los datos ingresados para la fecha de nacimiento.

            return new PersonaClass(nombre, fechaNacimiento);

        }

        public int calcularEdadPersona( PersonaClass personaNueva ) {

            int edad;
            Date fechaActual = new Date(); // Este objeto nos dá la fecha de hoy.
            
            //Calculamos cuál sería la edad si la persona ya cumplió los años
            edad = fechaActual.getYear() - personaNueva.getFechaDeNacimiento().getYear();

            //Si el mes actual es menor que el de nacimiento, o si es el mismo pero lo que es menor es el día, se resta 1 a la edad (aún no cumplió años).
		    if ( ( fechaActual.getMonth() < personaNueva.getFechaDeNacimiento().getMonth() ) || ( (fechaActual.getMonth() == personaNueva.getFechaDeNacimiento().getMonth() ) && ( fechaActual.getDate() < personaNueva.getFechaDeNacimiento().getDate()) ) ) {
			    
                edad--;

		    }

            return edad;

        }

        public boolean menorQue( PersonaClass personaNueva ,  int edad ) {
            
            boolean menorQue;

            if ( calcularEdadPersona(personaNueva) < edad ) {
                
                menorQue = true;

                return menorQue;

            } else {

                menorQue = false;

                return menorQue;

            }

        }

        public void mostrarPersona( PersonaClass personaNueva ) {
            
            personaNueva.toString();

        }

}
