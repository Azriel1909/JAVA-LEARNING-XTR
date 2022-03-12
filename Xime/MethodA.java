package com.company.Xime;

import java.util.Arrays;

public class MethodA {
    public static void main(String[] args)
    {
        //TEMA 22 METHODS
        /*Los métodos son un bloque de código que sólo corren cuando los llamamos
        +Podemos pasar data dentro de un método y esto se le conoce como parámetros
        +Los métodos se utilizan para realizar cualquier lógica
        +Cuando hablamos de lógica, nos referimos a acciones ya sea para transformar data o cualquier pedazo de código
        que realiza algo.
        +Tenemos dos tipos de métodos
            1 Built Method - Son métodos proporcionados por Java Runtime environment (entorno de ejecución)
            2 User Predefined - Son métodos construidos por nosotros
        */
        System.out.println("Hola"); // println() es un método y los paréntesis simplemente implica que estamos invocando el método actual
        //este método imprime en pantalla el texto y es proporcionado por default, nosotros no escribimos este método por nuestra cuenta
        String text1 = "ich Heisse Xime";
        System.out.println(text1.toUpperCase());
        //En el método toUpperCase() no pasamos data, de hecho solo la transformamos
        boolean startsWhithS = text1.startsWith("i");
        //Este método nos regresa un booleano
        System.out.println(text1.startsWith("i"));
        System.out.println(text1.endsWith("e"));
        //TEMA 23 UNDERSTANDING METHODS
        char [] letras = {'A','A','B','C','D','D','D'};
        //Vamos a crear un método que contaré el número de veces que aparece la letra.

        //Llamaremos el método de abajo
        int contar = contarVeces(letras,'A');
        System.out.println(contar);
        //Programar nos resuelve problemas a partir de la creación de métodos y
        //escribiendo algoritmos dentro de ellos.
        //Los algoritmos son una secuencia de pasos para resolver un problema
    }
    public  static  int contarVeces (char[] letrasA ,char buscarLetra) //We use Camel case here y estamos mandando datos del tipo char
            //Public significa que este método es accesible por otras clases
            //static significa que ese método pertenece a una clase
            //EL int es el tipo de valor que devolveremos de este método
    {
        System.out.println("El método se invocó --->");
        //TEMA 24 USER DEFINED METHODS
        int contador = 0;
        for (char letra : letrasA)
        {
            //Haremos una comparación
            if (letra == buscarLetra)
            {
                //Vamos a incrementar el contador
                //Tendremos que hacer un seguimiento del contador que nos iga cuantas veces aparece la letra en nuestro arreglo
                contador ++;
            }
        }
        return contador ;
        //TEMA 25 CLASSES AND OBJECTS --> ClaseObjeto.java
    }
}
