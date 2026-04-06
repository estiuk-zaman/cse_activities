/*import java.util.Scanner;
public class Practice_04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 01 : ");
        String st01 = sc.nextLine();
        System.out.print("Enter String 02 : ");
        String st02 = sc.nextLine();
        String final01 = "";
        String final02 = "";
        String Final = "";
        for ( int i = 0;i < st01.length();i++){
            char ch01 = st01.charAt(i);
            for (int j =0 ; j< st02.length();j++){
                char ch02 = st02.charAt(j);
                if (st01.charAt(i) == st02.charAt(j)){
                    continue;
                }
                else {
                    final01 = final01 + (char)(ch01-32);
                }
            }
        }


        for ( int i = 0;i < st02.length();i++){
            char ch01 = st02.charAt(i);
            for (int j =0 ; j< st01.length();j++){
                char ch02 = st01.charAt(j);
                if (st01.charAt(i) == st02.charAt(j)){
                    continue;
                }
                else {
                    final02 = final02 + (char)(ch01-32);
                }
            }
        }
        Final = final01 + final02;
        System.out.println(Final);
    }
} */        // Wrong.

/*import java.util.Scanner;

public class Practice_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 01 : ");
        String st01 = sc.nextLine();

        System.out.print("Enter String 02 : ");
        String st02 = sc.nextLine();

        String final01 = "";
        String final02 = "";

        // uncommon characters from st01
        for (int i = 0; i < st01.length(); i++) {
            char ch1 = st01.charAt(i);
            boolean found = false;

            for (int j = 0; j < st02.length(); j++) {
                if (ch1 == st02.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found && ch1 >= 'a' && ch1 <= 'z') {
                final01 = final01 + (char)(ch1 - 32);
            }
        }

        // uncommon characters from st02
        for (int i = 0; i < st02.length(); i++) {
            char ch2 = st02.charAt(i);
            boolean found = false;

            for (int j = 0; j < st01.length(); j++) {
                if (ch2 == st01.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found && ch2 >= 'a' && ch2 <= 'z') {
                final02 = final02 + (char)(ch2 - 32);
            }
        }

        System.out.println(final01 + final02);
    }
} */        //Correct


//Practice
import java.util.Scanner;
public class Practice_04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 01 : ");
        String st01 = sc.nextLine();
        System.out.print("Enter String 02 : ");
        String st02 = sc.nextLine();
        String final01 = "";
        String final02 = "";
        for (int i = 0 ; i < st01.length();i++){
            char ch = st01.charAt(i);
            Boolean found = false ;
            for (int j = 0 ; j< st02.length();j++){
                if (ch == st02.charAt(j)){
                    found = true;
                    break;
                    }
                }
            if (!found && ch >= 'a' && ch <= 'z'){
                final01 =final01 + ((char)(ch-32));
            }
        }


        for (int i = 0 ; i < st02.length();i++){
            char ch2 = st02.charAt(i);
            Boolean found = false ;
            for (int j = 0 ; j< st01.length();j++){
                if (ch2 == st01.charAt(j)){
                    found = true;
                    break;
                    }
                }
            if (!found && ch2 >= 'a' && ch2 <= 'z'){
                final02 =final02 + ((char)(ch2-32));
            }
        }

        System.out.println(final01+final02);
        sc.close();
    }
}
