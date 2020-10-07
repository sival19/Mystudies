import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //make a new food item array
        FoodItem[] items = new FoodItem[10];

        for (int i = 0; i < items.length; i++) {
            items[i] = new FoodItem("Item:" + i, 12.3 *i,
                    new Date(i*1000*60*60*24));

        }
        for (FoodItem item : items) {
            System.out.println(item);

        }
        System.out.println();

        NonFoodItem[] items2 = new NonFoodItem[10];
        for (int i=0 ; i<items2.length ; i++) {
            items2[i] = new NonFoodItem(" Item:"+i, 12.3*i, new String[]{"shampoo"});
        }
        for (NonFoodItem item: items2) {
            System.out.println(item);
        }



    }

}
