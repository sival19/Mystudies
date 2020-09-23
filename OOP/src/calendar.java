public class calendar {
    public static void main(String[] args) {

        //months in a normal year
        int[] monthsNormal = {31,28,31,30,31,30,31,31,30,31,30,31};

        //months in a leap year
        int[] monthsLeap = {31,29,31,30,31,30,31,31,30,31,30,31};

        int[] years;

        //leap year every 4 years after 2000
        for (int i=2000; i<2021 ; i++){
            years = (i % 4 == 0 ? monthsLeap : monthsNormal);

            //print correct month days in year
            for (int j = 0 ; j < years.length ; j++) {
                System.out.print(" " + years[j]);
            }
            System.out.println();
        }
    }
}
