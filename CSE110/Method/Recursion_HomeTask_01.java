import java.util.Scanner;

public class Recursion_HomeTask_01 {
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int x = factorial(n);
        System.out.println(x);
    }
}
