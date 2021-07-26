package com.clasesreforzamiento.cesaramaya.Looping;

public class BucleBreakLabeled {
    public static void main (String[] args){
        boolean esVerdadero = true;
        externo: //etiqueta la siguiente sentencia, es decir el for.
        for (int i = 0; i<5; i++){
            while (esVerdadero){
                System.out.println("Hola!");
                break externo; //break con etiqueta, hace que rompa la sentencia de la etiqueta, el for.
            }
            System.out.println("Despues del while!");
        }
        System.out.println("Despues del for!");
    }
}
