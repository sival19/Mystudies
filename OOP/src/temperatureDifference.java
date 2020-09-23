public class temperatureDifference {

//substract highest number from the smallest

    public static void maxDiff(double num1, double num2) {
        double result;
        if (num1 > num2) {
            result = (num1 - num2);
        } else {
            result = (num2 - num1);
        }
        System.out.println(result);
    }


    public static void main(String[] args) {

        //assign temperatures
        double monday = 21.5;
        double tuesday = 23.7;
        double wednesday = 19.6;
        double thursday = 22.5;
        double friday = 25.3;
        double saturday = 21.7;
        double sunday = 18.9;

        //use method
        maxDiff(monday, tuesday);
        maxDiff(tuesday, wednesday);
        maxDiff(thursday, friday);
        maxDiff(saturday, sunday);


    }
}
