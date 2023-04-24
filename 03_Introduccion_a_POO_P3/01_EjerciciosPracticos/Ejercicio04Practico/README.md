## Ejercicio Nº 4
----
### *Enunciado:*
<p> 
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en el paquete Servicios, que tenga los siguientes métodos:
</p>

1. Método *'fechaNacimiento'* que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto de tipo *Date*. El método debe retornar el objeto *Date*.
Ejemplo:
    ``` java
    Date fecha = new Date(anio, mes, dia);
    ```

2. Método *'fechaActual'* que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo:
    ``` java
    Date fechaActual = new Date();
    ```
3. Método *'diferencia'* que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

*NOTA* : Si necesitan acá tienen más información de la clase Date: [Documentacion Oracle](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)

---

## Estructura de Carpetas

---

El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:<p> Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio. </p> 
Los paquetes contenidos en esta carpeta son:

    + *'Aplicacion'* : Este paquete almacena el metodo `main`.
    + *'Servicios'* : En este paquete almacenamos la clase `FechaServicios` la cual implementa los diferentes metodos que requiere el ejercicio.

<p></p>

+ *`'lib'`*: <p> Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio. </p>

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
