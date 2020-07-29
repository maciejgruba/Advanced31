package pl.sda.advanced.oop2;

public enum Countries {  // enum posiada skonczona liczbe instancji(obiektow)
    POLAND("PL","Polska"),
    USA("US", "Stany Zjednoczone"),
    FRANCE("FR","Francja");

    private String symbol;
    private String plName;

    private Countries(String symbol, String plName){ // domyslnie jest prywatny
        this.symbol= symbol;
        this.plName= plName;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
