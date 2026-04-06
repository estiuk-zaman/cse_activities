import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sorting {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Index ?");
        int index = sc.nextInt();
        int [] array = new int [index];
        System.out.println("Enter the numbers: ");
        for (int i = 0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        for (int j =0 ; j<array.length-1;j++){
            for (int k =0; k< array.length-1-j;k++){
                if (array[k] < array[k+1]){
                    int temp = array[k];
                    array[k]=array[k+1];
                    array[k+1]=temp;
                }
            }
        }
        System.out.println("The array: " + (Arrays.toString(array)));
    }
}
