// Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
// método "calcular_area" que calcule y devuelva el área del rectángulo.
// Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
// de 4 y 6 y imprime el área del rectángulo.

package Entidades;

public class Rectangulo {
    
    //  ATRIBUTOS

        private double lado1;
        private double lado2;

    //  CONSTRUCTORES

        public Rectangulo() {
        }

        public Rectangulo(double lado1, double lado2) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        }

    //  MÉTODOS PERSONALIZADOS

        public double calcular_area() {
            
            double area;

            area = lado1 * lado2;

            return area;

        }

}
