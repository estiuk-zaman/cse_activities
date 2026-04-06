//Should Polished

import java.util.Scanner;
public class UngradedTask_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String output = "";
        int count = 0; // only for letters

        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (count % 2 == 0) {
                    // lowercase
                    if (ch >= 'A' && ch <= 'Z') {
                        ch = (char)(ch + 32);
                    }
                } else {
                    // uppercase
                    if (ch >= 'a' && ch <= 'z') {
                        ch = (char)(ch - 32);
                    }
                }
                count++;
            }

            output = output + ch;
        }

        System.out.println(output);
        sc.close();
    }
}
