import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int [] arr = {5, 3, 9, 13, 2};
        int index=2;
        int currentSize=5;
        int value=69;

        if (index<0||index>currentSize) {
            System.out.println("Not possible");
            return;
        }
        if (currentSize==arr.length) {
           arr=resized_function.resize(arr, currentSize*2);
        }
        for(int i = currentSize;i>=index+1;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=value;
        currentSize++;

        System.out.println(Arrays.toString(arr));
    }
}
