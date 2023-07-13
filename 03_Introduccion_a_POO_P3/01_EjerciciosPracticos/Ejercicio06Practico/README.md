## Ejercicio Nº 6

### *Enunciado:*
<p> 
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso.

Para ello, crearemos una clase en entidad llamada 'Curso', cuyos atributos serán: *nombreCurso*, *cantidadHorasPorDia*, *cantidadDiasPorSemana*,
*turno* (mañana o tarde), *precioPorHora* y *alumnos*. 

Donde 'alumnos' es un arreglo de tipo *String* de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno.

A continuación, se implementarán los siguientes métodos:
</p>

1. Un contructor por defecto.

2. Un constructor con todos los atributos pasados por parametros.

3. Métodos Getters y Setters de cada atributo.

4. Método *'cargarAlumnos()'* : este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada 
repetición que se ingrese el nombre de cada alumno.

5. Método *'crearCurso()'* : el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos.

6. Método *'calcularGananciaSemanal()'* : este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
---
### Estructura de Carpetas
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
