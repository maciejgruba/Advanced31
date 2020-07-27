package pl.sda.advanced.oop1;

import java.math.BigDecimal;

public class CarOption {
    private String optionName; // nazwa wyposazenia
    private BigDecimal optionPrice; // cena wyposazenia
    private boolean chosen;    // wybor wyposazenia

    public CarOption() {
    }

    public CarOption(String optionName, BigDecimal optionPrice) {
        this.optionName = optionName;
        this.optionPrice = optionPrice;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    public String getOptionName(){
        return optionName;
    }

    public BigDecimal getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(BigDecimal optionPrice) {
        this.optionPrice = optionPrice;
    }

    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }
}
