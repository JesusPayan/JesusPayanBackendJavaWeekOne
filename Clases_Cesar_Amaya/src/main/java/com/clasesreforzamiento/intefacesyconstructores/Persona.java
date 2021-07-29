
package com.clasesreforzamiento.intefacesyconstructores;

public class Persona {
        private String nombre;
        private String direccion;
        private int edad;
        private String mensaje;
        Persona(){
           nombre = "Juan Perez";
          direccion = "Calle n S/N";
          edad = 45;
          mensaje = "constructor sin paramentros";

        }
        Persona(String nombre, String direccion, int edad, String mensaje){
            this.nombre = nombre;
            this.direccion = direccion;
            this.edad = edad;
            this.mensaje = mensaje;

        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
