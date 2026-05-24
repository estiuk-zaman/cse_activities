import java.util.Arrays;

public class Rotate_right {
    public static void main(String[] args) {
        int [] arr = {5, 3, 9, 13, 2};
        int last=arr[arr.length-1];

        // for(int i =0;i<arr.length-1;i++){
        //     int temp=0;
        //     arr[i]=temp;
        //     arr[i]=arr[i+1];
        //     arr[i+1]=temp;
        // }

        for(int i =arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;

        System.out.println(Arrays.toString(arr));
    }
}
