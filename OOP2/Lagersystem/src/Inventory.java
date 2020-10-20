import java.util.ArrayList;
import java.util.Date;

public class Inventory {

    //inventory attribute
    private ArrayList<Item>items;


    Inventory (ArrayList<Item> items) {
        this.items=items;
    }

    Inventory() {
        this(new ArrayList<Item>());
    }

    //item adder

    public void addItem (Item item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }
// item remover
    public void removeItem (Item item) {
        items.remove(item);
    }

    //get total inventory value
    public double getInventoryValue() {

        double total = 0.0;

        for(Item item : items) {

            total += item.getPrice();

        }
        return total;
    }

    public void printInventory(){
        System.out.println("Inventory");
        for (Item item : items) {
            System.out.println(" - " + item);
        }
    }
}
