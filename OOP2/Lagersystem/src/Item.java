public class Item {

    //attributes for item
    private String name;
    private double price;

    //getters for name and price
    Item (String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
