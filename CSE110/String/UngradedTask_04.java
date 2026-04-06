import java.util.Scanner;
public class UngradedTask_04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ascii = 0;
        int total =100;
        int spell=0;
        while (true){
            String name = sc.nextLine();
            spell++;
            if (spell==5){
                break;
            }
            for (int i =0;i<name.length();i++){
                char ch = name.charAt(i);
                ascii=ascii+((int) (ch));
            }
            if (name.length()<3){
                total=total+10;
            }
            else {
                if (ascii%2 == 0){
                    total=total+25;
                }
                else {
                    total=total-50;
                }

            }
            if (ascii%3==0){
                total=total+10;
            }
            if (total>200){
                total=200;
            }
            ascii=0;
        }
        if (total<0){
            System.out.println("You Win.");
        }
        else {
            System.out.println("You lose.");
        }
        sc.close();
    }
}
