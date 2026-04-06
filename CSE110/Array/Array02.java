import java.util.Arrays;
import java.util.Scanner;

public class Array02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[3];
        System.out.println("Give the numbers: ");
        for (int i =0 ; i< array.length;i++){
            array[i]=sc.nextInt();
        }

        for (int j =0 ; j< array.length;j++){
            System.out.println("Index: " + j + " -"+ array[j]);
        }

        System.out.println(Arrays.toString(array));
    }
}
