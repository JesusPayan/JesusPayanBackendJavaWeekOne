package beginnerexecises.inheritance;

import java.util.Scanner;

public class TestInheritance {

            public static void main(String[] args) {
                Father father = new Father("Jesus",30,"Centauro","black");
                Son son =  new Son("Emmanuel", 10,"juglares","black");
                Father son1 =  new Son("Emml", 10,"centauro","black");
                System.out.println(father.getName() +" "+ father.getAge()+" " + father.getColorEyes() );
                System.out.println(son.getName() +" "+ son.getAge() +" " + son.getColorEyes() );
                System.out.println(son1.getName() +" "+ son1.getAge() +" " + son1.getColorEyes() );
                 int velocidadPadre = 0;
                 int velocidadHijo = 0;
                 int opcion= 0;
                Scanner input = new Scanner(System.in);

                do{
                    System.out.println("Seleccion la opcion deseada 1) alcelerar padre 2) acelerar hijo 3) Salir ");
                    System.out.println("opcion:");
                    opcion = input.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("");
                            System.out.println("__acelero el padre__");
                            velocidadPadre += father.run(velocidadPadre);
                            System.out.println("Velocidad(padre): " + velocidadPadre);
                            break;
                        case 2:
                            System.out.println("");
                            velocidadHijo += son.run(velocidadHijo);
                            System.out.println("---acelero el hijo--");
                            System.out.println("Velocidad (hijo): " + velocidadHijo);
                            break;
                    }
                }while (opcion!=3);
            }


}
