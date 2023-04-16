import java.util.Scanner;

import Entidades.Cuenta;

public class CuentaApp {
    public static void main(String[] args) {
        
        Cuenta cuentaBancoGalicia = new Cuenta("Luciano", 200000); //   Instanciacion de la clase CUENTA

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("----------MENÚ CUENTA----------");
            System.out.println("1.  Mostrar saldo de la cuenta.");
            System.out.println("2.  Mostrar titular de la cuenta.");
            System.out.println("3.  Retirar dinero de la cuenta.");
            System.out.println("4.  Salir");
            opcion = entrada.nextInt();

            //entrada.nextLine(); // Limpiamos el buffer del espacio.

            switch ( opcion ) {
                case 1:
    
                    System.out.println("El SALDO disponible de la cuenta es igual a: " + cuentaBancoGalicia.getSaldo() );
                    break;
                
                case 2:
    
                    System.out.println("El TITULAR de la cuenta es igual a: " + cuentaBancoGalicia.getTitular() );
                    break;
    
                case 3:
    
                    cuentaBancoGalicia.retirar_dinero();
                    System.out.println("El saldo Final luego del retiro es igual a: " + cuentaBancoGalicia.getSaldo() );
                    break;
    
                case 4:
    
                    System.out.println("Saliendo del menú...");
                    break;
            
                default:
    
                    System.out.println("Ingresó una opcion no valida");
                    break;
            }

        } while ( opcion != 4 );

        entrada.close();

    }

}
