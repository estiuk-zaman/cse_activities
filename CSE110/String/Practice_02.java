import java.util.Scanner;
public class Practice_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String output = "";

        for (int i =0; i < s.length();i++){
            char ch = s.charAt(i);
            if (ch == ' '){
                output=output+ch;
            }
            else if(i%2==0){
                continue;
            }
            else {
                if(ch >= 'a' && ch <='z'){
                    output = output + ((char) (ch-32));
                }  else { output= output+ch; }
            }
        }
        System.out.println(output);
        sc.close();
    }
}
