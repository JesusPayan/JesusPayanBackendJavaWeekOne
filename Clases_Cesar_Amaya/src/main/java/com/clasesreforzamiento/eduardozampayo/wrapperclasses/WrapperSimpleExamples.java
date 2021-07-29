package com.clasesreforzamiento.eduardozampayo.wrapperclasses;



public class WrapperSimpleExamples {

    public static void main(String[] args) {


            Integer integerLikeInt = new Integer(4);
            Integer integerLikeString =  new Integer("4");
            Float floatLikeFloat = new Float(4.5f);
            Float floatLikeString = new Float("4.5f");
            Boolean flag = new Boolean(false);
            Boolean flagLikeString = new Boolean("false");
            int sumaIntegers = integerLikeInt + integerLikeString;
            float sumaFloats = floatLikeFloat +floatLikeString;

            System.out.println("Suma Integers: " + sumaIntegers);
            System.out.println("Suma Floats: " + sumaFloats);
            if (!flag){
                System.out.println(false);
            }



            }
}
