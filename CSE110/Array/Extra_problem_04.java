import java.util.Scanner;

public class Extra_problem_04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        int [] arr = new int[a];
        for (int i =0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int l=0;l<x;l++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        for (int k =0;k< arr.length;k++){
            System.out.print("["+arr[k]+ "]");
        }
    }
}
