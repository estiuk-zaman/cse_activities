import java.util.Scanner;
public class Practice_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String s = sc.nextLine();
        String output = "";

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){

                output = output+((char)(ch-32));
            }
            else {
                output += ch;
            }


        }
        System.out.println(output);
        sc.close();
    }
}