public class Recursion_HomeTask_03 {
    public static void print_elements ( int [] array , int indx){
        if (indx== array.length){
            return;
        }
        System.out.println(array[indx]);
        print_elements(array, indx+1);
    }

    static void main(String[] args) {
        int[] arr = {5,6,2,1,8,7};
        int index = 2;
        print_elements(arr,index);
    }
}
