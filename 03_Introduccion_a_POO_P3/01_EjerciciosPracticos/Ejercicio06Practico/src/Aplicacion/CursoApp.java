package Aplicacion;

import java.util.Scanner;
import Entidades.CursoClass;
import Servicios.CursoServicios;

public class CursoApp {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
       
        //  Instanciamos la clase 'CursoServicios' para utilizar los metodos
        //  dentro de ellas.
        CursoServicios objetoDeServicios = new CursoServicios();

        //  Instanciamos la clase 'CursoClass'.
        CursoClass curso1 = objetoDeServicios.crearCurso();

        //  Instanciamos la clase 'CursoClass' con su constructor con parametros (sin el arreglo 'alumnos')
        //  así utilizamos el metodo 'cargarAlumnos' de la clase 'CursoServicios'.
        CursoClass curso2 = new CursoClass("matematica1", 5, 3, "Mañana", 700);

        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length ; i++) {
                
            System.out.println("Ingrese el nombre del alumno " + ( i + 1 ) );
            alumnos[i] = entrada.nextLine();

        }

        //  Instanciamos la clase 'CursoClass' con su constructor con parametros (con el arreglo 'alumnos')
        //  así NO utilizamos el metodo 'cargarAlumnos' de la clase 'CursoServicios'.
        CursoClass curso3 = new CursoClass("ingles2", 2, 2, "Tarde", 600 , alumnos);

        //  Calculamos las ganancias semanales de cada curso
        System.out.println("Las ganancias semanales del curso1 son: " + objetoDeServicios.calcularGananciaSemanal(curso1) );
        System.out.println("Las ganancias semanales del curso2 son: " + objetoDeServicios.calcularGananciaSemanal(curso2) );
        System.out.println("Las ganancias semanales del curso3 son: " + objetoDeServicios.calcularGananciaSemanal(curso3) );

        //  Mostramos los atributos de los diferentes cursos
        System.out.println( curso1.toString() );
        System.out.println( curso2.toString() );
        System.out.println( curso3.toString() );
        
        entrada.close();

    }

}
