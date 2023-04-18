// Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
// atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
// operaciones asociadas a dicha clase son:
//
//      • Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//
//      • Agregar los métodos getters y setters correspondientes.
//
//      • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//
//      • Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//        ingresar y se la sumara a saldo actual.
//
//      • Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//        se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//        pondrá el saldo actual en 0.
//
//      • Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//        que el usuario no saque más del 20%.
//
//      • Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//
//      • Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

package Entidades;

public class CuentaClass {
    
    // ATRIBUTOS de la clase
    private int numeroDeCuenta;
    private long DNI;
    private double saldoActual;
    private double interes;
    
    
    // CONSTRUCTORES

        // Constructor vacio.
        public CuentaClass() {
        }

        //Constructor con parametros.
        public CuentaClass(int numeroDeCuenta, long DNI, double saldoActual , double interes) {
            this.numeroDeCuenta = numeroDeCuenta;
            this.DNI = DNI;
            this.saldoActual = saldoActual;
            this.interes = interes;
        }

    // GETTERS y SETTERS

        public int getNumeroDeCuenta() {
            return numeroDeCuenta;
        }

        public void setNumeroDeCuenta(int numeroDeCuenta) {
            this.numeroDeCuenta = numeroDeCuenta;
        }

        public long getDNI() {
            return DNI;
        }

        public void setDNI(long dNI) {
            this.DNI = dNI;
        }

        public double getSaldo() {
            return saldoActual;
        }

        public void setSaldo(double saldoActual) {
            this.saldoActual = saldoActual;
        }

        public double getInteres() {
            return interes;
        }

        public void setInteres(double interes) {
            this.interes = interes;
        }

    @Override
    public String toString() {
        return "CuentaClass [numeroDeCuenta=" + numeroDeCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual
                + ", interes=" + interes + "]";
    }

}
