import java.util.Scanner;

public class Extra_problem_08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i =0;i<n;i++){
            array[i]=sc.nextInt();
        }

        int [] newArr = new int[n];
        int index=n-1;
        for (int i =n-1 ; i>=0;i--){
            if (array[i]!=0){
                newArr[index]=array[i];
                index--;
            }
        }
        for (int i =0;i<n;i++){
            System.out.print("["+newArr[i]+"]");
        }
    }
}
