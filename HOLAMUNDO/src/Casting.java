public class Casting {
    public static void main(String[] args) {
        double monthlyDogs  = 30.0 /12.0;
        //ESTIMACION TRUNCA LA PARTE DECIMAL Y MUESTRA LA PARTE ENTERA
        int dogPerMonth =  (int) monthlyDogs;
        System.out.println(dogPerMonth);
        //EXACTITUD
        int a  = 30;
        int b = 20;
        System.out.println((double) a/b);
        char n = '1';
        int nI = n;
        System.out.println(nI);
        short nS = (short) n;
        System.out.println(nS);
    }
}
