public class UberPool extends Car {

    String brand, model;

    public UberPool(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}