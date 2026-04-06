import java.util.Scanner;

public class Extra_problem_12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i =0;i < array.length;i++){
            array[i]=sc.nextInt();
        }

        int range = n/2;
        for (int i =0 ; i < range;i++){
            int temp = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i]=temp;

        }
        for (int i =0;i< array.length;i++){
            System.out.print("["+array[i]+"]");
        }

    }
}
