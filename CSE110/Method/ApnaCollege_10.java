//check if the array is sorted (strictly increasing)

public class ApnaCollege_10 {
    public static void arraySorted(int [] arr,int i){
        if (i== arr.length-1){
            if (arr[i]<= arr[i-1]) {
                System.out.println("Not Sorted");
            }
                else{
                    System.out.println("Sorted");
                }
            return;
        }
        if (arr[i]<= arr[i-1]){
            System.out.println("Not Sorted");
            return;
        }
        arraySorted(arr,i+1);
    }

    static void main(String[] args) {
        int [] array = {1,2,3,4,4};
        int index =1;
        arraySorted(array,index);
    }
}
