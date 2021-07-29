package beginnerexecises.accesscontrolexercises.defaultacces;

public class PublicClass {
         public void  printMessageFromPublicClass(String clase){
            System.out.println("mensaje desde una clase publica que puede accesarse desde cualquier otra clase o paquete." +
                    "\nAccesado desde " + clase);
        }
}
