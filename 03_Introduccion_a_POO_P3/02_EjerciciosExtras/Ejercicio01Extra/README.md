## Ejercicio Nº 1 (Extra)

### *Enunciado:*

Crea una clase en Java donde declares una variable de tipo array de *Strings* que contenga los doce meses del año, en minúsculas.

A continuación, declara una variable *'mesSecreto'* de tipo *String*, y hazla igual a un elemento del array. Por ejemplo, *'mesSecreto'* = mes[9]. 

El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. 

Un ejemplo de ejecución del programa podría ser este:

```
-----------Adivine el mes secreto-----------. 

Introduzca el nombre del mes en minúsculas:
febrero

No ha acertado. 

Intente adivinarlo introduciendo otro mes: 
agosto

¡Ha acertado!
 ```

---
### Estructura de Carpetas
---
El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase 'ClaseServicio' y ver su resultado por consola.

    + *Entidades* : Este paquete almacena la clase *`'Clase'`* la cual nos da la estructura para los objetos de su mismo tipo.

    + *Servicio* : En este paquete se almacena la clase *`'ClaseServicio'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'Clase'`*. En este caso solamente tenemos un metodo que nos asigna un valor aleatorio de *mes* al atributo de la *`'Clase'`* llamado *`'mesSecreto'`*. 
    Esto no esta incluido en el enunciado del ejercicio pero lo añadimos para complejisar la resolucion ya que considere que era un ejercicio muy basico.

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
