# Ejercicio Nº 1
----
### *Enunciado:*
<p> 
Realizar una clase llamada 'Cadena', en el paquete de entidades, que tenga como atributos una frase (String) y su longitud. 

Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 

Crear una clase 'CadenaServicio' en el paquete servicios que implemente los siguientes métodos:
</p>

1. Método *'mostrarVocales'* que deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

2. Método *'invertirFrase'* , deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

3. Método *'vecesRepetido' (String letra)* recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:

    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

4. Método *'compararLongitud' (String frase)* , deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.

5. Método *'unirFrase' (String frase)* , deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.

6. Método *'reemplazar' (String letra)* , deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

7. Método *'contiene' (String letra)*, deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

---
### Estructura de Carpetas
---
El espacio de trabajo contiene dos carpetas por defecto.
Ellas son:

+ *`'src'`*:
    <p>Esta carpeta contiene todos los paquetes que realizamos para resolucion del ejercicio.</p>

    Estos paquetes son:
    + *Aplicacion* : En este paquete se guarda el metodo *`main`* en donde ponemos a prueba los diferentes metodos de la clase *`'CadenaServicios'`* y ver su resultado por consola.

    + *Entidades* : Este paquete almacena la clase *`'CadenaClass'`* la cual nos da la estructura para los objetos de su mismo tipo.

    + *Servicio* : En este paquete se almacena la clase *`'CadenaServicio'`*. La cual esta destinada a contener los metodos personalizados que utilizaremos sobre los objetos de la clase *`'CadenaClass'`*

+ *`'lib'`*: Esta carpeta no se ve reflejada en el repositorio ya que no utilizamos librerias para realizar este ejercicio.

---

*NOTA* : Si desea personalizar la estructura de carpetas, abra `.vscode/settings.json` y actualice la configuración relacionada allí.
