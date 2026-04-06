import java.util.Scanner;

public class HomeTask_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n  = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i < arr.length;i++){
            System.out.print("Enter a number: ");
            arr[i]=sc.nextInt();
        }
        Boolean flag = false;
        int target = sc.nextInt();
        for (int j = 0 ; j< arr.length;j++){
            if (arr[j]== target ){
                System.out.println(target+ " is at index "+ j);
                flag = true;
                break;
            }
        }
        if (flag==false){
            System.out.println("Element not found");
        }
    }
}
