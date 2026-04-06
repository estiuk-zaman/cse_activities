import java.util.Scanner;

public class Extra_problem_09_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int largest = array[0];
        int sec_lar = 0;
            for (int i =0;i< array.length;i++){
                if (array[i] != array[0]){
                    sec_lar=array[i];
                    break;
                }
            }
        System.out.println("2nd Largest: " + sec_lar);

    }
}
