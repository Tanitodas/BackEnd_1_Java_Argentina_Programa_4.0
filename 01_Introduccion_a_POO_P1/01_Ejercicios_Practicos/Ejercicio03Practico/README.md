## Ejercicio Nº 3


### *Enunciado:*

Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:

a) Método constructor con todos los atributos pasados por parámetro.

b) Metodo constructor sin los atributos pasados por parámetro.

c) Métodos get y set.

d) Método para `crearOperacion()`: que le pide al usuario los dos números y los
    guarda en los atributos del objeto.
    
e) Método `sumar()`: calcular la suma de los números y devolver el resultado al main.

f) Método `restar()`: calcular la resta de los números y devolver el resultado al main.

g) Método `multiplicar()`: primero valida que no se haga una multiplicación por cero,
    si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
    error. Si no, se hace la multiplicación y se devuelve el resultado al main.

h) Método `dividir()`: primero valida que no se haga una división por cero, si fuera a
    pasar una división por cero, el método devuelve 0 y se le informa al usuario el
    error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
    al main.

## Estructura de Carpetas

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase *`'Libro'`* y ver su resultado por consola.

    + *Entidades* : Este paquete almacena la clase *`'Operacion'`* la cual nos da la estructura para los objetos de su mismo tipo y ademas los metodos que utilizaremos con ellos.

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.
