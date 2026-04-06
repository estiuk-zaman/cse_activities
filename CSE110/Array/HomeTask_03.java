import java.util.Scanner;

public class HomeTask_03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        Double [] array = new Double[n];
        for (int i =0;i<array.length;i++){
            System.out.print("Enter a number: ");
            array[i]=sc.nextDouble();
        }
        Double max=array[0];
        Double min=array[0];
        int max_index=0;
        int min_index=0;
        for (int j =0;j<array.length;j++){
            if (array[j]>max){
                max=array[j];
                max_index=j;
            }
            if (array[j]<min){
                min=array[j];
                min_index=j;
            }

        }
        System.out.println("Maximum element "+max + " found at index "+ max_index);
        System.out.println("Minimum element "+min + " found at index "+ min_index);

        Double sum =0.0;
        for (int l =0;l< array.length;l++){
            sum=sum+array[l];
        }
        System.out.println("Summation: "+ sum);
        System.out.println("Average: "+ (sum/array.length));
    }
}
