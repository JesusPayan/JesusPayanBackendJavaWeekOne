package beginnerexecises.interfaces;

public class Dog implements Animal{
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    private String sound;
    public Dog(){
            sound= "barf...barf....wouf";
    }
    @Override
    public void eat() {
        System.out.println(this+ "Eats Dogs food, meat and egg");
    }

    @Override
    public void move() {
        System.out.println(this + "Walk");
    }

}
