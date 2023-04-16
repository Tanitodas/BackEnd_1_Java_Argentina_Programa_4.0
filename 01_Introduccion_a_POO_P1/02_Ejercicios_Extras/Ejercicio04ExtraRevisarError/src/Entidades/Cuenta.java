package Entidades;

import java.util.Scanner;

// Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
// Luego, crea un método "retirar_dinero" que permita retirar una cantidad
// de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
// negativo después de realizar una transacción de retiro

public class Cuenta {
    
    // ATRIBUTOS DE LA CLASE

        private String titular;
        private double saldo;

    // CONSTRUCTORES DE LA CLASE

        public Cuenta() {
        }

        public Cuenta(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

    //  MÉTODOS GETTER Y SETTERS

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

    //  MÉTODOS PERSONALIZADOS DE LA CLASE

        public double retirar_dinero() {
            
            Scanner entrada = new Scanner(System.in);
            double montoRetirar;
            double saldoActual;
            
            System.out.println("Ingrese el monto que desea retirar");
            montoRetirar = entrada.nextDouble();

            entrada.nextLine(); // Borramos el enter del buffer

            if ( montoRetirar > this.saldo ) {
                    
                System.out.println("El monto a retirar es mayor al saldo disponible");

            } else {

                saldoActual = this.saldo - montoRetirar;

                System.out.println("---------------------------");
                System.out.println("Entregando " + montoRetirar);
                System.out.println("---------------------------");

                this.saldo = saldoActual;

            }
                
            entrada.close();
            
            return saldo;
            
        }

}
