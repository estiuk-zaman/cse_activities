import java.util.Scanner;

public class Extra_problem_05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i =0; i<arr.length-1;i++){
            for (int j =0;j<arr.length-i-1;j++){
                if (arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        int count=0;
        for (int i =0;i<arr.length;i++){
            if (i<arr.length-1 && arr[i]==arr[i+1]){
                continue;
            }
            count++;
        }

        int [] newArr = new int[count];
        int index =0;
        for (int i =0;i< arr.length;i++){
            if (i<arr.length-1 && arr[i]==arr[i+1]){
                continue;
            }
            newArr[index]=arr[i];
            index++;
        }

        for (int i =0;i< newArr.length;i++){
            System.out.print("["+newArr[i]+"]");
        }
    }
}
