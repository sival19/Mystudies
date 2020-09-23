public class sudokuPrettyPrint {
    //Method to pretty print 2d arrays
    public static void printMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++)
                System.out.print(grid[i][j] + " | ");
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
//sudoku plate
        int[][] puzzle = {
                {7, 3, 6, 4, 5, 2, 9, 8, 1},
                {1, 9, 8, 6, 3, 7, 4, 5, 2},
                {4, 2, 5, 9, 8, 1, 3, 7, 6},
                {3, 6, 4, 5, 2, 8, 1, 9, 7},
                {9, 5, 2, 7, 1, 4, 6, 3, 8},
                {8, 1, 7, 3, 9, 6, 2, 4, 5},
                {2, 8, 9, 1, 7, 3, 5, 6, 4},
                {6, 7, 3, 2, 4, 5, 8, 1, 9},
                {5, 4, 1, 8, 6, 9, 7, 2, 3},
        };

        //use 2d array prettyprint method
        printMatrix(puzzle);

    }
}
