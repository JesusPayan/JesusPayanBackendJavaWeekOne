
import java.util.Map;
import java.util.ArrayList;

public class UberVan extends Car {

    String brand, model;
    Map<String, Map<String, Integer>> typeCarAccepted;
    // Map<String, ArrayList<String,IntegerS>> typeCarAcceptedError;
    ArrayList<String> seatMaterial;
    private Integer passenger = 6;

    public UberVan(String license, Account driver) {
        super(license, driver);

    }

    public UberVan(String license, Account driver, String brand, String model,
            Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatMaterial = seatMaterial;

    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 4 pasajeros.");
        }
    }
}
