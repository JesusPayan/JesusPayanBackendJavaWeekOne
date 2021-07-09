public class WhileLoop {
    static boolean isTurnOnLight =  false;

    public static void main(String[] args) {
        turnOnOffLight();
        int i = 1;
       while (isTurnOnLight && i<=10){
          printSOS();
          i++;

       }


    }
    public static void printSOS(){
        System.out.println("... _ _ _ ...");
    }
    public static boolean turnOnOffLight(){
        /*Operador ternario si la condicion se cumple se regresa el primer valor
        * variale boolean = (expresion a evalualr) ? valor 1: valor 2;*/
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;

    }

}
