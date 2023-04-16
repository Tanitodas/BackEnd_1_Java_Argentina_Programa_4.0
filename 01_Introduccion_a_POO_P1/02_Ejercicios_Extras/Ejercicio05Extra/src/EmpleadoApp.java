// Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
// "salario". Luego, crea un método "calcular_aumento" que calcule el
// aumento salarial de un empleado en función de su edad y salario actual.
// El aumento salarial debe ser del 10% si el empleado tiene más de 30
// años o del 5% si tiene menos de 30 años.

import Entidades.Empleado;

public class EmpleadoApp {
    public static void main(String[] args) {
        
        //Creamos el empleado n1

        Empleado empleado1 = new Empleado("Raul", 50, 50000);

        //Creamos el empleado n2

        Empleado empleado2 = new Empleado("Alberto", 20, 20000);

        //Calculamos el aumento del empleado 1

        System.out.println("El aumento del salario del empleado 1 es igual a " + empleado1.calcular_aumento() );
        System.out.println("El salario final del empleado 1 es igual a: " + (empleado1.calcular_aumento() + empleado1.getSalario()) );

        //Calculamos el aumento del empleado 2

        System.out.println("El aumento del salario del empleado 2 es igual a " + empleado2.calcular_aumento() );
        System.out.println("El salario final del empleado 2 es igual a: " + ( empleado2.calcular_aumento() + empleado2.getSalario() ) );

    }
}
