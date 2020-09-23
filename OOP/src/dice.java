public class dice {
    public static void main(String[] args) {
        //make a dice
        int dice = (int) (Math.random()*7);

        //make a boolean statement for even and bigger than 3

        if ((dice % 2 == 0) && (dice >= 3)) {
            //print if even and bigger than 3
            System.out.println(dice);
            System.out.println("dice is even and bigger than 3");
        }
        else {
            //print if odd and lower than 3
            System.out.println(dice);
            System.out.println("The dice is odd or lower than 3");
        }


    }
}
