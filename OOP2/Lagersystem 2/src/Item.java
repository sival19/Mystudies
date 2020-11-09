import java.util.ArrayList;
import java.util.Date;

abstract class Item implements Expirable, Comparable<Item> {
    private final String name;
    private final double price;

    Item (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString (){
        return "FoodItem name=' " + getName()+
                "' price='" +getPrice();
    }

    @Override
    public int compareTo(Item item) {
        return 0;
    }

    @Override
    public boolean isExpired() {
        throw new UnsupportedOperationException("Item does not support this operation.");
    }
}
