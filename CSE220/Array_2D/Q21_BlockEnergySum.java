package CSE220.Array_2D;

public class Q21_BlockEnergySum {

    public static int[][] blockEnergySum(int[][] grid, String[][] directions) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        int[][] ans = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
               int currR=i;
               int currC=j;
               int sum =0;
               while (currR>=0 && currR<rows && currC>=0 && currC<cols) {
                if (directions[i][j].equals("SW")) {
                    sum+=grid[currR][currC];
                    currC--;
                    currR++;;
                }
                else if (directions[i][j].equals("SE")) {
                    sum+=grid[currR][currC];
                    currC++;
                    currR++;
                }
                else if (directions[i][j].equals("NE")) {
                    sum+=grid[currR][currC];
                    currC++;
                    currR--;
                }
                else if (directions[i][j].equals("NW")) {
                    sum+=grid[currR][currC];
                    currC--;
                    currR--;
                }
               }
               ans[i][j]=sum;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // Sample inputs[cite: 17]
        int[][] grid = {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        String[][] directions = {
            {"SE", "SE", "SW", "NE"},
            {"SW", "SW", "NE", "SE"},
            {"NW", "SW", "NE", "NW"},
            {"SE", "NW", "SW", "NE"}
        };

        int[][] result = blockEnergySum(grid, directions);

        System.out.println("Energy Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Expected Output:[cite: 17]
        // 34  21  18  4
        // 5   15  11  8
        // 9   23  19  21
        // 13  23  15  16
    }
}