public class rev_print {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,0,0};
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
