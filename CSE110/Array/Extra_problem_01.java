import java.util.Scanner;

public class Extra_problem_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        for (int i =0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int j=0;j< arr.length-1;j=j+1){
            int temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        for (int k =0;k< arr.length;k++){
            System.out.print("["+arr[k]+ "]");
        }
    }
}
