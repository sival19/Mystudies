import java.util.Arrays;

public class NonFoodItem extends Item {
    private final String[] materials;

    NonFoodItem(String name, double price, String[] materials){
        super(name, price);
        this.materials = materials;
    }

    public String[] getMaterials() {
        return materials;
    }

    @Override
    public String toString(){
        for (int i = 0; i < materials.length; i++) {
        }
        return "NonFoodItem name='"+getName() +
                 "' price="+getPrice()+
                "' materials='"+ Arrays.toString(getMaterials())+"'";
    }
}
