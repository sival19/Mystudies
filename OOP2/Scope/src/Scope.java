class Scope {
    //declare bonus to static int
    static int bonus=42;
    // location 0
    // location 1
    public static int doubler (int value) {
// location 2
        //declare d to int
        int d = value * 2;
// location 3
        return d;
// location 4
    }
// location 5
    public static void main (String[] args) {
// location 6
        //declare sum to int
        int sum = 0;
// location 7
        //declare i
        for (/* location 8 */ int i=0 ; /* location 9 */ i<100 ; /* location 10 */ i++) {
// location 11
            //make tmp to int tmp
            int tmp = doubler(i);
// location 12
            sum += tmp;
// location 13
        }
// location 14
        System.out.println(sum+bonus);
// location 15
    }
// location 16
}