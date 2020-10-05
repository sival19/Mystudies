class Timing {
    static double base = 1.0000001;
    static double fun (double x, double y) {
        if (y==1) {
            return x;
        } else {
            return fun(x, y-1)*Math.pow(x, y-1);
        }
    }
    public static void main (String[] args) {
        double y = 1.0000001;
        long global_timer_start = System.currentTimeMillis();
        for (int x = 0; x <= 32 ; x++) {
            long timer_start = System.currentTimeMillis();
            System.out.println("fun("+y+","+x+")="+fun(x,y));
            System.out.println();

        }
    }
}