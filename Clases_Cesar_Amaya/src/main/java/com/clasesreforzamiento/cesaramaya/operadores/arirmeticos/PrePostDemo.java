package com.clasesreforzamiento.cesaramaya.operadores.arirmeticos;

//In the following program, explain why the value "6" is printed twice in a row:

class PrePostDemo {

    public static void main(String[] args){

        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
        String explicacionEspañol= "Se repite 6 porque ahi la variable i aun tiene" +
                " ese valor 6  por el operador ++( antes de la variable)  java primero imprime la " +
                "variable y despues hace el incremento   ";
        String englishExplain = "the number 6 repeat twice because java using (++) operator before the variable i  prints i's value before update the " +
                " new i's value ";
        System.out.println(explicacionEspañol);
        System.out.println(englishExplain);
    }


}

