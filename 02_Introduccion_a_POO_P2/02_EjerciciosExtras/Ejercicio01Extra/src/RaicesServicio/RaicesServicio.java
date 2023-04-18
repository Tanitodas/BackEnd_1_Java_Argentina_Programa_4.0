package RaicesServicio;

// Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
// ecuación de 2do grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
// y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
// constructor. Luego, las operaciones que se podrán realizar son las siguientes:
//
//      • Método getDiscriminante(): devuelve el valor del discriminante (double). El
//        discriminante tiene la siguiente formula: (b^2)-4*a*c
//
//      • Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//        que esto ocurra, el discriminante debe ser mayor o igual que 0.
//
//      • Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
//        para que esto ocurra, el discriminante debe ser igual que 0.
//
//      • Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2
//        posibles soluciones.
//
//      • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz.
//        Es en el caso en que se tenga una única solución posible.
//
//      • Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//        pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//        obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
//        caso de no existir solución, se mostrará un mensaje.
//
// Nota: Formula ecuación 2do grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
// delante de -b

import java.util.Scanner;
import RaicesEntidades.RaicesClass;

public class RaicesServicio {
    
    //  ATRIBUTOS DE LA CLASE SERVICIOS

        // Asignamos al Scanner como atributo de la clase para tenerlo como clase global
        // y poder utilizarla en los diferentes metodos.
        Scanner entrada = new Scanner(System.in);

    //  CONSTRUCTOR DE LA CLASE SERVICIOS

        // Este constructor nos va a permitir crear un metodo que nos devuelva un OBJETO
        // de tipo PersonaClass.
        public RaicesClass crearNuevaEcuacion() {

            System.out.println("Ingrese el termino 'a' de la ecuacion");
            double a = entrada.nextDouble();

            System.out.println("Ingrese el termino 'b' de la ecuacion");
            double b = entrada.nextDouble();

            System.out.println("Ingrese el termino 'c' de la ecuacion");
            double c = entrada.nextDouble();

            return new RaicesClass(a, b, c);

        }

    //  METODOS PERSONALIZADOS

        // Método para obetener el discriminante de la ecuacion de 2do Grado.

        public double getDiscriminante( RaicesClass nuevaEcuacion ) {
            
            double discriminante;

            discriminante = ( Math.pow( nuevaEcuacion.getB() , 2 ) - ( 4 * nuevaEcuacion.getA() * nuevaEcuacion.getC() ) );
            
            return discriminante;
            
        }

        /*  
        *  El signo del discriminante (Δ=b^2-4ac) determina el número de soluciones de una ecuación de segundo grado:
        *
        *  - Si el discriminante es positivo (Δ>0), la ecuación de segundo grado tiene dos soluciones diferentes.
        *  - Si el discriminante es nulo (Δ=0), la ecuación de segundo grado tiene dos soluciones iguales.
        *  - Si el discriminante es negativo (Δ<0), la ecuación de segundo grado no tiene ninguna solución real.
        */  
        
        //  Método para saber si la ecuacion de 2do grado tiene 2 raices DISTINTAS.
        public boolean tieneRaices( RaicesClass nuevaEcuacion ) {

            double discriminante = getDiscriminante(nuevaEcuacion);

            boolean tieneRaices;

            if ( discriminante > 0) {
                
                tieneRaices = true;

            } else {

                tieneRaices = false;

            }

            return tieneRaices;

        }

        //  Método para saber si la ecuacion de 2do grado tiene 2 raices IGUALES.
        public boolean tieneRaiz( RaicesClass nuevaEcuacion ) {

            double discriminante = getDiscriminante( nuevaEcuacion );

            boolean tieneRaiz;

            if ( discriminante == 0) {
                
                tieneRaiz = true;

            } else {

                tieneRaiz = false;

            }

            return tieneRaiz;

        }

        //  Metodos para conseguir el valor de las dos raices DISTINTAS de la ecuacion.
        public void obtenerRaices( RaicesClass nuevaEcuacion ) {
            
            boolean tieneRaicesONo = tieneRaices( nuevaEcuacion );

            double raiz1 , raiz2;

            if ( tieneRaicesONo ) {

                //  En la primera raiz realizamos lo siguiente (-b-√((b^2)-(4*a*c)))/(2*a)
                raiz1 = ( ( - nuevaEcuacion.getB() ) - ( Math.sqrt ( Math.pow( nuevaEcuacion.getB() , 2 ) - ( 4 * nuevaEcuacion.getA() * nuevaEcuacion.getC() ) ) ) ) / ( 2 * nuevaEcuacion.getA() )  ;

                //En la segunda raiz realizamos lo siguiente (-b+√((b^2)-(4*a*c)))/(2*a)
                raiz2 = ( (- nuevaEcuacion.getB() ) + ( Math.sqrt ( Math.pow( nuevaEcuacion.getB() , 2 ) - ( 4 * nuevaEcuacion.getA() * nuevaEcuacion.getC() ) ) ) ) / ( 2 * nuevaEcuacion.getA() )  ;

                System.out.println("La raiz 1 es igual a: " + raiz1);
                System.out.println("");
                System.out.println("La raiz 2 es igual a: " + raiz2);
                
            } else {

                System.out.println(" Esta ecuacion no tiene raices :c ");

            }

        }

        //  Métodos para conseguir el valor de las dos raices IGUALES de la ecuacion.
        public void obtenerRaiz( RaicesClass nuevaEcuacion ) {
            
            boolean tieneRaiz = tieneRaiz( nuevaEcuacion );

            double raiz1 , raiz2;

            if ( tieneRaiz ) {

                //  En la primera raiz realizamos lo siguiente (-b-√((b^2)-(4*a*c)))/(2*a)
                raiz1 = ( (- nuevaEcuacion.getB() ) + ( Math.sqrt ( Math.pow( nuevaEcuacion.getB() , 2 ) - ( 4 * nuevaEcuacion.getA() * nuevaEcuacion.getC() ) ) ) ) / ( 2 * nuevaEcuacion.getA() )  ;  ;

                //En la segunda raiz realizamos lo siguiente (-b+√((b^2)-(4*a*c)))/(2*a)
                raiz2 = ( (- nuevaEcuacion.getB() ) + ( Math.sqrt ( Math.pow( nuevaEcuacion.getB() , 2 ) - ( 4 * nuevaEcuacion.getA() * nuevaEcuacion.getC() ) ) ) ) / ( 2 * nuevaEcuacion.getA() )  ;  ;

                if ( raiz1 == raiz2 ) {
                    
                    System.out.println("Ambas raices de la ecuacion son iguales y sus valores son iguales a: " + raiz1);

                }
                
            } else {

                System.out.println(" Esta ecuacion no tiene raices :c ");

            }

        }

}
