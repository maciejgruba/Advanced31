package pl.sda.advanced;

public class CarOption {
    private String optionName; // nazwa wyposazenia
    private Double optionPrice; // cena wyposazenia
    private boolean chosen;    // wybor wyposazenia

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    public String getOptionName(){
        return optionName;
    }

    public Double getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(Double optionPrice) {
        this.optionPrice = optionPrice;
    }

    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }
}
