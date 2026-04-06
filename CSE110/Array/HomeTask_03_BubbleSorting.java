import java.util.Scanner;

public class HomeTask_03_BubbleSorting {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        Double [] array = new Double[n];
        for (int i =0;i<array.length;i++){
            array[i]=sc.nextDouble();
        }

        for (int j =0;j<array.length-1;j++){
            for (int k=0;k< array.length-j-1;k++){
                if (array[k]<array[k+1]){
                    Double temp = array[k];
                    array[k]=array[k+1];
                    array[k+1]=temp;
                }
            }
        }
        System.out.println("Maximum element "+array[0] + " found at index 0");
        System.out.println("Minimum element "+array[array.length-1] + " found at index "+ (array.length-1));

        Double sum =0.0;
        for (int l =0;l< array.length;l++){
            sum=sum+array[l];
        }
        System.out.println("Summation: "+ sum);
        System.out.println("Average: "+ (sum/array.length));
    }
}
