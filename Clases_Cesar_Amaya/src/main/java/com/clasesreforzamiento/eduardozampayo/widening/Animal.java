package com.clasesreforzamiento.eduardozampayo.widening;

public class Animal {
        static void eat(){

        }
}
class Dog3 extends Animal{
    public static void main(String[] args) {
            Dog3 d = new Dog3();
            d.go(d);
    }
    void go(Animal a){
        System.out.println("something to print");
    }
}