import java.util.Scanner;
public class UngradedTask_06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        Boolean Uc = false;
        Boolean Lc = false;
        Boolean digit = false;
        Boolean Sc = false;
        Boolean Long = true ;
        for (int i =0 ; i < pass.length();i++){
            char ch = pass.charAt(i);
            if (pass.length()<8){
                Long=false;
            }
            if (ch >= 'a' && ch <= 'z'){
                Lc = true;
            }
            if (ch >= 'A' && ch <= 'Z'){
                Uc = true;
            }
            if (ch >= '0' && ch <= '9'){
                digit = true;
            }
            if (!(ch >= 'a' && ch <= 'z') || !(ch >= 'A' && ch <= 'Z') || !(ch >= '0' && ch <= '9') || ch != ' '){
                Sc = true;
            }
        }
        if (Uc == true && Lc==true && digit == true && Sc == true && Long == true){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        sc.close();
    }
}
