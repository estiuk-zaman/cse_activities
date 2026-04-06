import java.util.Scanner;
public class HomeTask_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Message: ");
        String msg = sc.nextLine();
        int max =0;
        for (int i = 0; i<msg.length()-1;i++){
            char ch01 = msg.charAt(i);
            char ch02 = msg.charAt(i+1);
            if (ch01 >= '0' && ch01 <='9'  && ch02 >= '0' && ch02 <='9'){
                int dig01 = ch01 -'0';
                int dig02 = ch02 -'0';
                int num = dig01*10+dig02;
                if (num>max){
                    max=num; }
            }


            }
        System.out.println("Pin: " + max);
        sc.close();
        }

    }

