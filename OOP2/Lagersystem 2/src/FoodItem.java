import java.util.Date;

public class FoodItem extends Item {
    private Date expires;

    FoodItem(String name, double price, Date expires) {
        super (name, price);
        this.expires = expires;
    }

    public Date getExpires() {
        return expires;
    }

    @Override
    public String toString (){
        return "FoodItem name=' " + getName()+
                "' price='" +getPrice()+
                "'exipres='" +getExpires()+"'";
    }

    @Override
    public boolean isExpired () {
        return expires.compareTo(new Date()) < 0;
    }

}
