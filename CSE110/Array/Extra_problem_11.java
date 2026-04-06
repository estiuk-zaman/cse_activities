import java.util.Scanner;

public class Extra_problem_11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i =0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        for (int i =0;i<array.length-1;i++){
            for (int j =0;j<array.length-i-1;j++){
                if (array[j]<array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        int count=0;
        for (int i =0;i< array.length;i++){
            if (i<n-1 && array[i]==array[i+1]){
                continue;
            }
            count++;
            if (count==3){
                System.out.println("3nd Lagrest: "+ array[i]);
                break;
            }
        }
    }
}