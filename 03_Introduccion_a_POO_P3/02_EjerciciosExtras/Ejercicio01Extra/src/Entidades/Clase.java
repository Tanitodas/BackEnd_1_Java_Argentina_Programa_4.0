package Entidades;

import java.util.Arrays;

public class Clase {
    
    //  ATRIBUTOS DE LA CLASE

        private String[] arregloDeMeses = { "enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre" };
        private String mesSecreto;
    
    //  CONSTRUCTORES DE LA CLASE

        public Clase() {
        }

        public Clase(String[] arregloDeMeses, String mesSecreto) {
            this.arregloDeMeses = arregloDeMeses;
            this.mesSecreto = mesSecreto;
        }

    //  GETTERS y SETTERS

        public String[] getArregloDeMeses() {
            return arregloDeMeses;
        }

        public void setArregloDeMeses(String[] arregloDeMeses) {
            this.arregloDeMeses = arregloDeMeses;
        }

        public String getMesSecreto() {
            return mesSecreto;
        }

        public void setMesSecreto(String mesSecreto) {
            this.mesSecreto = mesSecreto;
        }

    //  METODO TO STRING

    @Override
    public String toString() {
        return "Clase [arregloDeMeses=" + Arrays.toString(arregloDeMeses) + ", mesSecreto=" + mesSecreto + "]";
    }

    

}
