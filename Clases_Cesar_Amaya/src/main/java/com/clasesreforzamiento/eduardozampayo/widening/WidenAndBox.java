package com.clasesreforzamiento.eduardozampayo.widening;

public class WidenAndBox {
    static void go(Long x){
            System.out.println("long");
    }

    public static void main(String[] args) {
        byte b = 5;
        // go(b); this isn't posible
    }
}
