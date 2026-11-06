package CSE220.Array_2D;

public class Q3_OuterBorderRotation {

    public static void rotateOuterBorder(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n - 1; i++) {          // n-1, n na
            int temp = matrix[0][i];                // up save
            matrix[0][i]       = matrix[i][n-1];        // up    <- right
            matrix[i][n-1]     = matrix[n-1][n-1-i];    // right <- down
            matrix[n-1][n-1-i] = matrix[n-1-i][0];      // down  <- left
            matrix[n-1-i][0]   = temp;                  // left  <- old up
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateOuterBorder(matrix);

        System.out.println("\nBorder Rotated Anticlockwise (90°):");
        printMatrix(matrix);

        // Expected Output:
        // 3 6 9
        // 2 5 8
        // 1 4 7

        // 4x4 test (question er sample)
        int[][] m4 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("\n4x4 Original:");
        printMatrix(m4);

        rotateOuterBorder(m4);

        System.out.println("\n4x4 Border Rotated Anticlockwise:");
        printMatrix(m4);

        // Expected Output:
        // 4  8  12 16
        // 3  6  7  15
        // 2  10 11 14
        // 1  5  9  13
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}