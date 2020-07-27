package pl.sda.advanced.oop2;

import java.math.BigDecimal;

public class Student extends Person implements ageHolder{   //student rozszerza mozliwosci klasy

    private BigDecimal moneyFromMum;

    public Student(String firstName, String lastName, BigDecimal moneyFromMum) {
        super(firstName, lastName); // super()- wywolanie konstruktora z nadklasy(Person)
        this.moneyFromMum = moneyFromMum;
    }

    public int getAge(){
        return  18;
    }

    public BigDecimal getMoneyFromMum() {
        return moneyFromMum;
    }

    @Override
    public String introduceMyself() {
        return "jestem studentem";
    }

    @Override
    public BigDecimal getIncome() {
        return moneyFromMum;
    }
}
