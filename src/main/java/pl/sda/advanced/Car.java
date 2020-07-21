package pl.sda.advanced;

public class Car {
    private String model;
    private String manufacturer;
    private String VIN;
    private String colour;

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }


    public String getModelAndManufacturer() {
        return model + " " + manufacturer;
    }


    @Override
    public String toString() {
        return model + " " + manufacturer; //przedefiniowanie metody toString
    }


    public boolean equals(Object anythingElse) {
        if (!this.getClass().equals(anythingElse.getClass())) {
            return false;
        }
        Car car = (Car) anythingElse; // rzutowanie
        if (this.VIN.equals(car.VIN)) {
            return true;
        } else {
            return false;
        }


    }
}
