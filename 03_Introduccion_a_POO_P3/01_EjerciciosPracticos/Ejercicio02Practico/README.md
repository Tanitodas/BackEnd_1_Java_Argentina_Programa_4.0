## Ejercicio Nº 2
----
### *Enunciado:*
<p> 
Realizar una clase llamada 'ParDeNumeros' que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. 

La clase debe tener un constructor vacío, getters y setters.En el constructor vacío se usará el Math.random para generar los dos números. 

Crear una clase 'ParDeNumerosService', en el paquete Servicios, que deberá además implementar los siguientes métodos:
</p>

1. Método *'mostrarValores'* que muestra cuáles son los dos números guardados.

2. Método *'devolverMayor'* para retornar cuál de los dos atributos tiene el mayor valor

3. Método *'calcularPotencia'* para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.

4. Método *'calcularRaiz'* para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del numero.

---
## Estructura de Carpetas
---
El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase *`'ParDeNumerosClass'`* y ver su resultado por consola.

    + *Entidades* : Este paquete almacena la clase *`'ParDeNumerosClass'`* la cual nos da la estructura para los objetos de su mismo tipo.

    + *Servicio* : En este paquete se almacena la clase *`'ParDeNumerosServicio'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'ParDeNumerosClass'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
