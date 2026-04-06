import java.util.Scanner;

public class Prac_HoneTask_04 {
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

        boolean isSubSet=false;
        for (int i =0;i< arr1.length;i++){
            for (int j =0;j< arr.length;j++){
                if (arr1[i]==arr[j]){
                    isSubSet=true;
                    break;
                }
                }
            if (!isSubSet){
                break;
            }
        }
        if (!isSubSet){
            System.out.println("Not");
        }
        else {
            System.out.println("Yes");
        }
    }
}
