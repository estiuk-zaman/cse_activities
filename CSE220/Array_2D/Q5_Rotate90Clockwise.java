package CSE220.Array_2D;
import java.util.Arrays;

public class Q5_Rotate90Clockwise {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                int temp =0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i =0;i<n;i++){
            int left =0;
            int right =n-1;
        while (left<right) {
                int temp =0;
                temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        
    }

    public static void main(String[] args) {
        // Question 5 er sample input[cite: 7]
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Rotate call kora hocche (In-place)
        rotate(matrix);

        System.out.println("\nRotated 90-Degrees Clockwise:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        
        // Expected output:[cite: 7]
        // [7, 4, 1]
        // [8, 5, 2]
        // [9, 6, 3]
    }
}