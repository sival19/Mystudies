public class daysInMonths {
    public static void main(String[] args) {

        //make an array with days in respective months of the year
        byte[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //make a for loop to run through the array 1 by 1
        for (byte i = 0; i < months.length; i++) {
            //print days in month
            System.out.println("The number of days in month: " + (i + 1) + " is: " + months[i]);
        }
    }
}
