package pl.sda.advanced.oop2;

import java.math.BigDecimal;

public class Worker extends Person {
    private BigDecimal moneyFromWork;
    public Worker(String firstName, String lastName, BigDecimal moneyFromWork) {
        super(firstName, lastName);
        this.moneyFromWork= moneyFromWork;
    }

    public BigDecimal getMoneyFromWork() {
        return moneyFromWork;
    }

    @Override
    public String introduceMyself() {
        return "jestem pracownikiem";
    }

    @Override
    public BigDecimal getIncome(){
        return moneyFromWork;
    }
}
