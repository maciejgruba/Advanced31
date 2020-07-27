package pl.sda.advanced.oop2;

import java.math.BigDecimal;

public class Pensioner extends Person{

    public Pensioner(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public BigDecimal getIncome() {
        return BigDecimal.valueOf(0);
    }
}
