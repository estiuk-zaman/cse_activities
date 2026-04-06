import java.util.Scanner;

public class Method_HomeTask_01 {
    public static boolean isPrime(int num){
        Boolean Prime = true;
        for (int i =2 ;i<num;i++){
            if (num%i==0){
                Prime = false;
                break;
            }
        }
        return Prime;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        int result = special_sum(num);
        System.out.println(result);
    }

    public static boolean isPerfect (int num ){
        int sum =0;
        for (int i = 1;i<=num/2;i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if (sum==num){
            return true;
        }
        else {
            return false;
        }
    }

    public static int special_sum (int num){
        int sum =0;
        for (int i = 2;i<=num;i++){
            if (isPrime(i)){
                sum+=i;
            }
            if (isPerfect(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
