package com.company.Xime;

public class Xime {
    public static void main (String[] args)
    {
        //TEMA 10 -- OPERACIONES ARITMÉTICAS + - * %
        int diez = 10;
        int dos = 2;
        int suma = diez + dos;
        int resta = diez - dos;
        System.out.println(suma + 20);
        System.out.println(resta * 3);
        System.out.println(10*2);
        System.out.println("10 % 2  = " + 10 % 2);

        //TEMA 11 -- THE MATH CLASS
        System.out.println(Math.abs(-10)); //método que nos da el valor absoluto
        System.out.println(Math.max(3.6, 10.11)); // Max
        System.out.println(Math.min(3.6, 10.11)); // Min
        System.out.println(Math.pow(5.0, 2)); // Exponente
        System.out.println((int)Math.pow(5.0, 2)); // Exponente con decimales o enteros
        System.out.println((int)Math.sqrt(25)); //Raź cuadrada con decimales o enteros
        System.out.println(Math.PI); // El valor de Pi

        //TEMA 11 -- COMPARADORES DE VALORES

        int ximAge = 20;
        int moyAge = 15;

        boolean isXimAgeOlderThanMoyAge = ximAge > moyAge;
        System.out.println(isXimAgeOlderThanMoyAge);
        System.out.println(ximAge < moyAge);
        System.out.println(ximAge == moyAge);
        System.out.println(ximAge != moyAge);
        System.out.println(ximAge >= moyAge);
        System.out.println(ximAge <= moyAge);

        //TEMA 11 -- OPERADORES LÓGICOS
        boolean isAdult = true;
        boolean isStudent = true;
        System.out.println(isAdult && isStudent);
        // && se refiere a que todas las expresiones deben ser ciertas de lo contario toda la condición es falsa
        boolean isAdultA = false;
        boolean isStudentA = true;
        System.out.println(isAdultA || isStudentA);
        // && se refiere a que algunas de las expresiones pueden ser ciertas, no todas y toda la condición es verdadera.
        boolean isAdultB = false;
        boolean isStudentB = true;
        Boolean delIPN = true;
        System.out.println((isAdultB || isStudentB) && delIPN);
        //! se refiere a que no pertenece a ese valor
        boolean isAdultC = false;
        boolean isStudentC = false;
        Boolean delIPNa = true;
        System.out.println((!isAdultC || isStudentC) && delIPNa);
        String name = "Ximena";
        System.out.println(10>8 || 2<=2 && isAdult && name.contains("X"));
        //TEMA 12 -- IF STATEMENTS ---> condicionales.java
    }
}
