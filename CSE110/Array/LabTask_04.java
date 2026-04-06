import java.util.Scanner;

public class LabTask_04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {23,100,23,56,100};
        int count=0;

        System.out.println("Input array: ");
        for (int n =0 ;n < arr.length;n++){
            System.out.print(arr[n]+ " ");
        }

        System.out.println();
        for (int i =0;i< arr.length-1;i++){
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        for (int k =0;k< arr.length;k++){
            if (arr[k]!=0){
                count++;
            }
        }
        int [] new_array=new int[count];

        int index=0;
        for (int l=0;l<arr.length;l++){
            if (arr[l]!=0){
                new_array[index]=arr[l];
                index++;
            }
        }
        System.out.println("New array: ");
        for (int m=0;m< new_array.length;m++){
            System.out.print(new_array[m]+ " ");
        }
    }
}
