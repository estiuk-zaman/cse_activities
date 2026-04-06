import java.util.Scanner;

public class Method_HomeTask_02 {
    public static void showDots(int n){
        for (int i =0;i<n;i++){
            System.out.print(".");
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();
        showDiamond(num);
    }

    public static void show_palindrome (int n){
        for (int i =1 ; i<=n;i++){
            System.out.print(i);
        }
        for (int i = n-1 ; i>0;i--){
            System.out.print(i);
        }
    }

    public static void showDiamond(int n){
        for (int i =1;i<=n;i++){
            showDots(n-i);
            show_palindrome(i);
            showDots(n-i);
            System.out.println();
        }
        for (int i =n-1;i>=1;i--){
            showDots(n-i);
            show_palindrome(i);
            showDots(n-i);
            System.out.println();
        }
    }
}