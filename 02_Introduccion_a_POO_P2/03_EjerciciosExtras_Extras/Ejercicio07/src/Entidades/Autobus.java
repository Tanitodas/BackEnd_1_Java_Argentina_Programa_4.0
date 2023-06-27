package Entidades;

// 7) Crear la clase “Autobús” con los siguientes atributos:  identificación, capacidad máxima de pasajeros,
//  capacidad actual de pasajeros y cantidad de paradas. Luego agregar constructores, setters y getters.

public class Autobus {
    
    // Atributos
    private int identificacion;
    private int capMax;
    private int cantActual;
    private int cantParadas;

    // Constructores
    
    public Autobus() {
    }

    public Autobus(int identificacion, int capMax, int cantActual, int cantParadas) {
        this.identificacion = identificacion;
        this.capMax = capMax;
        this.cantActual = cantActual;
        this.cantParadas = cantParadas;
    }

    //  Getters y Setters

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    public int getCantParadas() {
        return cantParadas;
    }

    public void setCantParadas(int cantParadas) {
        this.cantParadas = cantParadas;
    }

    @Override
    public String toString() {
        return "Autobus [identificacion=" + identificacion + ", capMax=" + capMax + ", cantActual=" + cantActual
                + ", cantParadas=" + cantParadas + "]";
    }

}
