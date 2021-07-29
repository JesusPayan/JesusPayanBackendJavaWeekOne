package com.clasesreforzamiento.eduardozampayo.wrapperclasses;

public class AutoboxingExample {
    public static void main(String[] args) {
      Integer y = new Integer(567);
      int x = y.intValue();
      x++;
      y = new Integer(x);
        System.out.println("before to Java 5");
        System.out.println(y);
        System.out.println("After Java 5");
        Integer y2  = new Integer(567);
        y2++;
        System.out.println(y2);
        System.out.println("-----------Other Example-------------");
            Integer y3 = 567 ;
            Integer x2 = y3;
        System.out.println(y == x);
        System.out.println("-----------Anotherf Example-------------");

        Integer i2 = 1000;
        Integer i3 = 1000;
        if (i2 != i3) {
            System.out.println("Diferent object");
        } else {
            System.out.println("Same object ");
        }
        if (i2.equals(i3)){
            System.out.println("maenfullly equal");
        }
        String s1 = i2.toString();
        if(s1.equals(i2)){
            System.out.println("son lo mismo");
        }else{
            System.out.println("son diferentes");
        }


    }
}
