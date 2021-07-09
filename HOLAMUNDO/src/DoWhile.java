import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------------Menu------------------");
            System.out.println("Please select the option you want ");
            System.out.println("----------------------------------");
            System.out.println("|1.- Movies                      |");
            System.out.println("|2.- Series                      |");
            System.out.println("|0.- Exit                        |");
            System.out.println("----------------------------------");
            System.out.print("Option:");
            option =  scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Thank for visit us.");
                    break;
                case 1:
                    System.out.println("Enjoy our movies.");
                    break;
                case 2:
                    System.out.println("Enjoy our series.");
                    break;
                default:
                    System.out.println("Select a valid option.");

            }
        }while(option!=0);
    }





}
