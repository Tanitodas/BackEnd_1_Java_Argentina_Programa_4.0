// Crear una clase Rectángulo que modele rectángulos por medio de un atributo
// privado base y un atributo privado altura. La clase incluirá un método para crear el
// rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
// método para calcular la superficie del rectángulo y un método para calcular el
// perímetro del rectángulo. Por último, tendremos un método que dibujará el
// rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
// los métodos getters, setters y constructores correspondientes.
// Superficie = base * altura / Perímetro = (base + altura) * 2.

package Entidades;

import java.util.Scanner;

public class Rectangulo {

    // ATRIBUTOS de la clase
    private double base;
    private double altura;

    // CONSTRUCTORES de la clase.

    // Constructor vacio.
    public Rectangulo() {
    }

    // Constructor con parametros.
    public Rectangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;

    }

    // GETTERS y SETTERS

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // METODOS PERSONALIZADOS creados particularmente para esta clase.

    // Metodo para cargar atributos en un objeto de la clase de rectangulo vacio.
    public void cargarRectangulo() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la BASE del rectangulo");
        this.base = entrada.nextDouble();

        System.out.println("Ingrese la ALTURA del rectangulo");
        this.altura = entrada.nextDouble();

        entrada.close();

    }

    // Metodo para calcular la superficie del objeto
    public void calcularSuperficie() {

        double superficie = this.base * this.altura;

        System.out.println("La SUPERFICIE del rectangulo es igual a: " + superficie);

    }

    // Metodo para culcular el perimetro del objeto
    public void calcularPerimetro() {

        double perimetro = (this.base + this.altura) * 2;

        System.out.println("El PERIMETRO del rectangulo es igual a: " + perimetro);

    }

    // Método para dibujar el rectangulo
    public void dibujoRectangulo() {

        for (int fila = 0; fila < this.altura; fila++) {
            
            for (int columna = 0; columna < this.base; columna++) {
                
                if (fila == 0 || fila == this.altura - 1 || columna == 0 || columna == this.base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            
            System.out.println("");

        }

    }

}
