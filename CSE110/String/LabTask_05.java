import java.util.Scanner;
public class LabTask_05{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Upside Down: ");
        String code = sc.nextLine();

        String decode = "";

        for( int i = 0; i < code.length();i++){
            char ch = code.charAt(i);
            if(ch == '^'){
                decode=decode+'v';}
            else if(ch == '3'){
                decode = decode +'e';}
            else if(ch == '@'){
                decode = decode +'a';}
            else if(ch == '_'){
                decode = decode +" ";}

            else if(ch == 'z'){
                decode = decode +'a';}
            else{
                int ascii = (int) ch;
                ascii=ascii+1;
                char conv = (char)ascii;
                decode = decode+ conv;
            }
        }
        System.out.println("Hawkins: " + decode);
        sc.close();
    }
}
   