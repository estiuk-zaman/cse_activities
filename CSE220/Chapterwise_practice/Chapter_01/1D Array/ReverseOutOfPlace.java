import java.util.Arrays;

public class ReverseOutOfPlace {
    public static void main(String[] args) {
        int [] arr = {5, 3, 9, 13, 2};
        int [] newArr = new int[5];

        for(int i =0;i<arr.length;i++){
            newArr[newArr.length-(i+1)]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
