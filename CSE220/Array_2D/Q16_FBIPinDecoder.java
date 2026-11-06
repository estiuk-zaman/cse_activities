package CSE220.Array_2D;
import java.util.Arrays;

public class Q16_FBIPinDecoder {

    public static int[] decodeMessage(int[][] message) {
        int n = message.length;
        
        // Pin code rakhar jonno array
        int[] pin = new int[n];
        
        for(int i =0;i<n;i++){
            pin[i]=Math.abs( message[i][i]-message[i][n-1-i]);
        }
        
        
        
        return pin; 
    }

    public static void main(String[] args) {
        // Question 16 er sample matrix (with proper signs from explanation)[cite: 13]
        int[][] message = {
            {1, 2, 3, -4},
            {5, -6, 7, 8},
            {9, -10, 11, 12},
            {13, 14, 15, -16}
        };

        int[] result = decodeMessage(message);

        System.out.println("Decoded PIN: " + Arrays.toString(result));
        System.out.println("Expected PIN: [5, 13, 21, 29]");
    }
}