import java.util.Scanner;
public class HomeTask_03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Names of the spells: ");
        String Long_spell = "";
        int power = 0;
        while (true){
            String msg = sc.nextLine();
            if (msg.equals("stop")){
                break;
            }

            String clean ="";
            for (int i =0; i < msg.length();i++){
                char ch = msg.charAt(i);
                if (ch >= 'a' && ch <='z' || ch>='A' && ch <='Z'){
                    if (ch >='a' && ch<='z'){
                        clean=clean+ ((char)(ch-32));
                    }
                    else { clean=clean+ch;}
                }
                if (clean.length()>Long_spell.length()){
                    Long_spell=clean;
                }
            }
        }
        for (int j =0 ;j< Long_spell.length();j++){
            char ch01 = Long_spell.charAt(j);
            power=power+(int) (ch01);
        }
        System.out.println("Largest Spell : " + Long_spell);
        System.out.println("Power Level : " + power);
        sc.close();
    }
}
