package beginnerexecises.interfaces;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getSound());
        dog.eat();
        dog.move();
        System.out.println(bird.getSound());
        bird.eat();
        bird.move();

    }
}
