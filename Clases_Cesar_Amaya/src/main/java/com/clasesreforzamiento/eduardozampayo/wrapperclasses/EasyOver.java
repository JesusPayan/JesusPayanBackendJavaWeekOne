package com.clasesreforzamiento.eduardozampayo.wrapperclasses;

public class EasyOver {
        static void go(int x ){
            System.out.println("int ");
        }
    static void go(long x ){
        System.out.println("long ");
    }
    static void go(double x ){
        System.out.println("double ");
    }

    public static void main(String[] args) {
        byte b = 5;
        short s = 5;
        long l = 5;
        float f=  5.0f;
        go(b);
        go(s);
        go(l);
        go(f);
    }

}
