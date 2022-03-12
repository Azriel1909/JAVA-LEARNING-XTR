package com.company.Xime;

public class Menu {
    public static void main(String[] args)
    {
        //TEMA 14 -- SWITCH STATEMENTS
        String gender = "FEMALE";
        if(gender.equals("FEMALE")){

        } else if (gender.equals("MALE")){

        } else if (gender.equals("PREFER_NOT_SAY")){

        } else {

        }
        //Lo de arriba lo podemos hacer así
        switch (gender){
            case "FEMALE":
                System.out.println("Eres una mujer");
                break;
            case "MALE":
                System.out.println("Eres un hombre");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("Sin genero asignado");
                break;
            default:
                System.out.println("Género no identificado");
        }
        //TEMA 15 -- ARRAYS --> Arreglo.java
    }
}
