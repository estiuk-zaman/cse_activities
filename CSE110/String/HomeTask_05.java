import java.util.Scanner;
public class HomeTask_05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String last = "";
        for (int i = msg.length()-1 ; i>=0;i--){
            char ch = msg.charAt(i);
            if (ch == ' '){
               break;
            }
            else {
                last = last+ch;
            }
        }
        System.out.println(last.length());
        sc.close();
    }
}
