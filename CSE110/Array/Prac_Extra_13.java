import java.util.Arrays;

public class Prac_Extra_13 {
    static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8};
        int k=3;
        for (int i =0;i< array.length;i=i+k){
            int left = i;
            int right;
            if (i+k-1< array.length){
                right=i+k-1;
            }
            else {
                right=array.length-1;
            }
            while (left<right){
                int temp = array[left];
                array[left]=array[right];
                array[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
