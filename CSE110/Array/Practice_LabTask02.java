import java.util.Arrays;
import java.util.Scanner;

public class Practice_LabTask02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i =0;i<n;i++){
            array[i]=sc.nextInt();
        }

        //int [] newArray = new int[n];

        //for (int i =0;i<n;i++){
           // newArray[i]=array[index];
            //index--;
        //}
       // System.out.println("New array:" + Arrays.toString(newArray));

        System.out.println();
        int index = n-1;
        for (int i =0;i<=(n/2);i++){
            int temp = array[i];
            array[i]=array[index];
            array[index]=temp;
            index--;
        }
        System.out.println("Array: " + Arrays.toString(array));
    }
}
