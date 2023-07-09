## Ejercicio Extra Nº 1:

### *Enunciado:*

Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2do grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:

+  Método `getDiscriminante()`: devuelve el valor del discriminante (double). El discriminante tiene la siguiente formula: (b^2)-4*a*c
+  Método `tieneRaices()`: devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
+  Método `tieneRaiz()`: devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
+  Método `obtenerRaices()`: llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles soluciones.
+  Metodo `obtenerRaiz()`: llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
+  Método `calcular()`: esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos.
+ `ObtenerRaices()` o `obtenerRaiz()`, según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2do grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b

### *Estructura de Carpetas:*

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
  
 + *Aplicacion* : Este paquete almacena la clase *`'Main'`* en donde ponemos a prueba los diferentes metodos de la clase *`'RaicesService'`* y ver su resultado por consola..
  
 + *Entidades* : Este paquete almacena la clase *`'RaicesClass'`* la cual nos da la estructura para los objetos de su mismo tipo.
  
    + *Servicio* :  En este paquete se almacena la clase *`'RaicesService'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'RaicesClass'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
