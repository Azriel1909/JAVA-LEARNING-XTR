package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

//TEMA 8 -- SE IMPORTAN LOS PACKAGES
public class Main {

    public static void main(String[] args) {
	System.out.println("Hallo, its my first java app"); //Imprime desde consola el texto escrito dentro de las comillas
    //System outdoor print line
    //El texto dentro es una cadena = string -- doble comillas

        //TEMA 1 - PACKAGES AND COMMENTS

        //PACKAGES -- Es una manera simple de organizar tus clases de manera conjunta
        // Es un simple directorio que te permite agrupar tus clases
        //Podemos tener comentarios tipo SingleLine como esta
        /*
        *
        *
        * Tenemos este tipo de comentario tipo MultiLine iguales en c++
        * podemos escribir lo que sea por aquí
        *
        *
        * */

        //TEMA 2 - VARIABLES
        /*
        * Una variable es simplemente una caja y dentro de ellas puedes almacenar una sola cosa.
        * Sí yo quiero acceder a esa cosa dentro de la caja(variable), simplemente puedo referirme
        * a la caja.
        *
        * Para definir una variable necesitamos especificar su tipo de datos,
        * necesitamos especificar que contendrá la caja.
        * Loa arreglos son cajas que almacenan un montón de cosas.
        * En resumen, una variable es un lugar para almacenar valores.
        * */

        //TEMA 3 -- TIPO DE DATOS PRIMITIVOS
        //Crearemos una caja para almacenar números
        byte TheByte = -128;
        int numero = 100; //Aquí solo podemos almacenar nombres
        int numeroA = 100_000_300; //podemos colocar guión bajo
        long numeroLargo = 10000000000000L; //Números largos - colocar L
        float Pi = 3.14F; // Números decimales
        double DoublePi = 3.141516; //Números decimales
        boolean esAdulto = true;
        char Letra = 'A'; // Data type  char = comillas simples
        System.out.println(TheByte);
        System.out.println(numero);
        System.out.println(numeroLargo);
        System.out.println(Pi);
        System.out.println(DoublePi);
        System.out.println(esAdulto);
        System.out.println(numeroA);
        System.out.println(Letra);

        //TEMA 4 -- TIPO DE DATOS DE REFERENCIA
        String nombre = "Soy Ximena Toledo"; // Para crear secuencias de caracteres
        String nombreA = new String("Hola amigos."); //Tipo de dato de referencia que me permite almacenar una secuencia de caracteres
        System.out.println(nombre);
        System.out.println(nombreA.toUpperCase());
        LocalDate now = LocalDate.now(); //Nos da la fecha actual
        System.out.println(now);
        System.out.println(now.getMonth()); // Nos da el mes actual

        //TEMA 5 -- DIFERENCIAS ENTRE TIPO DE DATOS PRIMITIVOS Y DE REFERENCIA
        int a = 10;
        int b = a; // la variable b se le asigna el valor de 10 (es una copia de a) y no podemos tocarlo (el valor de b vive en una nueva dirección de memoria)
        a = 100; // Cambiamos el valor de a por 100
        System.out.println("a" + a + " - b" + b);
        /* Concepción de los tipos de datos de referencia */
        Persona xime = new Persona("Xime");
        Persona moyo = new Persona("Moyo");
        System.out.println("Antes de cambiar a Xime");
        System.out.println(xime.nombre + " " + moyo.nombre);

        xime.nombre = "Ximena"; //Cambia el nombre porque apuntamos a esa referencia

        System.out.println("Después de cambiar a Ximena");
        System.out.println(xime.nombre + " " + moyo.nombre);

        //TEMA 6 -- NOMBRANDO VARIABLES
        //colocar nombres de acuerdo a su valor asignado
        int zero = 0;
        int one = 1;
        double numPi = 3.1416;
        //Usaremos Camel Case para ordenar nombres de variables muy largos
        //Ninguna de las variables deben empezar con una letra mayúscula
        int numeroMax = 1_000_000;

        //TEMA 7 -- LA CLASE STRING
        char x = 'X'; //nos permite usar solo un caracter
        String apellido = new String("Mi apellido paterno es Toledo"); //almacena una secuencia de caracteres
        System.out.println(apellido.toUpperCase()); // En esta caso "apellido" es un objeto de tipo String
        //toUpperCase() es un método que hace mayúsculas la cadena de caracteres
        System.out.println(apellido.toLowerCase()); //toUpperCase() es un método que hace minúsculas la cadena de caracteres
        System.out.println(apellido.charAt(1)); //toLowerCase() coloca una letra de acuerdo a su posición
        System.out.println(apellido.contains("Toledo")); //Determina si en la cadena de caracteres coincide con la palabra dentro de este método
        /*Cuando vemos un tipo de datos String, sabemos ahora que se tarta de una clase
        * donde podemos crear objetos e invocar métodos dentro de esos objetos*/
        System.out.println(apellido.equals("Toledo")); // Compara si la cadena de caracteres es exactamente igual a la cadena dentro de este método

        //TEMA 8 -- PACKAGES AND IMPORT KEYWORD
        /*La  keyword PACKAGE simplemente nos dice que estamos dentro de com.company*/
        Date fecha = new Date();
        String s = new String(); //Todo lo que importamos de Java.lang no importa sentencias como las de abajo
        LocalDate fechaActual = LocalDate.now();
        LocalDateTime fechaTiempoActual = LocalDateTime.now();
        /*En la parte de arriba se crean los "import"; usamos import simplemente para traer
        * que pertenecen a diferentes Packages, este IDE nos importa los PACKAGES por nosotros*/

        //TEMA 9 -- Palabras reservadas
        // Las palabras reservadas son palabras claves ocupadas  para que el lenguaje los ocupe él mismo
        int numberA = 0;

        //TEMA 10 -- OPERACIONES ARITMÉTICAS --> Xime.java
    }
    /* Concepción de los tipos de datos de referencia -- TEMA 5 CONTINUACIÓN */
    static class Persona {
        String nombre;
        Persona(String nombre) {
            this.nombre = nombre;
        }
    }

}
