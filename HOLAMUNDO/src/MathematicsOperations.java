public class MathematicsOperations {
    public static void main(String[] args) {
        double x = 2.1, y = 3;

        System.out.println("Valor PI" + Math.PI);
        System.out.println("Redondeo Hacia arriba " + Math.ceil(x));//3
        System.out.println("Redondeo Hacia abajo " + Math.floor(x));//2
        System.out.println("Potencia "+Math.pow(x,y));//9.26
        System.out.println("Mayor: "+Math.max(x,y));
        System.out.println("Raiz cuadrada "+ Math.sqrt(y));
        System.out.println("Area de un circulo " + Math.PI * Math.pow(y,3));
        System.out.println(4 * Math.PI * Math.pow(y,2));
        System.out.println((4/3) * Math.PI + Math.pow(y,3));

    }
}
