public class Kitten {

    double cuteness;
    static int count = 0;

    public Kitten(double cuteness){
        this.cuteness = cuteness;
            count ++;
        System.out.println("Kitten no: " + count + " Has cuteness of: " + cuteness);
    }
}