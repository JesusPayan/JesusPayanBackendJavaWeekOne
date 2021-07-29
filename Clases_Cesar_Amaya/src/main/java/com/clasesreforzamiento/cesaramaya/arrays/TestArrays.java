package com.clasesreforzamiento.cesaramaya.arrays;

public class TestArrays {
    public static void main(String[] args) {
        int arregloInt [] = {1,2,3,3,5};
        double arregloDouble [] = new double [5];


        for(int i =  0; i< arregloInt.length; i++){

            arregloDouble[i] = Math.random() * 5 +1;
        }
        for (int i=0; i < arregloInt.length ; i++){
            System.out.println("Arreglo de ints :  " + arregloInt[i]);
            System.out.println("Arreglo de double :  " + arregloDouble[i]);

        }
    }


}
