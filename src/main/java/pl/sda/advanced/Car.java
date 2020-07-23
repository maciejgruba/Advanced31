package pl.sda.advanced;

import java.math.BigDecimal;

public class Car {
    private String model;
    private String manufacturer;
    private String VIN;
    private String colour;
    private CarOption[] options = new CarOption[1];
    private BigDecimal basePrice;

    public BigDecimal finallyPrice(){
        BigDecimal result = basePrice;


        return result;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public CarOption[] getOptions() {
        return options;
    }

    public void setOptions(CarOption[] options) {
        this.options = options;
    }


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

    @Override
    public int hashCode() {
        return VIN.hashCode();
    }
}
