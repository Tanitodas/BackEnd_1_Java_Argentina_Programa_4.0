// Un profesor particular está dando cursos para grupos de cinco alumnos
// y necesita un programa para organizar la información de cada curso.
// 
// Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
// serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
// turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un arreglo de tipo
// String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. 
//
// A continuación, se implementarán los siguientes métodos:
//
//      a) Un constructor por defecto.
//
//      b) Un constructor con todos los atributos como parámetro.
//
//      c) Métodos getters y setters de cada atributo.
//
//      d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
//         los alumnos que asisten a las clases. Nosotros nos encargaremos de
//         almacenar esta información en un arreglo e iterar con un bucle,
//         solicitando en cada repetición que se ingrese el nombre de cada
//         alumno.
//
//      e) Método crearCurso(): el método crear curso, le pide los valores de
//         los atributos al usuario y después se le asignan a sus respectivos
//         atributos para llenar el objeto Curso. En este método invocamos al
//         método cargarAlumnos() para asignarle valor al atributo alumnos.
//
//      f) Método calcularGananciaSemanal(): este método se encarga de
//         calcular la ganancia en una semana por curso. Para ello, se deben
//         multiplicar la cantidad de horas por día, el precio por hora, la
//         cantidad de alumnos y la cantidad de días a la semana que se repite
//         el encuentro.

package Servicios;

import java.util.Scanner;
import Entidades.CursoClass;

public class CursoServicios {
    
    // ATRIBUTOS

        Scanner entrada = new Scanner(System.in);

    // CONSTRUCTOR

        public CursoServicios() {
        }

    // MÉTODOS PERSONALIZADOS

        //  Metodo para cargar un array con los nombres de los alumnos.
        public void cargarAlumnos( CursoClass curso ) {
            
            String[] alumnos = new String[5];
            
            for (int i = 0; i < alumnos.length ; i++) {
                
                System.out.println("Ingrese el nombre del alumno " + ( i + 1 ) );
                alumnos[i] = entrada.nextLine();

            }

            curso.setAlumnos(alumnos);
            
        }

        //  Método para crear una instancia de la clase 'CursoClass'.
        public CursoClass crearCurso() {
            
            System.out.println("Ingrese el NOMBRE del curso");
            String nombreCurso = entrada.nextLine();

            System.out.println("Ingrese la CANTIDAD DE HORAS POR DIA del curso");
            int cantidadDeHorasPorDia = entrada.nextInt();

            System.out.println("Ingrese la CANTIDAD DE DIAS POR SEMANA del curso");
            int cantidadDeDiasPorSemana = entrada.nextInt();

            entrada.nextLine(); // Limpiamos el buffer del enter.

            System.out.println("Ingrese el TURNO del curso ( mañana/tarde )");
            String turno = entrada.nextLine();

            System.out.println("Ingrese el PRECIO POR HORA del curso");
            double precioPorHora = entrada.nextDouble();

            entrada.nextLine(); // Limpiamos el buffer del enter.

            String[] alumnos = new String[5];
            
            for (int i = 0; i < alumnos.length ; i++) {
                
                System.out.println("Ingrese el nombre del alumno " + ( i + 1 ) );
                alumnos[i] = entrada.nextLine();

            }

            return new CursoClass( nombreCurso, cantidadDeHorasPorDia, cantidadDeDiasPorSemana, turno, precioPorHora, alumnos );

        }

        public double calcularGananciaSemanal( CursoClass curso ) {
            
            double gananciasSemanales;

            gananciasSemanales = curso.getCantidadDeHorasPorDia() * curso.getCantidadDeHorasPorDia() * curso.getCantidadDeDiasPorSemana() * curso.getAlumnos().length;

            return gananciasSemanales;

        }
        
}
