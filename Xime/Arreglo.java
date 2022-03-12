package com.company.Xime;

import java.util.Arrays;

public class Arreglo {
    public static void main(String[] args){
        //TEMA 15 -- ARRAYS
        //Variables que guardan más de un valor
        int [] saveNumbers = new int [9];
        System.out.println(Arrays.toString(saveNumbers));
        //los números dentro del arreglo se inicializarán en cero
        //Ahora debemos especificar cuantos items guardará mi arreglo de números
        String [] saveStrings = new String[9];
        System.out.println(Arrays.toString(saveStrings));

        //La manera de agregar números dentro del arreglo:
        saveNumbers[0] = 0; //En la posición cero, guardarás el valor de 0
        saveNumbers[1] = 1;
        saveNumbers[2] = 2;
        System.out.println(Arrays.toString(saveNumbers));
        //Aquí vamos llenando los valores en el arreglo

        //PARA HACERLO EN UNA SOLA LINEA
        int [] saveNumbers2 = {0,1,2,3,4,5,6,7,8}; //Aquí no especificas el tamaño del arreglo
        System.out.println(Arrays.toString(saveNumbers2));
        System.out.println(saveNumbers2.length); //Cuantos items hay dentro del arreglo

        String [] nombres = {"Xime","Moyo","Dan"};
        System.out.println(Arrays.toString(nombres));
        System.out.println(nombres.length);

        //TEMA 16  ARREGLOS E INDICES --> ArregloIndex.java
    }
}
