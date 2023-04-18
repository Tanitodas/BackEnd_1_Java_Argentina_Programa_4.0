package Servicio;

import java.util.Scanner;
import Entidades.CuentaClass;

public class CuentaServicios {
    
    //  ATRIBUTOS DE LA CLASE SERVICIOS

        // Asignamos al Scanner como atributo de la clase para tenerlo como clase global
        // y poder utilizarla en los diferentes metodos.
        Scanner entrada = new Scanner(System.in);

    //  CONSTRUCCTOR EN LA CLASE SERVICIOS

        // Este constructor nos va a permitir crear un metodo que nos devuelva un OBJETO
        // de tipo CUENTA.

        public CuentaClass crearCuentaBancaria() {

            System.out.println("Ingrese el numero de la cuenta");
            int numeroDeCuenta = entrada.nextInt();

            System.out.println("Ingrese el numero de documento del Usuario propietario de la cuenta:");
            long DNI = entrada.nextLong();

            System.out.println("Ingrese el saldo actual de la cuenta");
            double saldoActual = entrada.nextDouble();

            System.out.println("Ingrese el interes de la cuenta");
            double interes = entrada.nextDouble();

            // En esta linea devolvemos la construccion de un Objeto de tipo Cuenta con el constructor
            // que utiliza parametros.
            return new CuentaClass(numeroDeCuenta, DNI , saldoActual, interes);
        }

    // METODOS PERSONALIZADOS creados por nosotros.

        // Metodo para ingresar dinero a la cuenta
        public void ingresarDinero( CuentaClass cuentaBancaria ) {  // Al metodo le ingreso como parametro un OBJETO.

            double ingreso;

            System.out.println("Ingrese el monto a DEPOSITAR:");
            ingreso = entrada.nextDouble();

            cuentaBancaria.setSaldo( ingreso + cuentaBancaria.getSaldo() ); 

            System.out.println("El saldo final es igual a: " + cuentaBancaria.getSaldo() );

        }

        // Metodo para retirar dinero de la cuenta
        public void retirarDinero( CuentaClass cuentaBancaria ) {
        
            double retiro;

            System.out.println("Ingrese el monto a RETIRAR:");
            retiro = entrada.nextDouble();

            cuentaBancaria.setSaldo( cuentaBancaria.getSaldo() - retiro );

            if ( cuentaBancaria.getSaldo() <= 0) {
                
                System.out.println("El saldo de la cuenta es igual a: 0");

            } else {

                System.out.println("El saldo final es igual a: " + cuentaBancaria.getSaldo() );

            }
        
        }

        // Metodo para la extraccion rapida del dinero.
        public void extraccionRapida( CuentaClass cuentaBancaria ) {
            
            double retiro;

            System.out.println("Ingrese el monto a RETIRAR:");
            retiro = entrada.nextDouble();

            if ( retiro <= ( cuentaBancaria.getSaldo() * 0.2 )) {
                
                cuentaBancaria.setSaldo( cuentaBancaria.getSaldo() - retiro );

                System.out.println("El saldo final es igual a: " + cuentaBancaria.getSaldo() );

            } else {

                System.out.println("No se puede retirar mas de un 20% del saldo a traves de este metodo");

            }

        }

        // Metodo para consultar saldo.
        public void consultarSaldo( CuentaClass cuentaBancaria ) {
            
            System.out.println("El saldo disponible es igual a: " + cuentaBancaria.getSaldo() );

        }

        // Metodo para consultar datos de la cuenta.
        public void consultarDatos( CuentaClass cuentaBancaria ) {
            
            System.out.println("El numero de la cuenta es igual a : " + cuentaBancaria.getNumeroDeCuenta() );
            System.out.println("El DNI asociado a esta cuenta es igual a: " + cuentaBancaria.getDNI() );
            System.out.println("El saldo actual de la cuenta es igual a: " + cuentaBancaria.getSaldo() );
          
        }

}
