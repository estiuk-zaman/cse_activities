import java.util.Scanner;
public class UngradedTask_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Message: ");
        String msg = sc.nextLine();
        System.out.print("Key: ");
        String key = sc.nextLine();
        int Long = 0;


        if (msg.length() > key.length()){
            Long = msg.length();
        }
        else {
            Long=key.length();
        }

        String output ="";
        int j =0;
        int k =0;
        for (int i = 0; i< Long ;i++){

            if (j < msg.length()){
                char ch = msg.charAt(j);
                output=output+ch;
                j++;
            }

            if (k< key.length()){
                char ch01 = key.charAt(k);
                output=output+ch01;
                k++;
            }
        }
        System.out.println(output);
        sc.close();
    }
}
