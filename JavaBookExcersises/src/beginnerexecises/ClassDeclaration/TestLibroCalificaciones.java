package beginnerexecises.ClassDeclaration;

import java.util.Scanner;

public class TestLibroCalificaciones {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                LibroCalificaciones libroCalificaciones = new LibroCalificaciones();
                libroCalificaciones.imprimirMensajeBienvenida();
                System.out.println("Llamada a metodo por parametros");
                System.out.print("Indica el curso al cual te inscribiras:");
                libroCalificaciones.imprimirBienvenidaCurso(input.nextLine());
                System.out.println("Establecer y regresar nombre libro con getters and setters");
                libroCalificaciones.establecerNombreLibro(input.nextLine());
                System.out.println("Nombre del libro: " + libroCalificaciones.regresarNombreLibro() );

    }
}
