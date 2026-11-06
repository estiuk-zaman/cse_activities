package CSE220.Array_2D;

public class Q20_MarsRover {

    public static void localMinima(int[][] matrix, int threshold) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int finalRow = -1;
        int finalCol = -1;

        // Tmr Safe Zone Traversal logic: 1 theke shuru, rows-1/cols-1 er ag porjonto
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {

                // Current cell threshold er upore gele ignore koro (noise)[cite: 16]
                if (matrix[i][j] > threshold) {
                    continue;
                }
                
                boolean isMin = true;

                // Neighbor jodi valid (<= threshold) hoy EBANG amar shoman ba choto (<= current) hoy,
                // tahole ami local minima na (isMin = false). Question e 'strictly less' bola chilo tai <= dite hobe[cite: 16].

                // Up check
                if (matrix[i - 1][j] <= threshold && matrix[i - 1][j] <= matrix[i][j]) {
                    isMin = false;
                }
                // Down check
                if (matrix[i + 1][j] <= threshold && matrix[i + 1][j] <= matrix[i][j]) {
                    isMin = false;
                }
                // Left check
                if (matrix[i][j - 1] <= threshold && matrix[i][j - 1] <= matrix[i][j]) {
                    isMin = false;
                }
                // Right check
                if (matrix[i][j + 1] <= threshold && matrix[i][j + 1] <= matrix[i][j]) {
                    isMin = false;
                }

                // Shob theke choto hole update final answer
                if (isMin) {
                    finalRow = i;
                    finalCol = j;
                }
            }
        }

        // Output print kora
        if (finalRow != -1) {
            System.out.println("Local minimum found at: (" + finalRow + ", " + finalCol + ")");
        }
    }

    public static void main(String[] args) {
        // Question 20 er sample matrix[cite: 16]
        int[][] matrix = {
            { 22,   21, 1000,   23},
            { 25,   17,   21, 1000},
            {1000,  19,   18,   22},
            { 21,   22, 1000,   20}
        };
        int noise_threshold = 100;

        localMinima(matrix, noise_threshold);
        
        // Expected Output: 
        // Local minimum found at: (2, 2)[cite: 16]
    }
}