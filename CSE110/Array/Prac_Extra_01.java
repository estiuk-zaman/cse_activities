import java.util.Arrays;

public class Prac_Extra_01 {
    static void main(String[] args) {
        int [] array = {5,10,15,20};
        for (int i =0 ; i< array.length-1;i++){
            int temp = array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
