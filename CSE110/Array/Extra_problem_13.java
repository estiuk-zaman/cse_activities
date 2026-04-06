import java.util.Scanner;

public class Extra_problem_13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i =0;i<n;i++){
            array[i]=sc.nextInt();
        }


        for (int i =0;i<n;i+=k){
            int left =i;
            int right;

            if (left+k-1 <n){
                right=left+k-1;
            }
            else {
                right=n-1;
            }

            while (left<right){
                int temp = array[left];
                array[left]=array[right];
                array[right]=temp;
                left++;
                right--;
            }
        }
        for (int i =0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
