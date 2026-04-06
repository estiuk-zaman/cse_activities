import java.util.Scanner;
public class LabTask_04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        char sym = sc.next().charAt(0);
        String op = "";
        char ch01 = ' ';
        for (int i = 0 ; i < msg.length();i++){
            char ch = msg.charAt(i);
            if (ch == ch01){
                continue;
            }
            else if (ch != sym){
                op=op+ch;
                ch01=ch;
            }
            if (ch == sym){
                System.out.println(op);
                op="";
            }
        }
        System.out.println(op);
        sc.close();
    }
}
