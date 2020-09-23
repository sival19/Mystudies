public class temperatureDifferenceArray {
    //make an array to find the biggest number and remove the smalest
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

        //make array with temperatures
        double[] temperatures = new double[]{21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};

        for (int i = 0; i < temperatures.length - 1; i++) {
            maxDiff(temperatures[i + 1], temperatures[i]);


        }
    }
}
