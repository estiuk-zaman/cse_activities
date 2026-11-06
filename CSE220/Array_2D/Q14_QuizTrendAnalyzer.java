package CSE220.Array_2D;
import java.util.Arrays;

public class Q14_QuizTrendAnalyzer {

    public static double[] analyzeTrend(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        double[] averages = new double[cols];
        
        for(int j=0;j<cols;j++){
            int temp_sum=0;
            for(int i =0;i<rows;i++){
                temp_sum+=matrix[i][j];
            }
            averages[j]=(double)temp_sum/rows;
        }
        
        double[] diff = new double[cols - 1];
        
        for(int k =0;k<diff.length;k++){
            diff[k] = averages[k+1] - averages[k];
        }
        
        
        return diff; 
    }

    public static void main(String[] args) {
        // Question 14 er sample matrix[cite: 12]
        int[][] matrix = {
            {85, 90, 78},
            {88, 85, 80},
            {75, 95, 85},
            {92, 88, 82}
        };

        double[] result = analyzeTrend(matrix);

        // Result print kora hocche
        System.out.println("Differences: " + Arrays.toString(result));
        System.out.println("Expected output: [4.5, -8.25]");
    }
}