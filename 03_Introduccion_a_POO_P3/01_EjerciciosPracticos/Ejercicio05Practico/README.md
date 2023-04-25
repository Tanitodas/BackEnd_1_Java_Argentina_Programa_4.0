## Ejercicio Nº 5
----
### *Enunciado:*
<p> 
Implemente la clase Persona en el paquete entidades. Una persona tiene un 'nombre' y una 'fecha de nacimiento' (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
        
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
</p>

1. Método *'crearPersona'* que pida al usuario 'Nombre' y 'fecha de nacimiento' de la persona a crear. Retornar el objeto Persona creado.

2. Método *'calcularEdad'* que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.

3. Método *'menorQue'* recibe como parámetro una Persona y una edad. Retorna *true* si la persona es menor que la edad consultada o *false* en caso contrario.

4. Método *'mostrarPersona'* que muestra la información de la persona deseada

---
## Estructura de Carpetas
---
El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase 'PersonaServicio' y ver su resultado por consola.

    + *Entidades* : Este paquete almacena la clase *`'PersonaClass'`* la cual nos da la estructura para los objetos de su mismo tipo.

    + *Servicio* : En este paquete se almacena la clase *`'PersonaServicio'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'PersonaClass'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
