package CSE220.Array_2D;

public class Q9_QueenAgeSolver {

    // Tmi shudhu ei method ta design korbe
    public static int findQueenAge(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row_minimum_sum= Integer.MAX_VALUE;
        int row_minimum_index=-1;
        int col_minimum_sum= Integer.MAX_VALUE;
        int col_minimum_index=-1;

        for(int i =0;i<rows;i++){
            int temp_sum=0;
            for(int j =0;j<cols;j++){
                temp_sum+=matrix[i][j];
            }
            if (temp_sum<row_minimum_sum) {
                row_minimum_sum=temp_sum;
                row_minimum_index=i;
            }
        }
        for(int j =0;j<rows;j++){
            int temp_sum=0;
            for(int i =0;i<cols;i++){
                temp_sum+=matrix[i][j];
            }
            if (temp_sum<col_minimum_sum) {
                col_minimum_sum=temp_sum;
                col_minimum_index=j;
            }
        }
        return matrix[row_minimum_index][col_minimum_index];
    }

    public static void main(String[] args) {
        // Question 9 er sample matrix[cite: 10]
        int[][] matrix = {
            {50, 70, 40},
            {80, 30, 90},
            {35, 60, 95},
            {25, 75, 30}
        };

        // Method call kora hocche
        int result = findQueenAge(matrix);

        System.out.println("Queen's Age found: " + result);
        System.out.println("Expected output should be: 45"); 
    }
}