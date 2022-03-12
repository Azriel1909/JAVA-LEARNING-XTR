package com.company.Xime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args)
    {
    //TEMA 19 WHILE LOOP
        int counter = 0;
        while (counter <= 29){
            System.out.println("Numero - " + counter);
            counter ++;
        }
        System.out.println("END");
        //TEMA 20 DO WHILE LOOP
        //No importa que haré al menos una vez mientras la condición se cumpla
        int counterA = 0;
        do {
            System.out.println("Numero - " + counterA);
            counterA ++;
        }
        while (counterA < 20);
        //TEMA 21 SCANNER
        //La clase SCANNER te permite como usuario tomar la entrada desde la consola
        //Username
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Enter name - ");
        //NextLine significa que tomara la cadena actual desde la consola
        String userName = Entrada.nextLine();
        System.out.println("Hola¡" + userName);
        System.out.println("Enter age - ");
        int age = Entrada.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You must were born in - " + year );
        if (age < 18){
            System.out.println(" and you are not an adult.");
        } else
        {
            System.out.println(" and you are and adult.");
        }
        //TEMA 22 METHODS ---> MethodA.java
    }
}
