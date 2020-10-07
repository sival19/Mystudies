import java.util.Date;

public class FoodItem extends Item {

    //attributes
    private Date expires;

    FoodItem (String name, double price, Date expires)
    {
        super(name, price);
        this.expires = expires;
    }

    public Date getExpires() {
        return expires;
    }

    @Override
    public String toString() {
        return "Food item name: " +getName() +
                " Price = " + getPrice() +
                " Expires: " + getExpires();

    }
}
