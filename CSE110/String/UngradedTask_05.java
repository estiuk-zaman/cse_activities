import java.util.Scanner;
public class UngradedTask_05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String output ="";

        for (int i =0 ; i < msg.length();i++){
            char ch = msg.charAt(i);
            if (ch >='a' && ch<='z' || ch =='-' || ch=='+' || ch=='#' || ch=='%' || ch== '.'){
                if (ch == '+'){
                    output=output+msg.charAt(i-1);
                }
                else if (ch=='-'){
                    output=output+' ';
                }
                else if (ch == '#'){
                    output=output+'\n';
                } else if (ch=='%') {
                    output=output+msg.charAt(i+1)+msg.charAt(i+1);
                }
                else if (ch=='.'){
                    break;
                }
                else {
                    output=output+ch;
                }
            }
            else {
                continue;
            }
        }
        System.out.println(output);
        sc.close();
    }
}
