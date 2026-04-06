import java.util.Scanner;

public class MSI_practice_05 {
    public static void method (String wrd){
        int leng = wrd.length();
        int lower=0;
        int upper=0;
        for (int i =0;i<leng;i++){
            char ch = wrd.charAt(i);
            if (ch >='a' && ch<='z'){
                lower++;
            } else if (ch>='A' && ch<='Z') {
                upper++;
            }
        }
        System.out.println("UpperCase: "+upper);
        System.out.println("LowerCase: "+lower);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Word or Sentence: ");
        String word = sc.nextLine();
        method(word);
    }
}
