import java.util.Arrays;

public class Prac_Extra_08 {
    static void main(String[] args) {
        int [] array = {1, 2, 0, 4, 3, 0, 5, 0};
        int index = array.length-1;
        for (int i = array.length-1;i>=0;i--){
            if (array[i]!=0){
                array[index]=array[i];
                index--;
            }
        }
        for (int i = index;i>= 0;i--){
            array[i]=0;
        }
        System.out.println(Arrays.toString(array));
    }
}
