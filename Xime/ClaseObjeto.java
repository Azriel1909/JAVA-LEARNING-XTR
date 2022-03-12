package com.company.Xime;

import java.util.Locale;

public class ClaseObjeto {
    public static void main(String[] args)
    {
        //TEMA 25 CLASSES AND OBJECTS
        /*Una clase es un plano para crear cualquier cosa que queramos
        * Una clase es una plantilla en donde creamos objetos con diferentes atributos*/
        //TEMA 26 CREATING CLASSES
        //Crearemos un plano o una plantilla
        //TEMA 27 CREATING OBJECTS
        Lentes lentes1 = new Lentes("NewLentes","Filtro Aplicado",true); // Cuando decimos "new", la variable "Lentes1" es en realidad el objeto
        // Es el objeto de la vida real que estamos modelando o que estamos representando
        // Ya creamos el objeto
        Lentes lentes2 = new Lentes("Frank","Sin Filtro Aplicado",false); // Cuando decimos "new", la variable "Lentes1" es en realidad el objeto
        Lentes lentes3 = new Lentes("Armani","Filtro Aplicado",false); // Cuando decimos "new", la variable "Lentes1" es en realidad el objeto

        //TEMA 28 PRINTING OBJECTS ATTRIBUTES
        System.out.println("Lentes tipo 1".toUpperCase());
        System.out.println(lentes1.marca);
        System.out.println(lentes1.filtroDeLuzAzul);
        System.out.println("¿Es de acetato? "+lentes1.isAcetate);
        System.out.println("Lentes tipo 2".toUpperCase());
        System.out.println(lentes2.marca);
        System.out.println(lentes2.filtroDeLuzAzul);
        System.out.println("¿Es de acetato? "+lentes2.isAcetate);
        System.out.println("Lentes tipo 3".toUpperCase());
        System.out.println(lentes3.marca);
        System.out.println(lentes3.filtroDeLuzAzul);
        System.out.println("¿Es de acetato? "+lentes3.isAcetate);
        //TEMA 29 PROYECTO PASAPORTE --> Pasaporte.java
    }
    //TEMA 26 CREATING CLASSES
    static class Lentes {
        //Atributos de mis lentes -- propiedades de la clase Lentes
        String marca;
        String filtroDeLuzAzul;
        boolean isAcetate;
        //La manera de crear objetos pasando las propiedades de arriba
        //Este es el constructor (la manera en la que construimos objetos)
        Lentes(String marca, String filtroDeLuzAzul, boolean isAcetate)
        {
            //Aquí nos referimos a la instancia actual de la clase actual
            this.marca = marca;
            this.filtroDeLuzAzul = filtroDeLuzAzul;
            this.isAcetate = isAcetate;
        }
        //TODO LO DE ARRIBA ES NUESTRO BLUEPRINT Y ES UNA PLANTILLA PARA CREAR LENTES
    }
}
