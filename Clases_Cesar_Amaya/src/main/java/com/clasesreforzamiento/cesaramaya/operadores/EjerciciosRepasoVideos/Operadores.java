package com.clasesreforzamiento.cesaramaya.operadores.EjerciciosRepasoVideos;

import java.time.LocalDate;

public class Operadores {
    public static void main(String[] args) {
        int value1 = 2;
        int value2 = 3;
        int value3 = 0;
        int result1 = value1 + value2 * value1 / 2 % 5;
        // System.out.println("Result1: " +result1 );//5
        System.out.println(2%5);
        int result2 = (value1 + value2) * value1 / 2 % 5;
        System.out.println("Result2: " +result2 );//0
        int result3 =  value1 + value2 / value2 +1;
        System.out.println("Result3: " +result3 );//4

        Object obj = new Object();
        LocalDate localDate = LocalDate.now();
        System.out.println(obj + " " + localDate.toString() + "");//error
        System.out.println(null + "");
    }


}
