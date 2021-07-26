package com.clasesreforzamiento.cesaramaya.fluidcontrol;

public class IfStatement {
    public static void main(String[] args) {
        boolean expresionLogica;
        boolean tengoCredito = true;
        expresionLogica = 10 > 5;

        if (expresionLogica) {
            System.out.println("se cumple la condicion");
        }
        int  precio = 90;
        if(precio < 100)/*En este caso solo se ejecuta la primera sentencia despues del if*/
            comprar();
            salirTienda();
            volverACasa();
            if (precio < 100){
                comprar();
            }else {
                System.out.println("yo no soy un tonto");
            }
            if (precio <100){
                comprar();
            }else if(precio< 2000 && tengoCredito){
                comprarConTarjeta();
            }else{
                System.out.println("yo no soy un tonto");
            }
    }

    private static void comprarConTarjeta() {
        System.out.println("He comprado con tarjeta");
    }

    private static void salirTienda(){
        System.out.println("Saliendo de la tienda");
    }
    private static void volverACasa() {
        System.out.println("Volviendo a Casa");
    }

    public static  void comprar(){
        System.out.println("has comprado.");
    }
}
