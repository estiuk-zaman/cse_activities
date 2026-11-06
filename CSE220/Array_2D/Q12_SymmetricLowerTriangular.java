package CSE220.Array_2D;
import java.util.Arrays;

public class Q12_SymmetricLowerTriangular {

    public static int[][] toSymLowerTri(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        if (rows!=cols) {
            return matrix;
        }
        for(int i =0;i<rows;i++){
            for(int j =0;j<i;j++){
                matrix[i][j]=matrix[i][j]+matrix[j][i];
                matrix[j][i]=0;
            }
        }
            
        
        
        return matrix;
    }

    public static void main(String[] args) {
        // Question 12 er sample input[cite: 11]
        int[][] matrix = {
            {8, 2, 1},
            {5, 3, 4},
            {9, 6, 7}
        };

        int[][] result = toSymLowerTri(matrix);

        System.out.println("Transformed Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
        
        // Expected output:[cite: 11]
        // [8, 0, 0]
        // [7, 3, 0]
        // [10, 10, 7]
    }
}