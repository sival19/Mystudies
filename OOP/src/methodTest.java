public class methodTest {

    //method to substract highest varaible form the lowest and print the result

    public static void maxDiff(double num1, double num2) {
        double result;
        if (num1 > num2) {
            result = (num1 - num2);
            System.out.println(result);
        } else {
            result = (num2 - num1);
            System.out.println(result);
        }
    }

    public static void printMatrix(int[][] grid) {
        for (int i=0 ; i< grid.length ; i++){
            for (int j = 0 ; j< grid[i].length; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
}

/*
for (int i=0 ; i< grid.length ; i++){
            for (int j = 0 ; j< grid[i].length; j++) {
            }
 */
