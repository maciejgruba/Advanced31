package pl.sda.advanced.oop2;

import java.math.BigDecimal;

public class Pensioner extends Person{

    public Pensioner(String firstName, String lastName, Countries country) {
        super(firstName, lastName, country);
    }

    @Override
    public BigDecimal getIncome() {
        return BigDecimal.valueOf(0);
    }
}
