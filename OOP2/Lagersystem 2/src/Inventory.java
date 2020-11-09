import java.util.ArrayList;
import java.util.Date;

class  Inventory {
    private ArrayList<Item> items;
    Inventory (ArrayList<Item> items) {
        this.items = items;
    }
    Inventory () {
        this(new ArrayList<Item>());
    }

    public void addItem (Item item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }
    public void removeItem (Item item) {
        items.remove(item);
    }
    public double getInventory () {
        double total = 0.0;
        for (Item item: items) {
            total += item.getPrice();
        }
        return total;
    }
    public void printInventory () {
        System.out.println("Inventory:");
        for (Item item: items) {
            System.out.println(" - "+item);
        }
    }
    public static void printStatus (Inventory inventory) {
        inventory.printInventory();
        System.out.println("Total: "+inventory.getInventory());
        System.out.println("");
    }
    public void removeExpiredFoods () {
        ArrayList<Item> copy = new ArrayList<Item>();
        for (int i=0 ; i<items.size() ; i++) {
            Item item = items.get(i);
            try {
                boolean expired = item.isExpired();
                if (!expired) {
                    copy.add(item);
                }
            } catch (UnsupportedOperationException e) {
                copy.add(item);
            }
        }
        items = copy;
    }
    public static void main (String args[]) {
        Inventory inventory = new Inventory();
        Item i1 = new FoodItem("chocolate", 19.95, new Date(52L*365*1000*60*60*24));
        Item i2 = new FoodItem("coffee" , 24.95, new Date(53L*365*1000*60*60*24));
        Item i3 = new FoodItem("Milk" , 12.95, new Date( 12*1000*60*60*24));
        Item i4 = new NonFoodItem("USB Charger", 17.45,
                new String[] {"plastic", "stuff"});
        Item[] items = new Item[] {i1, i2, i3, i4};
        printStatus(inventory);
        for (Item item: items) {
            inventory.addItem(item);
            printStatus(inventory);
        }
        inventory.removeItem(i1);
        printStatus(inventory);
        inventory.removeExpiredFoods();
        printStatus(inventory);
    }
}

