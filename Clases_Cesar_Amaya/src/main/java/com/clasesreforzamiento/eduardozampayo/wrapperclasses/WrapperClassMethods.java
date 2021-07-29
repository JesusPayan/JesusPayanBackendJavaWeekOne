package com.clasesreforzamiento.eduardozampayo.wrapperclasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
                System.out.println("---Metodo valueOf(string,radix)-----");
                Integer integerValue = Integer.valueOf("101011", 2);
                Integer integerValue2 = Integer.valueOf("101011");
                System.out.println("valor : " + integerValue);
                System.out.println("valor : " + integerValue2);

                System.out.println("---Metodo Value-----");
                Integer i2 = new Integer(42);
                byte b = i2.byteValue();
                short s = i2.byteValue();
                double d = i2.byteValue();
                System.out.println("Valor Integer: " + i2 + " Valor de byte b:" + b);
                System.out.println("Valor Integer: " + i2 + " Valor de short s" + s);
                System.out.println("Valor Integer: " + i2 + " Valor de double " + d);
                System.out.println("---Metodo Parse-----");
                int i1 = Integer.parseInt("1");
                double d4 =  Double.parseDouble("3.14");
                float f2 = Float.parseFloat("2.5F");
                Double d5 = Double.valueOf("3.12");

                System.out.println("valores \nint: " + i1 +"\ndouble: " +d4 + "\nfloat: "+ f2  );
                System.out.println(d5 instanceof Double);

                System.out.println("---Metodo .toString()-----");
                Double d6 = new Double("3.14");
                Integer inte = new Integer(1);
                System.out.println("d = " +  d6.toString());
                System.out.println("int = " + inte.toString() );
                 System.out.println("---Metodo .XxxtoString()-----");
                 String s3 = Integer.toHexString(254);
                System.out.println(".toHexString : retorna el valor hexadecimal de una cantidad (254) : "+ s3);
                String s4 = Long.toOctalString(254);
                System.out.println(".toOctString : retorna el valor Octal de una cantidad (254) : "+ s4);
                String s5 = Integer.toBinaryString(10);
                System.out.println(".toBinary : retorna el valor binario de una cantidad (10) : "+ s5);
    }
}
