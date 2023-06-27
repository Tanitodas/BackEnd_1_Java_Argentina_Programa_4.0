import Servicios.AhorcadoService;

public class App {
    public static void main(String[] args) {
        
        AhorcadoService objetoDeServicio = new AhorcadoService();

        // Ahorcado juego1;

        // juego1 = objetoDeServicio.crearJuego();

        // System.out.println(juego1.toString());

        // System.out.println("La longitud de la palabra es igual a: " + objetoDeServicio.longitud(juego1));
        
        // System.out.println("Las veces que se encuentra la letra en la palabra es igual a: ");
    
        objetoDeServicio.juego();

    }
}
