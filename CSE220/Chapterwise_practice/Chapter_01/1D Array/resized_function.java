public class resized_function {
    
     static int [] resize (int[]arr,int newSize){
        int [] newArr = new int[newSize];

        for(int i =0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }
}
