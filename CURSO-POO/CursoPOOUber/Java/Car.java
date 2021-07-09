
class Car {

    private Integer id;
    private Integer passenger;
    private String license;
    private Account driver;

    public Car(String license, Account driver) {

        this.license = license;
        this.driver = driver;
        passenger = 3;
    }

    public Integer getPassenger() {
        return 3;
    }

    public void setPassenger(Integer passenger) {
        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 4 pasajeros.");
        }

    }

    void printDataCar() {
        System.out.println("\n con el numero de matricula :" + license + "\n El conductor: " + driver.name);
    }

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return Account return the driver
     */
    public Account getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Account driver) {
        this.driver = driver;
    }

}