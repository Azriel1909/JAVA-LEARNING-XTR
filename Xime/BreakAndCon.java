package com.company.Xime;

public class BreakAndCon {
    public static void main(String[] args)
    {
        //TEMA 18 BREAK AND CONTINUE
        String [] nombres = {"Xime","Moyo","Mario","Dan","Gerardo","Mike"};
        for (String nombre : nombres) {
            System.out.println(nombre);
            break;
            //Solo muestra nombre del primer índice
        }
        for (String nombre : nombres) {
            if (nombre.equals("Dan")){
                break;
                //Se termina hasta encontrar el nombre de Dan
            }
            System.out.println(nombre);
        }
        //CASO 2
        for (String nombre : nombres) {
            if (nombre.startsWith("X")){
                continue;
                //Va al principio del bucle(loop) y corre todo de nuevo
            }
            System.out.println(nombre);
            //TEMA 19 WHILE LOOP --> WhileLoop.java
        }
    }
}
