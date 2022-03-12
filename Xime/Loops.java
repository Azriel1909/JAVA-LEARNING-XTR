package com.company.Xime;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Loops {
    public static void main(String[] args)
    {
        //TEMA 17 LOOPS
        //CASO 1
        int [] saveNumbers = {0,1,2,3,4,5,6,7,8,9};
        for (int num : saveNumbers){
            System.out.println(num);
        }
        System.out.println("FIN");
        //CASO 2
        int numero = 0;
        for (int i = 0; i < saveNumbers.length; i++)
        {
            System.out.println(saveNumbers[i]);
        }
        System.out.println("FIN");
        //Reverse order
        for (int i = saveNumbers.length -1; i>=0; i--)
        {
            System.out.println(saveNumbers[i]);
        }
        System.out.println("FIN");
        //CASO 3
        String [] nombres = {"Xime","Moyo","Dan","Mike","Mario"};
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        System.out.println("FIN");
        //podemos escribir nombres.for y nos aparecerán bastantes ideas relacionadas
        //CASO 4
        Arrays.stream(saveNumbers).forEach(System.out::println);
        //ESTA ES UNA de las maneras para hacer un bucle a través de un arreglo
        Arrays.stream(nombres).forEach(System.out::println);
        //TEMA 18 BREAK AND CONTINUE --> BreakAndCon.java

    }
}
