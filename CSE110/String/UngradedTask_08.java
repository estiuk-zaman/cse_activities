import java.util.Scanner;
public class UngradedTask_08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String output = "";
        String word = "";
        for (int i = 0 ; i < msg.length(); i++){
            char ch = msg.charAt(i);
            if (ch != ' '){
                word=word+ch;
            }
            else {
                output= word+ " " +output;
                word="";
            }
        }
        output = word + " " + output;
        System.out.println(output);
        sc.close();
    }
}
