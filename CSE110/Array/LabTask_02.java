import java.util.Scanner;

public class LabTask_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.print("Enter a number: ");
            int a =sc.nextInt();
            arr[i]= a ;
        }

        int [] new_arr = new int[n];
        for (int j = 0 ; j< new_arr.length;j++){
            new_arr[j]=arr[n-1-j];
        }
        System.out.println("Reversed using a new array: ");
        for (int k = 0;k< new_arr.length;k++){
            System.out.print(new_arr[k]+" ");
        }
        System.out.println();
        for (int l =0;l<n/2;l++){
            int temp = arr[l];
            arr[l]=arr[n-1-l];
            arr[n-1-l]=temp;
        }
        System.out.println("Reversed the original array:");
        for (int m =0;m<n;m++){
            System.out.print(arr[m]+ " ");
        }
    }
}
