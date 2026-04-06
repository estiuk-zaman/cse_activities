import java.util.Scanner;

public class HomeTask_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array: ");
        for (int j =0 ; j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();

        for (int k =0; k< arr.length;k++) {
            if (arr[k] == 0) {
                continue;
            } else if (arr[k] > 0) {
                arr[k] = 1;
            } else {
                arr[k] = 0;
            }
        }
            System.out.println("After modifying: ");
            for (int l =0; l<arr.length;l++){
                System.out.print(arr[l]+ " ");
            }
        }
    }

