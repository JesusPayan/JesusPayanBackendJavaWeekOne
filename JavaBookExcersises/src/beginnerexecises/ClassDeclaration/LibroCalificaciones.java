package beginnerexecises.ClassDeclaration;

public class LibroCalificaciones {
            private String nombreLibro;
            public  void imprimirMensajeBienvenida(){
                        System.out.println("Bienvenido a Libro de Calificaciones");
            }
            public void imprimirBienvenidaCurso(String curso){
                        System.out.println("Se bienvenido al cursos: " +  curso);
            }
            public void establecerNombreLibro(String nombreLibro){
                this.nombreLibro = nombreLibro;
            }
            public String regresarNombreLibro(){
                return this.nombreLibro;
            }
}
