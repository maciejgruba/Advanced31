package pl.sda.advanced.customers;

public class Car1 {
    private Integer id;
    private String nameOfItems;
    private int priceOfItems;

    public Car1(Integer id, String nameOfItems, int priceOfItems) {
        this.id = id;
        this.nameOfItems = nameOfItems;
        this.priceOfItems = priceOfItems;
    }

    public Car1(String nameOfItems, int priceOfItems) {
        this.nameOfItems = nameOfItems;
        this.priceOfItems = priceOfItems;
    }

    public Integer getId() {
        return id;
    }

    public String getNameOfItems() {
        return nameOfItems;
    }

    public int getPriceOfItems() {
        return priceOfItems;
    }
}
