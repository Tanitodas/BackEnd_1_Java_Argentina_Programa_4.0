// 7) Crear la clase “Autobús” con los siguientes atributos:  identificación, capacidad máxima de pasajeros,
//  capacidad actual de pasajeros y cantidad de paradas. Luego agregar constructores, setters y getters.
//
// Crear la clase “AutobúsServicio”, la misma contendrá los siguientes métodos:

//  - Método para crear un Autobús: se pedirá al usuario que ingrese los datos.

//  - Método inicioRecorrido(int cantidad), recibirá por parámetro la cantidad de personas que suben al
//    autobús en el inicio del recorrido. La misma no debe superar la capacidad máxima del autobús.

//  - Método finRecorrido(), debe simular la finalización del recorrido y por lo cual el autobús debe quedar vacío.

//  - Método subirPasajeros(int cantidad, int parada), recibe por parámetro la cantidad de personas a subir y el númerode parada.
//    En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada debe ejecutarse el 
//    método inicioRecorrido(int cantidad). En el caso que sea la última parada, debe informar al usuario que se encuentra
//    en la finalización del recorrido y no pueden subir más pasajeros.

//    Si el número de parada es distinto al número de inicio y de finalización, debe subir a los pasajeros 
//    indicados, analizando la capacidad actual y verificando que no sobrepase la capacidad máxima.
//    Solamente podrán subir pasajeros hasta cubrir la capacidad máxima.
//  - Método bajarPasajeros (int cantidad, int parada), recibe por parámetro la cantidad de personas a bajar del 
//    autobús y el número de paradas.
// En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada, se debe 
// informar al usuario que el autobús aún se encuentra vacío. En el caso que sea la última parada, se debe ejecutar 
// el método finRecorrido().
// Si el número de parada es distinto al número de inicio y de finalización, deben bajar los pasajeros indicados.

import java.util.Scanner;
import Entidades.Autobus;
import Servicio.AutobusServicio;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        Autobus autobus1 = new Autobus();

        AutobusServicio servicio = new AutobusServicio();

        autobus1 = servicio.crearAutobus();

        System.out.println("¿Cual es la cantidad de pasajeros al inicio del recorrido?");
        servicio.inicioRecorrido((entrada.nextInt()), autobus1);

        System.out.println(autobus1.toString());
    
        System.out.println("¿Cual es la cantidad de pasajeros en esta parada?");
        System.out.println("¿Cual es el numero de esta parada?");
        servicio.subirPasajeros((entrada.nextInt()),(entrada.nextInt()), autobus1);
        
        System.out.println("¿Cual es la cantidad de pasajeros en esta parada?");
        System.out.println("¿Cual es el numero de esta parada?");
        servicio.bajarPasajeros((entrada.nextInt()), (entrada.nextInt()), autobus1);

        entrada.close();

    }

}
