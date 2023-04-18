// Programa Nespresso. Desarrolle una clase Cafetera con los atributos
// capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
// cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
// menos, los siguientes métodos:
//
//     • Constructor predeterminado o vacío
//
//     • Constructor con la capacidad máxima y la cantidad actual.
//
//     • Métodos getters y setters.
//
//     • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//       máxima.
//
//     • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//       tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//       cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//       método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//       cuanto quedó la taza.
//
//     • Método vaciarCafetera(): pone la cantidad de café actual en cero.
//
//     • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//       recibe y se añade a la cafetera la cantidad de café indicada.

package NepressoServicio;

import java.util.Scanner;
import Entidades.NespressoClass;

public class NespressoServicios {
    
    //  ATRIBUTOS DE LA CLASE SERVICIOS

        // Asignamos al Scanner como atributo de la clase para tenerlo como clase global
        // y poder utilizarla en los diferentes metodos.
        Scanner entrada = new Scanner(System.in);

    //  CONSTRUCCTOR EN LA CLASE SERVICIOS

        // Este constructor nos va a permitir crear un metodo que nos devuelva un OBJETO
        // de tipo NespressoClass.

        public NespressoClass crearCafetereNespresso() {

            System.out.println("Ingrese la capacidad maxima de la cafetera");
            double capacidadMaxima = entrada.nextDouble();

            System.out.println("Ingrese la cantidad actual de cafe de la cafetera");
            double cantidadActual = entrada.nextDouble();

            entrada.nextLine(); // Limpiamos el buffer

            // En esta linea devolvemos la construccion de un Objeto de tipo Cuenta con el constructor
            // que utiliza parametros.
            return new NespressoClass( capacidadMaxima, cantidadActual );

        }

    // METODOS PERSONALIZADOS

        //  Metodo para llenar la cafetera.
        public void llenarCafetera( NespressoClass nuevaCafetera ) {
            
            nuevaCafetera.setCantidadActual( nuevaCafetera.getCapacidadMaxima() );

        }
    
    //  Metodo para servir la taza.

        public void servirTaza( NespressoClass nuevaCafetera ) {
            
            String tamanioTaza;
            double tazaVacia = 0.0;

            System.out.println("Ingrese tamaño de la taza( CHICA/MEDIANA/GRANDE )");
            tamanioTaza = entrada.nextLine();

            if ( tamanioTaza.equalsIgnoreCase( "CHICA" ) ) {

                // Este cantidad es igual al espacio disponible para llenar.
                // fue un valor supuesto y esta expresado en 'l' (litros)
                tazaVacia = 0.250; 
                
            } else if ( tamanioTaza.equalsIgnoreCase( "MEDIANA" ) ) {

                // Este cantidad es igual al espacio disponible para llenar.
                // fue un valor supuesto y esta expresado en 'l' (litros)
                tazaVacia = 0.350; 

            } else if ( tamanioTaza.equalsIgnoreCase( "GRANDE" ) ) {

                // Este cantidad es igual al espacio disponible para llenar.
                // fue un valor supuesto y esta expresado en 'l' (litros)
                tazaVacia = 0.450;

            } else {

                while ( !tamanioTaza.equalsIgnoreCase( "CHICA" ) && !tamanioTaza.equalsIgnoreCase( "MEDIANA" ) && !tamanioTaza.equalsIgnoreCase( "GRANDE" ) ) {

                    System.out.println("Ingreso un tamaño de taza no existente");
                    System.out.println("");
                    System.out.println("Intentelo de nuevo");
                    tamanioTaza = entrada.nextLine();

                    entrada.nextLine(); // Limpiamos el buffer

                }

            }

            if ( nuevaCafetera.getCantidadActual() > 0.0 && nuevaCafetera.getCantidadActual() >= tazaVacia ) {
                
                System.out.println("Llenando taza");
                nuevaCafetera.setCantidadActual( nuevaCafetera.getCantidadActual() - tazaVacia );

            } else if ( nuevaCafetera.getCantidadActual() > 0.0 && nuevaCafetera.getCantidadActual() < tazaVacia ) {

                System.out.println("La cantidad de cafe disponible no alcanza para llenar totalmente la taza");
                System.out.println("");
                System.out.println("La cantidad de cafe disponible es: " + nuevaCafetera.getCantidadActual() );
                System.out.println("");
                System.out.println("La taza se llenará con: " + nuevaCafetera.getCantidadActual() );
                System.out.println("La taza no se llenó");

            }
            
        }

    //  Método para vaciar la cafetera.

        public void vaciarCafetera( NespressoClass nuevaCafetera ) {
            
            System.out.println("Vaciamos la cafetera.");
            nuevaCafetera.setCantidadActual(0);

        }

    //  Método para agregar el cafe.
        
        public void agregarCafé( NespressoClass nuevaCafetera , int cantidadDeCafeAgregar ) {

            nuevaCafetera.setCantidadActual( nuevaCafetera.getCantidadActual() + cantidadDeCafeAgregar );
        
        }

}
