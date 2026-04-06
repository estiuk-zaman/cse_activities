import java.util.Scanner;
public class LabTask_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Code: ");
        String code = sc.nextLine();
        String output = "";
        for (int i =0; i < code.length();i++){
            char ch = code.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                output=output+((char)(ch-32));
            }
            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch == 'U'){
                output=output+((char)(ch+32));
            }
            else { output=output+ch;}
        }
        System.out.println("Redeemable Code:" + output);
        sc.close();
    }
}
