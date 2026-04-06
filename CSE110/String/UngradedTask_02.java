//Complete but Small Bug
import java.util.Scanner;
public class UngradedTask_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String temp_word = "";
        char temp_int =' ';

        int j = 0;
        int k = 2;
        for (int i =0 ; i < msg.length();i++){
            //char ch = msg.charAt(i);
            if ( msg.charAt(j) >= '0' && msg.charAt(j) <= '9'){
                temp_int = msg.charAt(j);
                j=j+4;
            }
            if (msg.charAt(k) >= 'a' && msg.charAt(k) <= 'z'){
                temp_word = temp_word + msg.charAt(k);
                k=k+4;
            }
            int num = temp_int - '0';
            for (int l = 0 ; l < num ; l++){
                System.out.print(temp_word);
            }
            temp_word="";
            temp_int=' ';
        }
        sc.close();
    }
}
