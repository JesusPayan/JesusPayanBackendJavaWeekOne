package beginnerexecises.inheritance;

public class Father {
    private String name;
    private int age;
    private String Address;
    private String colorEyes;
    private int speed;

    public Father(String name, int age, String address, String colorEyes) {
        this.name = name;
        this.age = age;
        Address = address;
        this.colorEyes = colorEyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getColorEyes() {
        return colorEyes;
    }

    public void setColorEyes(String colorEyes) {
        this.colorEyes = colorEyes;
    }
    public int run(int speed){
        return speed++;
    }
}
