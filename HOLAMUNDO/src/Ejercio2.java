public class Ejercio2 {
    public static void main(String[] args) {
        char c = 'z';
        int n ;
        n = c;
        System.out.println("cast implicito c > n " + n);
        //CASTING EXPLICITO
        int i = 250;
        long l = i;
        System.out.println("Casting implicito " + l);
        //CASTING EXPLICITO
        short s = (short) l;
        System.out.println("Casting Explicito " +  s);
        double d = 301.067;
        //CASTING EXPLICITO
        long doubleLong = (long) d;
        System.out.println("Casting Explicito " +  s);
        //CASTING EXPLICITO
        i = 100 + (int) 5000.66;

        System.out.println("Casting Explicito " +  i);
        //CASTING EXPLICITO
        i = 737 * 100;
        byte b = (byte)  i;
        System.out.println("Casting Explicito " +  b);
        //CASTING EXPLICITO
       d = 298.6358 / 25;
       l = (long) d;

        System.out.println("Casting Explicito " +  l);


    }
}
