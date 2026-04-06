import java.util.Scanner;

public class LabTask_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0 ; i < array.length ;i++){
            System.out.print("Enter a number: ");
            array[i]=sc.nextInt();
        }
        System.out.println("The elements of the array: ");
        for (int j =0;j< array.length;j++){
            System.out.println(j + ": " + array[j]);
        }

        int [] resized = new int[n+1];
        System.out.print("Enter another number: ");
        int a = sc.nextInt();

        for (int k = 0;k<n;k++){
            resized[k]=array[k];
            resized[n]=a;
        }
        System.out.println("After resizing the array: ");
        for (int l = 0; l< resized.length;l++){
            System.out.print(resized[l]+" ");
        }
    }
}
