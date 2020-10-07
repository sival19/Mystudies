import java.util.Arrays;

public class NonFoodItem extends Item {

    private String[] materials;

    NonFoodItem (String name, double price, String[] materials)
    {
        super(name, price);
        this.materials = materials;
    }

    public String[] getMaterials() {
        return materials;
    }
    @Override
    public String toString()
    {
        return
        "Non Food item name:" + getName() +
                " Price = " +getPrice() +
                " Materials: " + Arrays.toString(getMaterials());

    }
}
