public class epoch {
    public static void main(String[] args) {
        //milliseconds since 1st jan 1970
        long milliseconds = System.currentTimeMillis();
        //milli to seconds
        long seconds = milliseconds/1000;
        //to minutes
        long minutes = seconds/60;
        //to hours
        long hours = minutes/60;
        //to days
        long days = hours/24;
        //to years
        long years = days/365;
        //print years and days since 1st jan 1970
        System.out.println("It has been: " + years + " years and: " + days + " Days since 1st January 1970");
    }
}
