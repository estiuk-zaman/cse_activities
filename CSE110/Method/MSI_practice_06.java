import java.util.Scanner;

public class MSI_practice_06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int postion = sc.nextInt();
        String result= method(message,postion);
        System.out.println(result);
    }

    public static String method(String msg,int pos){
        String first_st ="";
        String last_st="";
        for (int i =0;i<msg.length();i++){
            char ch = msg.charAt(i);
            if (i==0){
                first_st=first_st+ch;
            }
            else if (i%3==0){
                last_st=last_st+ch;
            }
            else {
                first_st=first_st+ch;
            }
        }
        String Final= first_st+last_st;
        return Final;
    }
}
