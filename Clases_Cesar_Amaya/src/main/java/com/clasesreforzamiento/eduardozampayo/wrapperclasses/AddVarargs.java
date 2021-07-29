package com.clasesreforzamiento.eduardozampayo.wrapperclasses;

public class AddVarargs {
        static void go ( int x, int y){
            System.out.println(" int,int ");
        }

        static void go (byte x){
            System.out.println("byte");
        }
         static void go (int x){
            System.out.println("int");
        }

    public static void main(String[] args) {
            byte b = 5;
            go(b,b);
            go(b);
    }
}
