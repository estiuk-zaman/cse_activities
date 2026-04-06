import java.util.Scanner;
public class LabTask_02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 01 : ");
        String st01 = sc.nextLine();
        System.out.print("Enter string 02 : ");
        String st02 = sc.nextLine();
        String op = "";
        int len;

        if (st01.length() > st02.length()) {
            len = st02.length();
        } else {
            len = st01.length();
        }
    for (int i = 0; i < len ; i++){
        if (st01.charAt(i)==st02.charAt(i)){
            op=op+st01.charAt(i);
        }
        else {
            break; }
        }
    if (op.length()==0){
        System.out.println("There is no common prefix between the input strings.");
    }
    else {
        System.out.println(op);
    }
    sc.close();
    }
    }



