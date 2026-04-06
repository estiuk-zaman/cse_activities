import java.util.Scanner;
public class HomeTask_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String vowels = "";
        String output = "";

        for (int i =0;i<msg.length();i++){
            char ch = msg.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
                vowels=vowels+ch;
            }
        }
        int vowel_index = vowels.length()-1;
        for (int j = 0;j <msg.length();j++){
            char ch01 = msg.charAt(j);
            if (ch01 == 'a' || ch01 == 'e' || ch01 == 'i' || ch01 == 'o' || ch01 == 'u' || ch01 == 'A' || ch01 == 'E' || ch01 == 'I' || ch01 == 'O' || ch01 == 'U' ){
                output=output+vowels.charAt(vowel_index);
                vowel_index--;
            }
            else {
                output = output + ch01;
            }
        }
        System.out.println(output);
        sc.close();
    }
}
