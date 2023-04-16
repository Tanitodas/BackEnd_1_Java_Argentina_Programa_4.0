// Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
// "salario". Luego, crea un método "calcular_aumento" que calcule el
// aumento salarial de un empleado en función de su edad y salario actual.
// El aumento salarial debe ser del 10% si el empleado tiene más de 30
// años o del 5% si tiene menos de 30 años.

package Entidades;

public class Empleado {
    
    //  ATRIBUTOS
        private String nombre;
        private int edad;
        private double salario;

    //  CONSTRUCTORES 
        
        public Empleado() {
        }

        public Empleado(String nombre, int edad, double salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
        }

    //  GETTERS y SETTERS

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

    //  MÉTODOS PERSONALIZADOS

        public double calcular_aumento() {
            
            double aumento;

            if ( edad > 30 ) {
                
                aumento = ( 0.1 * this.salario );

            } else {

                aumento = ( 0.05 * this.salario );

            }

            return aumento;

        }
        
}
