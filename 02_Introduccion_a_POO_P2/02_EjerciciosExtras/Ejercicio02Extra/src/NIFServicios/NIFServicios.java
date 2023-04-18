package NIFServicios;

// Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
// con su correspondiente letra (NIF). Los atributos serán el número de DNI
// (entero largo) y la letra (String o char) que le corresponde.
//
// En NIFService se dispondrá de los siguientes métodos:
//
//      a) Métodos getters y setters para el número de DNI y la letra.
//
//      b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
//         letra que le corresponderá. Una vez calculado, le asigna la letra que
//         le corresponde según.
//
//      c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
//         guion y la letra en mayúscula; por ejemplo: 00395469՞FՅ.
// 
// La letra correspondiente al dígito verificador se calculará a traves de un
// método que funciona de la siguiente manera: Para calcular la letra se
// toma el resto de dividir el número de DNI por 23 (el resultado debe ser
// un número entre 0 y 22). El método debe buscar en un array (vector) de
// caracteres la posición que corresponda al resto de la división para
// obtener la letra correspondiente. La tabla de caracteres es la siguiente:
//
//      0 T
//      1 R
//      2 W
//      3 A
//      4 G
//      5 M
//      6 Y
//      7 F
//      8 P
//      9 D
//      10 X
//      11 B
//      12 N
//      13 J
//      14 Z
//      15 S
//      16 Q
//      17 V
//      18 H
//      19 L
//      20 C
//      21 K
//      22 E

import java.util.Scanner;

import Entidades.NIFClass;

public class NIFServicios {
    
    //  ATRIBUTOS DE LA CLASE SERVICIOS

        // Asignamos al Scanner como atributo de la clase para tenerlo como clase global
        // y poder utilizarla en los diferentes metodos.
        public Scanner entrada = new Scanner(System.in);

        // Asignamos como atributo de la clase servicios un vector que contenga los posibles
        // digitos verificadores.
        public String[] vectorDigitoVerificador = {"T","R","W" ,"A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    //  CONSTRUCCTOR DE LA CLASE SERVICIOS

        // Este constructor nos va a permitir crear un metodo que nos devuelva un OBJETO
        // de tipo NIFClass.
        public NIFClass crearNIF() {

            System.out.println("Ingrese el DNI");
            long DNI = entrada.nextLong();

            return new NIFClass(DNI);

        }

    //  METODOS PERSONALIZDOS DEL SERVICIO

        public void calcularDigitoVerificador( NIFClass nuevoNIF ) {

            int divicion;
            String digitoVerificador ="";

            divicion = (int) nuevoNIF.getDNI() % 23;

            for (int i = 0; i < vectorDigitoVerificador.length; i++) {
                
                if ( divicion == i ) {

                    digitoVerificador = vectorDigitoVerificador[i];
                    
                }

            }

            nuevoNIF.setDigitoVerificador(digitoVerificador);
            
        }

        // Métedo para mostrar impreso el codigo NIF (DNI con el digito verificador separados por guion medio).
        public void mostrarNIF ( NIFClass nuevoNIF ) {

            System.out.println("----------CODIGO NIF----------");
            System.out.println( nuevoNIF.getDNI() + "-" + nuevoNIF.getDigitoVerificador() );
            System.out.println("------------------------------");

        }

        

    


}
