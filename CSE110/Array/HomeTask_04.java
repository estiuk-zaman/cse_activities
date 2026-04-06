import java.util.Scanner;

public class HomeTask_04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Please enter the elements of the arr1: ");
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Please enter the length of array 2: ");
        int n1=sc.nextInt();
        int [] arr1 = new int[n1];
        System.out.println("Please enter the elements of the arr2: ");
        for (int j =0;j< arr1.length;j++){
            arr1[j]=sc.nextInt();
        }

        Boolean isSubSet=false;
        for (int k=0;k<arr1.length; k++){
         for (int l=0;l<arr.length;l++){
             if (arr1[k]==arr[l]){
                 isSubSet=true;
                 break;
             }
             else {
                 isSubSet=false;
             }
         }
            if (isSubSet==false) {
                break; }
        }
        if (!isSubSet){
            System.out.println("Array 2 is not a subset of Array 1. ");
        }
        else {
            System.out.println("Array 2 is a subset of Array 1. ");
        }
    }
}
