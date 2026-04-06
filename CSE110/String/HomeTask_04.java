import java.util.Scanner;
public class HomeTask_04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fan Message: ");
        String msg = sc.nextLine();
        String temp = "";
        int madrid =0;
        int city =0;
        Boolean foundClose= false;
        Boolean foundDestroy = false;

        for (int i = 0; i < msg.length();i++){
            char ch = msg.charAt(i);
            if (ch == '.' || ch == '!' || ch ==' '){
                if (temp .equalsIgnoreCase("MADRID")){
                    madrid++;
                }
                else if (temp .equalsIgnoreCase("city")){
                    city++;
                }
                 if ( temp .equalsIgnoreCase("close")){
                    foundClose = true;
                } else if (temp .equalsIgnoreCase("destroy")) {
                    foundDestroy= true ;
                }
                temp="";
            }
            else {
                temp = temp + ch;
            }
        }

        if (madrid>city){
            System.out.println("Madrid Supporter.");
        }
        else if (city>madrid){
            System.out.println("City Supporter.");
        }
        else {
            System.out.println("Neutral");
        }

        if (foundClose){
            System.out.println("Fan expect a close match");
        } else if (foundDestroy) {
            System.out.println("Fan expects a dominating victory!");
        }
        else {
            System.out.println("Hard to read the fan sentiment." );
        }
        sc.close();
    }
}
