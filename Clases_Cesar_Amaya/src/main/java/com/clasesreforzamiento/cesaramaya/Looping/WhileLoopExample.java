package com.clasesreforzamiento.cesaramaya.Looping;

public class WhileLoopExample {
    public static void main (String[] args){
        int i = -1;
        boolean encontrado = false;
        int[] medidas = {10, 30, 40, 50, 70};
        while (++i < 5 && !encontrado){
            if(medidas[i] == 40){
                encontrado = true;
            }
        }
        System.out.println(i);
    }

}
