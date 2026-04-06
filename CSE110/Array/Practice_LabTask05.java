import java.util.Arrays;
import java.util.Scanner;

public class Practice_LabTask05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int [] array = {3,6,1,2,8,5};
       // for (int i =0;i<array.length;i++){
         //   array[i]=sc.nextInt();
        //}
        System.out.println("Main array:" + Arrays.toString(array));

        for (int i =0;i< array.length-1;i++){
            int min_index = i;
            for (int j =i+1;j< array.length;j++){
                if (array[j]>array[min_index]){
                    min_index=j;
                }
            }
            int temp = array[min_index];
            array [min_index]=array[i];
            array[i]=temp;
        }
        System.out.println("New Array: "+ Arrays.toString(array));
    }
}
