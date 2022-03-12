package com.company.Xime;

public class Condicionales {
    public static void main(String[] args) {
        //TEMA 12 -- IF STATEMENTS
        //CASO 1
        int age = 20;
        if (age >= 18 ){
            System.out.println("Es un adulto");
        }
        //CASO 2
        int age2 = 17;
        if (age2 >= 18 ){
            System.out.println("Es un adulto");
        }
        else {
            System.out.println("No es un adulto");
        }
        // CASO 3
        int age3 = 17;
        if (age3 >= 18 ){
            System.out.println("Es un adulto");
        }
        else if ( age3 >= 16 && age3 < 18 ) // OTRO BLOQUE DE CONDICIÓN ADICIONAL
        {
            System.out.println("Casi es un adulto");
        } else {
            System.out.println("No es un adulto");
        }
        //TEMA 13 -- EXPRESIONES TERNARIAS --> Ternario.java
    }
}
