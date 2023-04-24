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

package Servicios;

import java.util.Arrays;
import java.util.Scanner;

public class ArregloServicio {
    
    //  ATRIBUTOS

        // Definimos como atributo al objeto scanner para que lo podamos utilizar
        // en todos los metodos de la clase.
        Scanner entrada = new Scanner(System.in);
    
    //  CONSTRUCTOR DE LA CLASE

        public ArregloServicio() {
        }

    //  MÉTODOS PERSONALIZADOS

        //  Método para inicializar un Array con valores aleatorios de tipo 'double'.
        public void inicializarArrayA( double[] vectorNuevo ) {
            
            for (int i = 0; i < vectorNuevo.length; i++) {
                
                vectorNuevo[i] = Math.random() * 10; // La multiplicacion por 10 lo hacemos para que los numeros aleatorios sean entre 0 y 10.

                vectorNuevo[i] = (double) Math.round(  vectorNuevo[i] * 100d ) / 100; // Acortamos los decimales de los valores cargados aleatoriamente a solamente 2.

            }

        }

        //  Metodo en el que utilizamos la clase 'Arrays' para imprimir el vector que le pasamos
        //  como parametro al metodo.
        public void mostrarArray( double[] vectorNuevo ) {
            
            System.out.println( Arrays.toString(vectorNuevo) );

        }

        //  Metodo para ordenar el Array de manera DESCENDENTE de mayor a menor.
        public void ordenarArray( double[] vectorNuevo ) {
            
            //double[] vectorDeMenorAMayor;
            //  Este metodo nos ordena el arreglo de menor a mayor.
            Arrays.sort(vectorNuevo);
            //  Para obtener lo que necesitamos invertimos la impresion de este metodo para asi
            //  poder obtener lo deseado, que es imprimir el vector de mayor a menor
            for (int i = vectorNuevo.length - 1 ; i > 0; i--) {
                System.out.print(vectorNuevo[i] + " ");
            }

        }

        //  Metodo para inicializar el vectorB segun como se pide en la consigna.
        public double[] inicializarB( double[] vectorBase ) {
            
            double[] vectorCon10PrimerosValoresDeArregloA = new double[10];
            double[] vectorCon10ValoresDe05 = new double[10];
            double[] vectorResultado = new double[20];

            //  Con el metodo 'copyOf' de la clase 'Arrays' copiamos los primeros 10 elementos
            //  del array 'vectorBase' en las primeras 10 posiciones del array 'vectorParaInicializar'
            vectorCon10PrimerosValoresDeArregloA = Arrays.copyOfRange(vectorBase, 0, 10);

            //  Con el metodo 'fill' de la clase 'Arrays' podemos asignar un cierto valor a diferentes posiciones o a
            //  todas ellas de un vector. En este caso asignamos el valor de '0.5' al intervalo de posiciones (10,20]
            //  del vector 'vectorParaInicializar'
            Arrays.fill(vectorCon10ValoresDe05, 0, 10, 0.5);

            //   Unimos los dos vectores recien creados para conformar el 'vectorResultado'
            int k = 0;

            for (int i = 9; i < 20; i++) {
            
                if ( i == 9) {
                    
                    for (int j = 0; j < 10; j++) {
                
                        vectorResultado[j] = vectorCon10PrimerosValoresDeArregloA[j];
    
                    }

                } else {

                    vectorResultado[i] = vectorCon10ValoresDe05[k];

                    k++;

                }

            }
        
           return vectorResultado;

        }

}
