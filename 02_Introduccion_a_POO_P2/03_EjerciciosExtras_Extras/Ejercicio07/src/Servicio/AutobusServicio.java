package Servicio;

import java.util.Scanner;

import Entidades.Autobus;

//  Crear la clase “AutobúsServicio”, la misma contendrá los siguientes métodos:
//
//  - Método para crear un Autobús: se pedirá al usuario que ingrese los datos.
//
//  - Método inicioRecorrido(int cantidad), recibirá por parámetro la cantidad de personas que suben al
//    autobús en el inicio del recorrido. La misma no debe superar la capacidad máxima del autobús.
//
//  - Método finRecorrido(), debe simular la finalización del recorrido y por lo cual el autobús debe quedar vacío.
//
//  - Método subirPasajeros(int cantidad, int parada), recibe por parámetro la cantidad de personas a subir y el númerode parada.
//    En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada debe ejecutarse el 
//    método inicioRecorrido(int cantidad). En el caso que sea la última parada, debe informar al usuario que se encuentra
//    en la finalización del recorrido y no pueden subir más pasajeros.
//    Si el número de parada es distinto al número de inicio y de finalización, debe subir a los pasajeros 
//    indicados, analizando la capacidad actual y verificando que no sobrepase la capacidad máxima.
//    Solamente podrán subir pasajeros hasta cubrir la capacidad máxima.
//
//  - Método bajarPasajeros (int cantidad, int parada), recibe por parámetro la cantidad de personas a bajar del 
//    autobús y el número de paradas.
//    En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada, se debe 
//    informar al usuario que el autobús aún se encuentra vacío. En el caso que sea la última parada, se debe ejecutar 
//    el método finRecorrido().
//    Si el número de parada es distinto al número de inicio y de finalización, deben bajar los pasajeros indicados.


public class AutobusServicio {
    
    // Atributo global
    Scanner entrada = new Scanner(System.in);

    // Metodos personalizados

        public Autobus crearAutobus() {

            System.out.println("Ingrese identificacion de Autobus");
            int identificacion = entrada.nextInt();

            System.out.println("Ingrese la capacidad maxima del autobus");
            int capMax = entrada.nextInt();

            System.out.println("Ingrese la cantidad actual del autobus");
            int cantActual = entrada.nextInt();

            System.out.println("Ingrese la cantidad de paradas del recorrido");
            int cantParadas = entrada.nextInt();
            
            return new Autobus(identificacion, capMax, cantActual, cantParadas);
            
        }

        public void inicioRecorrido( int cantInicial , Autobus autobus ) {

            if ( cantInicial >= autobus.getCapMax() ) {
                System.out.println("La capacidad maxima del autobus fue superada");
            } else {
                autobus.setCantActual(cantInicial);
            }

        }

        public void finalDelRecorrido( Autobus autobus ) {
            
            autobus.setCantActual(0);

        }

        public void subirPasajeros( int cantidad , int parada ,  Autobus autobus ) {
            
            if ( parada == autobus.getCantParadas() ) {
                
                System.out.println("El autobus se encuentra en la ultima parada");
                System.out.println("No se pueden subir mas pasajeros");

                this.finalDelRecorrido(autobus);

            } else if ( parada == 1 ) {

                this.inicioRecorrido(cantidad, autobus);

            } else {

                if ( cantidad + autobus.getCantActual() > autobus.getCapMax() ) {
                    
                    System.out.println("Toda la gente de la parada no entra en el dibon");
                    int capacidad = autobus.getCapMax() - autobus.getCantActual();

                    System.out.println("Solo podran subirse: " + capacidad + " pasajeros ");
                    System.out.println("La cantidad de gente que se queda en la parada es " + ( cantidad - capacidad ) );

                    autobus.setCantActual(capacidad);

                } else {

                    System.out.println("Todas las personas de la parada" + parada + " se podran subir");

                    autobus.setCantActual( cantidad + autobus.getCantActual() );

                }

            }

        }

        public void bajarPasajeros( int cantidad , int parada ,  Autobus autobus ) {
            
            if ( parada == autobus.getCantParadas() ) {
                
                System.out.println("El autobus se encuentra en la ultima parada");
                System.out.println("Se bajan todos los pasajeros");

                this.finalDelRecorrido(autobus);

            } else if ( parada == 1 ) {

                System.out.println("El autobus se encuentra vacio");
                
            } else {

                System.out.println( cantidad + " persons se han bajado en la parada numero " + parada );

                autobus.setCantActual(  autobus.getCantActual() - cantidad );

                System.out.println("La cantidad actual de pasajeros despues de la parada " + parada + " es: " + autobus.getCantActual() );

            }

        }

}
