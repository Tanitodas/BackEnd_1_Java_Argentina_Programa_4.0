## Ejercicio Nº 1

### *Enunciado:*

Realizar una clase llamada "Cuenta" (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:

 • Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.

 • Agregar los métodos getters y setters correspondientes.

 • Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.

 • Método `ingresar(double ingreso)`: el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
 
 • Método `retirar(double retiro)`: el método recibe una cantidad de dinero a retirar y
   se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
   pondrá el saldo actual en 0.

 • Método `extraccionRapida()`: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.

 • Método `consultarSaldo()`: permitirá consultar el saldo disponible en la cuenta.
 
 • Método `consultarDatos()`: permitirá mostrar todos los datos de la cuenta

## Estructura de Carpetas

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
  
 + *Aplicacion* : Este paquete almacena la clase *`'Main'`* en donde ponemos a prueba los diferentes metodos de la clase *`'CuentaService'`* y ver su resultado por consola..
  
 + *Entidades* : Este paquete almacena la clase *`'CuentaClass'`* la cual nos da la estructura para los objetos de su mismo tipo.
  
    + *Servicio* :  En este paquete se almacena la clase *`'CuentaService'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'Cuenta'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.
