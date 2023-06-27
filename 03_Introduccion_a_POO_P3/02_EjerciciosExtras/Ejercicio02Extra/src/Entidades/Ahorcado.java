package Entidades;

import java.util.Arrays;

public class Ahorcado {
    
    //  ATRIBUTOS DE LA CLASE AHORACADO
        
        private String[] palabraBuscar;
        private int longitudPalabra;
        private static int cantidadDeLetrasEncontradas = 0; // agregar comentario de palabra static
        private static int cantidadDeLetrasRestantes = 0; // agregar comentario de palabra static
        private int cantidadDeIntentos;

    //  CONSTRUCTORES DE LA CLASE.

        public Ahorcado() {
        }

        public Ahorcado(String[] palabraBuscar, int longitudPalabra, int cantidadDeIntentos) {
            
            this.palabraBuscar = palabraBuscar;
            this.longitudPalabra = longitudPalabra;
            this.cantidadDeIntentos = cantidadDeIntentos;
            
        }
    
    // GETTERS y SETTERS

        public String[] getPalabraBuscar() {
            return palabraBuscar;
        }

        public void setPalabraBuscar(String[] palabraBuscar) {
            this.palabraBuscar = palabraBuscar;
        }

        public int getCantidadDeLetrasEncontradas() {
            return cantidadDeLetrasEncontradas;
        }

        public void setCantidadDeLetrasEncontradas(int cantidadDeLetrasEncontradas) {
            Ahorcado.cantidadDeLetrasEncontradas = cantidadDeLetrasEncontradas; 
        }

        public int getCantidadDeIntentos() {
            return cantidadDeIntentos;
        }

        public void setCantidadDeIntentos(int cantidadDeIntentos) {
            this.cantidadDeIntentos = cantidadDeIntentos;
        }

        public int getLongitudPalabra() {
            return longitudPalabra;
        }
    
        public void setLongitudPalabra(int longitudPalabra) {
            this.longitudPalabra = longitudPalabra;
        }

        public int getCantidadDeLetrasRestantes() {
            return cantidadDeLetrasRestantes;
        }
    
        public void setCantidadDeLetrasRestantes(int cantidadDeLetrasRestantes) {
            Ahorcado.cantidadDeLetrasRestantes = cantidadDeLetrasRestantes; 
        }
            
    //  MÉTODO 'TO STRING'

        @Override
        public String toString() {
            return "Ahorcado [palabraBuscar=" + Arrays.toString(palabraBuscar) + ", longitudPalabra=" + longitudPalabra
                    + ", cantidadDeLetrasEncontradas=" + cantidadDeLetrasEncontradas + ", cantidadDeLetrasRestantes="
                    + cantidadDeLetrasRestantes + ", cantidadDeIntentos=" + cantidadDeIntentos + "]";
        }
        
}
