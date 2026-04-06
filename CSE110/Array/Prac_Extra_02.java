import java.util.Arrays;

public class Prac_Extra_02 {
    static void main(String[] args) {
        int [] array = {10,20,30,40};
        for (int i = array.length-1;i>0;i--){
            int temp = array[i];
            array[i]=array[i-1];
            array[i-1]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
