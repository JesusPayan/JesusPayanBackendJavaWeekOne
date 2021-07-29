package beginnerexecises.interfaces;

public class Bird implements Animal{
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    private String sound;
    @Override
    public void eat() {
        System.out.println("Eats Seems and plants");
    }

    @Override
    public void move() {
        System.out.println(this + "Walk and fly ");
    }
}
