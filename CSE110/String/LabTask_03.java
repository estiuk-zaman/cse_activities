import java.util.Scanner;
public class LabTask_03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Text: ");
        String txt = sc.nextLine();
        System.out.print("Start Index: ");
        int st = sc.nextInt();
        System.out.print("End Index: ");
        int end = sc.nextInt();
        for (int i = (st) ; i <= end ; i++){
            System.out.print(txt.charAt(i));
        }
        sc.close();
    }
}
