// Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
// Autor, Número de páginas, y un constructor con todos los atributos pasados por
// parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
// datos al usuario y luego informar mediante otro método el número de ISBN, el título,
// el autor del libro y el numero de páginas.

package Entidades;

import java.util.Scanner;

//  En este archivo creamos la clase LIBRO con los atributos de ISBN,titulo,autor y numero de paginas.

public class Libro { 
    
    //  Atributos de la clase 'Libro'
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroDePaginas;

    //  CONSTRUCCTORES de la clase 'Libro'
        
        //  Constructor vacio.
        public Libro(){
        }

        //  Construcctor con atributos (de la clase 'libro') pasados como parametros.
        public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
            this.ISBN = ISBN;
            this.titulo = titulo;
            this.autor = autor;
            this.numeroDePaginas = numeroDePaginas;
        }

    //  GETTERS y SETTERS de la clase 'Libro'

        public int getISBN() {
            return ISBN;
        }

        public void setISBN(int ISBN) {
            this.ISBN = ISBN;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getNumeroDePaginas() {
            return numeroDePaginas;
        }

        public void setNumeroDePaginas(int numeroDePaginas) {
            this.numeroDePaginas = numeroDePaginas;
        }

    // MÉTODOS PERSONALIZADOS de la clase 'Libro'
    
        //  Metodo para cargar un libro.
        public void cargarLibro() {
        
            Scanner entrada = new Scanner(System.in);

            String usuario;

            System.out.println("Ingrese su nombre de USUARIO");
            usuario = entrada.nextLine();

            if ( usuario != null ) {
                
                System.out.println("Ingrese el codigo ISBN del libro");
                this.ISBN = entrada.nextInt();

                entrada.nextLine(); //   Limpiamos el Buffer del "\n" (espacio)

                System.out.println("Ingrese el TITULO del libro");
                this.titulo = entrada.nextLine();

                System.out.println("Ingrese el AUTOR del libro");
                this.autor = entrada.nextLine();

                System.out.println("Ingrese el NUMERO DE PAGINAS del libro");
                this.numeroDePaginas = entrada.nextInt();

            }else{

                System.out.println("No ingreso ningun usuario");

            }

            entrada.close();

        }

        //  Metodo para mostrar los atributos de un objeto de la clase 'Libro'
        public void mostrarLibro() {

            System.out.println("El codigo ISBN del libro es: " + ISBN);
            System.out.println("El TITULO del libro es: " + titulo);
            System.out.println("El AUTOR del libro es: " + autor);
            System.out.println("El NUMERO DE PAGINAS del libro es: " + numeroDePaginas);

        }

}
