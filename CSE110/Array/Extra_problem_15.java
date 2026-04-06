import java.util.Scanner;

public class Extra_problem_15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {1,2,3};
        int n = array.length;;
        //for (int i =0;i<n;i++){
            //array[i]=sc.nextInt();
        //}
        int sum=0;
        for (int i =0 ;i<n;i++){
            for (int j =i; j<n ; j++){
                int subAraaySum=0;
                for (int k=i;k<=j;k++){
                    subAraaySum=subAraaySum+array[k];
                }
                sum=sum+subAraaySum;
            }
        }
        System.out.println("Total Sum: " + sum);
    }
}
