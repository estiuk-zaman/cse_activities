import java.util.Scanner;

public class LabTask_05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0;i< arr.length;i++){
            System.out.print("Enter a number: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array: ");
        for (int j =0; j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }

        System.out.println();

        for (int k =0; k< arr.length-1;k++){
            int min_index=k;
            for (int l=k+1;l<arr.length;l++){
                if (arr[min_index] > arr[l]){
                    min_index=l;
                }
                int temp = arr[min_index];
                arr[min_index]=arr[k];
                arr[k]=temp;
            }
        }
        System.out.println("Sorted Array:");
        for (int m =0;m< arr.length;m++){
            System.out.print(arr[m]+" ");
        }
    }
}
