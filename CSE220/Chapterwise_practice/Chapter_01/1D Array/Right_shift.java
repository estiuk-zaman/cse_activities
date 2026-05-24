import java.util.Arrays;

public class Right_shift {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};

        for(int i =arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=0;
        System.out.println(Arrays.toString(arr));
    }
}
