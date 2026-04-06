import java.util.Scanner;

public class Recursion_HomeTask_02 {
    public static int power ( int base,int exponent){
        if (exponent==0){
            return 1;
        }
        return base * power(base,exponent-1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int b = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int ex = sc.nextInt();
        int x = power(b,ex);
        System.out.println(x);
    }
}
