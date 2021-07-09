public class IncrementDecrement {
    public static void main(String[] args) {

        int lifeCounts = 5;
        //Manera Posfija
        System.out.println("Lifes:" + lifeCounts);//5

        lifeCounts = lifeCounts - 1;
        System.out.println("Lifes:" + lifeCounts);//4

        lifeCounts--;
        System.out.println("Lifes:" + lifeCounts);//3

        lifeCounts++;
        System.out.println("Lifes:" + lifeCounts);//4

        //Manera prefija
        int gift = 100 + lifeCounts++;
        System.out.println(gift);
        //Manera prefija
         gift = 100 + --lifeCounts;
        System.out.println(gift);

    }
}
