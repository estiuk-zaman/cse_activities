import java.util.Arrays;

public class resized {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int [] newArr = new int[8];

        for(int i =0;i<arr.length;i++){
            newArr[i]=arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }    
}
