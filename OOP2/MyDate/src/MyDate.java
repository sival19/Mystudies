import java.util.Date;

class MyDate {
    public static void main (String[] args) {
        Date d = new Date();
        for (long elapsed=1000 ; elapsed<=1000000 ; elapsed *= 10) {
            d.setTime(elapsed);
            System.out.println(d.toString());
        }
    }
}