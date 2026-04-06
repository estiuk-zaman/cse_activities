import java.util.Scanner;

public class LabQuiz_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int maxStart = 0;
        int maxLen = 1;

        int currStart = 0;
        int currLen = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1) + 1) {
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                    maxStart = currStart;
                }
                currStart = i;
                currLen = 1;
            }
        }

        // last sequence check
        if (currLen > maxLen) {
            maxLen = currLen;
            maxStart = currStart;
        }

        // Output
        if (maxLen > 5) {
            for (int i = maxStart; i < maxStart + maxLen; i += 2) {
                char ch = s.charAt(i);
                System.out.print((char)(ch - 32)); // lowercase → uppercase
            }
        } else {
            for (int i = maxStart; i < maxStart + maxLen; i++) {
                System.out.print(s.charAt(i));
            }
        }
        sc.close();
    }
}
