import java.util.Scanner;

public class Extra_problem_18 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        int [] array = {10, 20, 35, 50, 75, 80};
        int n = array.length;;
        int target = sc.nextInt();
        Boolean found = false;
        //for (int i =0 ;i<n;i++){
          //  array[i]=sc.nextInt();
        //}

        for (int i =0;i< n-1 ;i++){
            for (int j =i+1 ; j<n ;j++){
                if (array[i]+array[j]==target){
                    System.out.print(array[i]+","+array[j]);
                    found = true;
                    break;
                }
            }
            if (found){
                break; }
        }
    }
}
