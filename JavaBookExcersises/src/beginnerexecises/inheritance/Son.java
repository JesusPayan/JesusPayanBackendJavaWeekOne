package beginnerexecises.inheritance;

public class Son extends Father {

    public Son(String name, int age, String address, String colorEyes) {
        super(name, age, address, colorEyes);
    }

    @Override
    public int run(int speed) {
        return speed += 2;
    }
}
