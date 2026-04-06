import java.util.Arrays;

public class Prac_Extra_03 {
    static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int k = 2;
        for (int i =0;i<k;i++){
            for (int j =0;j< array.length-1;j++){
                int temp = array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
