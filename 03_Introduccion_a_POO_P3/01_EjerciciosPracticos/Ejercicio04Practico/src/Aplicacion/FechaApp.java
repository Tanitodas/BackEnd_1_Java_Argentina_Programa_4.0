package Aplicacion;

import java.util.Date;
import Servicios.FechaServicios;

public class FechaApp {
    public static void main(String[] args) {
        
        FechaServicios objetoDeServivios = new FechaServicios();

        System.out.println( objetoDeServivios.fechaActual() );

        Date fechaNacimiento =  objetoDeServivios.fechaNacimiento();

        System.out.println( fechaNacimiento );

        objetoDeServivios.diferencia( objetoDeServivios.fechaActual() , fechaNacimiento);

    }
    
}
