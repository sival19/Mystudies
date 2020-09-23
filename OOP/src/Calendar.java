public class Calendar {
    public static void main(String[] args) {
        final String[] days = {
                "Mandag",
                "Tirsdag",
                "Onsdag",
                "Torsdag",
                "Fredag",
                "Lørdag",
                "Søndag",
        };
        final String[] months = {
                "Januar",
                "Februar",
                "Marts",
                "April",
                "Maj",
                "Juni",
                "Juli",
                "August",
                "September",
                "Oktober",
                "November",
                "December",
        };
        final int[] monthsNormal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        final int[] monthsLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        final int year = 2019;
        int firstDay = 1; // index for days

// find the correct month lenghts
        boolean leap = year % 4 == 0 && year % 400 != 0;
        int[] monthLengths = leap ? monthsLeap : monthsNormal;

// build base data structure
        String[][] calendar = new String[12][];
        int dayNumber = firstDay;
        for (int month = 0; month < calendar.length; month++) {
            int monthLength = monthLengths[month];
            calendar[month] = new String[monthLength];
            for (int day = 0; day < monthLength; day++) {
                calendar[month][day] = days[dayNumber++ % days.length];
            }
        }
        for (int month = 0; month < calendar.length; month++) {
            for (int day = 0; day < calendar[month].length; day++) {
                String monthName = months[month];
                String dayName = calendar[month][day];
                System.out.printf("%d %2d. ", year, day + 1);
                System.out.println(monthName + ": " + dayName);
            }
        }
    }
}