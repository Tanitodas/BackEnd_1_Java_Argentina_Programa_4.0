## Ejercicio Nº 2

### *Enunciado:*

Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:

• Constructor predeterminado o vacío.

• Constructor con la capacidad máxima y la cantidad actual.

• Métodos getters y setters.

• Método `llenarCafetera()`: hace que la cantidad actual sea igual a la capacidad
  máxima.

• Método `servirTaza(int)`: se pide el tamaño de una taza vacía, el método recibe el
  tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
  cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
  método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
  cuanto quedó la taza.

• Método `vaciarCafetera()`: pone la cantidad de café actual en cero.

• Método `agregarCafe(int)`: se le pide al usuario una cantidad de café, el método lo
  recibe y se añade a la cafetera la cantidad de café indicada.

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
  
 + *Aplicacion* : Este paquete almacena la clase *`'Main'`* en donde ponemos a prueba los diferentes metodos de la clase *`'CafeteraService'`* y ver su resultado por consola..
  
 + *Entidades* : Este paquete almacena la clase *`'CafeteraClass'`* la cual nos da la estructura para los objetos de su mismo tipo.
  
    + *Servicio* :  En este paquete se almacena la clase *`'CafeteraService'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'CafeteraClass'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
