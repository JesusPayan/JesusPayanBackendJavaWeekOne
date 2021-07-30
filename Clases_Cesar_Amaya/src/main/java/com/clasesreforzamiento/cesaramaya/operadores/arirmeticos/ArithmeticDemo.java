package com.clasesreforzamiento.cesaramaya.operadores.arirmeticos;

public class ArithmeticDemo {
    public static void main(String[] args) {
        //Change the following program to use compund assignments:
        //Cambia el siguiente programa par usar asignaciones compuestas.

        int result = 1 + 2;  //result is now 3
        System.out.println(result);
        /*
        * this statement was tht old one.
        * result =  result - 1;*/
        result -= 1;/*this is the new operation statement.*/
        System.out.println(result);/*result now its 2*/
        /*old operation result =result * 2
        * new one*/
        result *= 2;
        System.out.println(result); /*result is now 4*/

      /*  old operation result = result / 2;*/
        result /=2;
        System.out.println(result);// result is now 2


       /*old operation  result = result + 8;*/
        result +=8;// result is now 10

       /*old operation / result = result % 7; * // result is now 3
        */
        result %=7;
        System.out.println(result);
        System.out.println("Thanks for using this program...");
    }
}
