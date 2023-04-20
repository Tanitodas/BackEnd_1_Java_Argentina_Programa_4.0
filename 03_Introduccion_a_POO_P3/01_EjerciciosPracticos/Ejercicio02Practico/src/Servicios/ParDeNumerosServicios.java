// Realizar una clase llamada ParDeNumeros que tenga como atributos dos
// números reales con los cuales se realizarán diferentes operaciones
// matemáticas. La clase debe tener un constructor vacío, getters y setters.
// En el constructor vacío se usará el Math.random para generar los dos
// números. Crear una clase ParDeNumerosService, en el paquete
// Servicios, que deberá además implementar los siguientes métodos:
//
//      a) Método mostrarValores que muestra cuáles son los dos números
//         guardados.
//
//      b) Método devolverMayor para retornar cuál de los dos atributos tiene
//         el mayor valor
//
//      c) Método calcularPotencia para calcular la potencia del mayor valor de
//         la clase elevado al menor número. Previamente se deben redondear
//         ambos valores.
//
//      d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//         dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//         valor absoluto del número.

package Servicios;

import java.util.Scanner;
import Entidades.ParDeNumerosClass;

public class ParDeNumerosServicios {
    
    //  ATRIBUTOS DE LA CLASE SERIVICIOS

        Scanner entrada = new Scanner(System.in);

    //  CONSTRUCTOR DE LA CLASE

        public ParDeNumerosServicios() {

        }

    //  MÉTODOS PEROSONALIZADOS
        
        public void mostrarValores( ParDeNumerosClass numeros ) {
            
            System.out.println("El valor del numero 1 es : " + numeros.getNumero1() );
            System.out.println("El valor del numero 2 es : " + numeros.getNumero2() );

        }

        public void devolverMayor( ParDeNumerosClass numeros ) {
            
            double valorMax = Math.max( numeros.getNumero1(), numeros.getNumero2() );

            System.out.println("El valor MÁXIMO entre los numeros {" + numeros.getNumero1() + ";" + numeros.getNumero2() + "} es igual a: {" + valorMax + "}" );
        }

        public void calcularPotencia( ParDeNumerosClass numeros ) {
            
            // Redondeamos los dos numeros para operar el potencial.
            numeros.setNumero1( (double) Math.round( numeros.getNumero1() * 100d ) / 100 ); // Acortamos los decimales de los valores cargados aleatoriamente a solamente 2.
            numeros.setNumero2( (double) Math.round( numeros.getNumero2() * 100d ) / 100 ); // Acortamos los decimales de los valores cargados aleatoriamente a solamente 2.
            
            // Calculamos los valores maximos y minimos
            double valorMax = Math.max( numeros.getNumero1(), numeros.getNumero2() );
            double valorMin = Math.min( numeros.getNumero1(), numeros.getNumero2() );

            double potencia = Math.pow(valorMax, valorMin);

            System.out.println("El valor maximo es igual a: " + valorMax );
            System.out.println("El valor minimo es igual a: " + valorMin );
            System.out.println("La potencia entre el valorMax y el valorMin es igual a: " + potencia );

        }

        public void calcularRaiz( ParDeNumerosClass numeros ) {
            
            double valorMin = Math.min( numeros.getNumero1(), numeros.getNumero2() );
            double valorAbs = Math.abs(valorMin);

            double raizCuadrada = Math.sqrt(valorAbs);

            System.out.println("La raiz cuadrada del valor minimo {" + valorAbs + "} es igual a: " + raizCuadrada);

        }

}
