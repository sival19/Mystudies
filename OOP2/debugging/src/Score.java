class Score {
    public static void main(String[] args) {
        int points = 50;  // imagine an arbitrary number of points between 0 and 100
        System.out.print("You ");
        if (points >= 50) {
            System.out.print("PASSED");
        } else {
            System.out.print("FAILED");
        }
        System.out.println("!");
    }
}