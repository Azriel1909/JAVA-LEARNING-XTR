package com.company.Xime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Pasaporte {
    public static void main(String[] args)
    {
        //TEMA 29 PROYECTO PASAPORTE
        ClasePasaporte pasaporteMex = new ClasePasaporte("9999", LocalDate.of(2025,1,1),"México");
        ClasePasaporte pasaporteUK = new ClasePasaporte("1919", LocalDate.of(2026,2,2),"Estados unidos");
        System.out.println("persona 1".toLowerCase());
        System.out.println(pasaporteMex.number);
        System.out.println(pasaporteMex.country);
        System.out.println(pasaporteMex.expiryDate);
        System.out.println("persona 2".toLowerCase());
        System.out.println(pasaporteUK.number);
        System.out.println(pasaporteUK.country);
        System.out.println(pasaporteUK.expiryDate);
    }
    static class ClasePasaporte {
        String number;
        String country;
        LocalDate expiryDate;
        ClasePasaporte(String number, LocalDate expiryDate,String country)
        {
            //constructor
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
