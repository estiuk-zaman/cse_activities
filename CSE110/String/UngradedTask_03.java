import java.util.Scanner;
public class UngradedTask_03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("s= ");
        String msg =sc.nextLine();
        int final_sum = 0;
        for (int i = 0; i< msg.length()-1;i++){
            char ch = msg.charAt(i);
            char ch01 = msg.charAt(i+1);
            int num = (int)(ch);
            int num01 = (int) (ch01);
            int sum = num - num01;
            if (sum <0){
                sum = sum *(-1);
            }
            final_sum=final_sum+sum;
        }
        if (final_sum%5 == 0){
            System.out.println("Hurray! The mysterious traveler is going home!!");
        }
        else {
            System.out.println("Oh no!! The mysterious traveler will be stuck on the island!!");
        }
        sc.close();
    }
}
