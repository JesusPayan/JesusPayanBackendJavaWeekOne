package com.clasesreforzamiento.cesaramaya.fluidcontrol;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        int niveles [ ] = {1,2,3,0};
        System.out.println("\nEjecucion Switch Tipico (breaks y default al final):");
        for (int i = 0; i <niveles.length ; i++) {
            System.out.println("Nivel: "+ niveles[i]);
            switch (niveles[i]){
                case 1:
                    System.out.println("\tNivel Basico");
                    break;
                case 2:
                    System.out.println("\tNivel Intermedio");
                    break;
                case 3:
                    System.out.println("\tNivel Avanzado");
                    break;
                default:
                    System.out.println("\tNivel no infomado");

            }

        }
        System.out.println("");
        System.out.println("\nEjecucion Switch  (breaks y default en medio:");
        for (int i = 0; i <niveles.length ; i++) {
            System.out.println("Nivel: "+ niveles[i]);
            switch (niveles[i]){
                case 1:
                    System.out.println("\tNivel Basico");
                    break;
                default:
                    System.out.println("\tNivel no infomado");
                case 2:
                    System.out.println("\tNivel Intermedio");
                    break;
                case 3:
                    System.out.println("\tNivel Avanzado");
                    break;


            }

        }
        System.out.println("");
        System.out.println("\nEjecucion Switch  sin breaks y default en medio:");
        for (int i = 0; i <niveles.length ; i++) {
            System.out.println("Nivel: "+ niveles[i]);
            switch (niveles[i]){
                case 1:
                    System.out.println("\tNivel Basico");

                default:
                    System.out.println("\tNivel no infomado");
                case 2:
                    System.out.println("\tNivel Intermedio");

                case 3:
                    System.out.println("\tNivel Avanzado");
                    break;


            }

        }
    }

}
