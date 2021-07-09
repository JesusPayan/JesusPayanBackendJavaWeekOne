public class SwitchStatements {
    public static void main(String[] args) {
        String userSelectedScreenMode = "Dark";
        switch (userSelectedScreenMode){
            case "Dark":
                System.out.println("Seleccionaste el modo Dark");
                break;
            case "Blue":
                System.out.println("Seleccionaste el modo Blue");
                break;
            case "Light":
                System.out.println("Seleccionaste el modo Light");
                break;
            default:
                System.out.println("Seleccionaste una opcion");
        }
    }
}
