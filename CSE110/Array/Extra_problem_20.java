import java.util.Scanner;

public class Extra_problem_20 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1};
        int n = arr.length;
        int count = 1;
        int maxCount=1;
        for (int i =0;i<n-1;i++){
            if (arr[i]==arr[i+1]){
                count++;
            }
            else {
                count=1;
            }
            if (maxCount<count){
                maxCount=count;
            }

        }
        System.out.println("Longest contiguous sequence length: "+ maxCount);

    }
}
