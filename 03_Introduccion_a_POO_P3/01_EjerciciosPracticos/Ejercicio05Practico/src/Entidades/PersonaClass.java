package Entidades;

import java.util.Date;

public class PersonaClass {
    
    // ATRIBUTOS DE LA CLASE

        String nombre;
        Date fechaDeNacimiento;
       
    // CONSTRUCTORES DE LA CLASE PERSONA    

        public PersonaClass() {
        }

        public PersonaClass(String nombre, Date fechaDeNacimiento) {
            this.nombre = nombre;
            this.fechaDeNacimiento = fechaDeNacimiento;
        }

    // GETTERS y SETTERS

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Date getFechaDeNacimiento() {
            return fechaDeNacimiento;
        }

        public void setFechaDeNacimiento(Date fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
        }

    // MÉTODO TO STRING

        @Override
        public String toString() {
            return "PersonaClass [nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
        }

}
