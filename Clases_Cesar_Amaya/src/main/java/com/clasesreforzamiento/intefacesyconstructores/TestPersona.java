package com.clasesreforzamiento.intefacesyconstructores;

import java.io.OutputStream;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Pedro","Calle x SN", 25,"Construido con parametros");
        System.out.println("Persona construida sin parametros:" + persona1.getNombre() +" "+ persona1.getDireccion() +" " +persona1.getEdad()+" "+ persona1.getMensaje());
        System.out.println("Persona construida sin parametros:" + persona2.getNombre() +" "+ persona2.getDireccion() +" " +persona2.getEdad()+" "+ persona2.getMensaje());

    }


}
