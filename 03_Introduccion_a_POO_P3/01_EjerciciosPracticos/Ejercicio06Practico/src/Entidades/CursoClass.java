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

package Entidades;

import java.util.Arrays;

public class CursoClass {
    
    //  ATRIBUTOS De la clase 'Curso'

        private String nombreCurso;
        private int cantidadDeHorasPorDia;
        private int cantidadDeDiasPorSemana;
        private String turno;
        private double precioPorHora;
        private String[] alumnos = new String[5];

    //  CONSTRUCTORES DE LA CLASE

        public CursoClass() {
        }

        //  Constructor de un objeto de la clase 'CursoClass' pero con el arreglo de los alumnos.
        public CursoClass(String nombreCurso, int cantidadDeHorasPorDia, int cantidadDeDiasPorSemana, String turno,
            double precioPorHora, String[] alumnos) {

            this.nombreCurso = nombreCurso;
            this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
            this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
            this.turno = turno;
            this.precioPorHora = precioPorHora;
            this.alumnos = alumnos;

        }

        // Constructor de un objeto de la clase 'CursoClass' pero sin el arreglo de alumnos.
        public CursoClass(String nombreCurso, int cantidadDeHorasPorDia, int cantidadDeDiasPorSemana, String turno,
            double precioPorHora) {

            this.nombreCurso = nombreCurso;
            this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
            this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
            this.turno = turno;
            this.precioPorHora = precioPorHora;
            
        }
    
    //  GETTERS y SETTERS 

        public String getNombreCurso() {
            return nombreCurso;
        }

        public void setNombreCurso(String nombreCurso) {
            this.nombreCurso = nombreCurso;
        }

        public int getCantidadDeHorasPorDia() {
            return cantidadDeHorasPorDia;
        }

        public void setCantidadDeHorasPorDia(int cantidadDeHorasPorDia) {
            this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
        }

        public int getCantidadDeDiasPorSemana() {
            return cantidadDeDiasPorSemana;
        }

        public void setCantidadDeDiasPorSemana(int cantidadDeDiasPorSemana) {
            this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
        }

        public String getTurno() {
            return turno;
        }

        public void setTurno(String turno) {
            this.turno = turno;
        }

        public double getPrecioPorHora() {
            return precioPorHora;
        }

        public void setPrecioPorHora(double precioPorHora) {
            this.precioPorHora = precioPorHora;
        }

        public String[] getAlumnos() {
            return alumnos;
        }

        public void setAlumnos(String[] alumnos) {
            this.alumnos = alumnos;
        }

    // Método 'toString'
        
        @Override
        public String toString() {
            return "Curso [nombreCurso=" + nombreCurso + ", cantidadDeHorasPorDia=" + cantidadDeHorasPorDia
                    + ", cantidadDeDiasPorSemana=" + cantidadDeDiasPorSemana + ", turno=" + turno + ", precioPorHora="
                    + precioPorHora + ", alumnos=" + Arrays.toString(alumnos) + "]";
        }

}
