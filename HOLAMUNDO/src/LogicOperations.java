public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        //OPERADORES ASIGNACION
        System.out.println("a es igual a b?   " +(a == b) );
        System.out.println("a es diferente a b?   " +(a != b) );
        //OPERADORES RELACIONALES
        System.out.println("a es mayor a b?   " +(a > b) );
        System.out.println("a es menor a b?   " +(a < b) );
        System.out.println("a es mayor o igual a b?   " +(a >= b) );
        System.out.println("a es menor o igual a b?   " +(a <= b) );
        if (a == b){
            System.out.println("a es igual a b");
        }else if (a != b){
            System.out.println("a es dif a b");
        }else if (a > b){
            System.out.println("a es may a b");
        }
        else if (a < b){
            System.out.println("a es men a b");
        }
        else if (a >= b){
            System.out.println("a es may igual a b");
        }
        else if (a <= b){
            System.out.println("a es men igual a b");
        }
    }
}
