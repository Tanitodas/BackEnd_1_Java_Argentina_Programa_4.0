## Ejercicio Extra_Extra Nº 7:

### *Enunciado:*

Crear la clase “Autobús” con los siguientes atributos:  identificación, capacidad máxima de pasajeros,
capacidad actual de pasajeros y cantidad de paradas. Luego agregar constructores, setters y getters.

Crear la clase “AutobúsServicio”, la misma contendrá los siguientes métodos:

+ Método `crearAutobús`: se pedirá al usuario que ingrese los datos.

+ Método `inicioRecorrido(int cantidad)`, recibirá por parámetro la cantidad de personas que suben al
  autobús en el inicio del recorrido. La misma no debe superar la capacidad máxima del autobús.

+ Método `finRecorrido()`, debe simular la finalización del recorrido y por lo cual el autobús debe quedar vacío.

+ Método `subirPasajeros(int cantidad, int parada)`, recibe por parámetro la cantidad de personas a subir y el númerode parada.
  En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada debe ejecutarse el 

+ Método `inicioRecorrido(int cantidad)`. En el caso que sea la última parada, debe informar al usuario que se encuentra
  en la finalización del recorrido y no pueden subir más pasajeros.
  Si el número de parada es distinto al número de inicio y de finalización, debe subir a los pasajeros 
  indicados, analizando la capacidad actual y verificando que no sobrepase la capacidad máxima.
  Solamente podrán subir pasajeros hasta cubrir la capacidad máxima.

+ Método `bajarPasajeros (int cantidad, int parada)`, recibe por parámetro la cantidad de personas a bajar del autobús y el número de paradas.
  En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada, se debe 
  informar al usuario que el autobús aún se encuentra vacío. En el caso que sea la última parada, se debe ejecutar 
  el método finRecorrido().
  Si el número de parada es distinto al número de inicio y de finalización, deben bajar los pasajeros indicados.


## *Estructura de Carpetas:*

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
  
 + *Aplicacion* : Este paquete almacena la clase *`'Main'`* en donde ponemos a prueba los diferentes metodos de la clase *`'AutobusService'`* y ver su resultado por consola..
  
 + *Entidades* : Este paquete almacena la clase *`'AutobusClass'`* la cual nos da la estructura para los objetos de su mismo tipo.
  
    + *Servicio* :  En este paquete se almacena la clase *`'AutobusService'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'AutobusClass'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
