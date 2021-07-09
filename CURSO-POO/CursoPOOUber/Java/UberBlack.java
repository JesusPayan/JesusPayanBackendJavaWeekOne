import java.util.Map;
import java.util.ArrayList;

public class UberBlack extends Car {

    String brand, model;
    Map<String, ArrayList<String>> typeCarAccepted;
    // Map<String, ArrayList<String,IntegerS>> typeCarAcceptedError;
    ArrayList<String> seatMaterial;

    public UberBlack(String license, Account driver, String brand, String model,
            Map<String, ArrayList<String>> typeCarAccepted, ArrayList<String> seatMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;

    }
}