import java.util.Scanner;

public class LabTask_03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {9, -5, 7, 9, -5, 5, 7};

        System.out.println("Before removing duplicates:");
        for (int l =0;l<arr.length;l++){
            System.out.print(arr[l]+ " ");
        }
        System.out.println();

        for (int i = 0 ; i < arr.length-1;i++){
            for (int j =i+1 ;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        System.out.println("After replacing duplicates with 0: ");
        for (int k =0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
