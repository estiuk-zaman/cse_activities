import java.util.Arrays;
import java.util.Scanner;

public class Selection_sorting {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Index?");
        int index = sc.nextInt();
        int[] array = new int[index];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < array.length - 1; j++) {        //decending
            int min_index = j;
            for (int k = j + 1; k < array.length; k++) {
                if (array[min_index] < array[k]) {
                    min_index = k;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[j];
            array[j] = temp;


        }
        System.out.println("Array: " + Arrays.toString(array));
    }
}