import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        int [] arr = {5, 3, 9, 13, 2};
        int index=2;
        int currentSize = 5;
        if (index<0 || index>=currentSize) {
            System.out.println("not Possible");
            return;
        }
        for(int i =index;i<=currentSize-2;i++){
            arr[i]=arr[i+1];
        }
        arr[currentSize-1]=0;
        
        System.out.println(Arrays.toString(arr));
    }
}
