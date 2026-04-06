import java.util.Scanner;

public class LabQuiz_01_try {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String temp="";
        String max_st="";

        for (int i = 0 ; i<msg.length()-1;i++){
            char ch = msg.charAt(i);
            char ch01=msg.charAt(i+1);
            temp=temp+ch;
            if (ch==ch01-1){
            }
            else {
                if (temp.length()>max_st.length()){
                    max_st=temp;
                }
                temp="";
            }

        }
        String Final="";
        if (max_st.length()<6){
            for (int i =0;i<max_st.length();i++){
                char ch02= max_st.charAt(i);
                if(ch02>='A' && ch02<='Z'){
                    Final=Final+((char)(ch02-32));
                }
            }
            for (int i=0;i<Final.length();i++){
                System.out.println(Final.charAt(i)+Final.charAt(i+2));
            }
        }
        else {
            System.out.println(max_st);
        }
        sc.close();
    }
}
