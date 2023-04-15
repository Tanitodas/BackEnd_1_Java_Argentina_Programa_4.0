// Crear una clase llamada 'Libro' que contenga los siguientes atributos: ISBN, Título,
// Autor, Número de páginas, y un constructor con todos los atributos pasados por
// parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
// datos al usuario y luego informar mediante otro método el número de ISBN, el título,
// el autor del libro y el numero de páginas.

import Entidades.Libro;

//  En este archivo creamos dos objetos de tipo libro a traves de diferentes constructores.
//  aplicamos lo difrentes metodos dentro de la clase y modificamos sus atributos.

public class LibroApp {

    public static void main(String[] args) {
        
        //  En esta linea de codigo creamos un OBJETO de la clase 'Libro' con el construcctor vacio de la clase.
        Libro libro1 = new Libro();

        //  En esta linea de cogico creamos un OBJETO de la clase 'libro' pero con el construcctor en donde le pasamos
        //  los atributos del objeto como parametros del metodo contructor.
        Libro libro2 = new Libro(1234, "Don Quijote de la Mancha", "Miguel de Cervantes", 200);

        //  A continuacion mostramos lo atributos de los objetos creados anteriormente , para asi evidenciar la diferencia
        //  entre crear un objeto con el construcctor vacio y con el construcctor con parametros.

        //  Esto lo hacemos a traves del metodo de 'mostrarLibro' que se encuentra en la clase 'Libro'. Este metodo nos muestra por
        //  consola los valores de los atributos de cada objeto.

        System.out.println("--------------Libro1--------------");
        libro1.mostrarLibro(); //   Como 'libro1' se creo con el construcctor vacio, los atributos no debrian tener valores
        
        System.out.println("--------------Libro2--------------");
        libro2.mostrarLibro(); //   Como 'libro2' se creo con el otro contructor, los atributos ya tienen valores

        //  Despues de esta pruba cargamos los atributos en el 'libro1' a traves de un metodo creado para esto
        //  que llamamos 'cargarLibro'.
        System.out.println("");
        libro1.cargarLibro();
        System.out.println("");

        //  Nuevamente ahora mostramos los valores de los atributos de ambos libros para asi verificar que se cargaron
        //  correctamente los valores de los atributos del 'libro1'.

        System.out.println("--------------Libro1--------------");
        libro1.mostrarLibro(); //   Tendrian que aparecer los valores que colocamos en la parte donde aplicamos el metodo '.cargarLibro'
        
        System.out.println("--------------Libro2--------------");
        libro2.mostrarLibro(); 

        //  Ahora vamos a cambiar algunos atributos del objeto 'libro2' a traves de los setters y mostrarlo a traves de los
        //  getters.

        //  Cambiamos el numero del ISBN del libro2

        libro2.setISBN(2525); // Modificamos el numero de ISBN anterior que era 1234 a 2525.

        //  Mostramos este cambio a traves de los getters.

        System.out.println("");
        System.out.println("El nuevo ISBN del libro2 es igual a: " + libro2.getISBN() );
        System.out.println("");

        //  Tambien mostramos los atributos del libro2 con el metodo de '.mostrarLibro'

        libro2.mostrarLibro();
        
    }

}
