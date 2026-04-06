public class Prac_ApnaCollege_10 {
    public static void sortedChecker(int [] array , int index){
        if (index== array.length-1){
            if (array[index]<=array[index-1]){
                System.out.println("Not Sorted");
            }
            else {
                System.out.println("Sorted");
            }
            return;
        }
        if (array[index]<=array[index-1]){
            System.out.println("Not Sorted");
            return;
        }
        sortedChecker(array,index+1);
    }

    static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int index =1;
        sortedChecker(array,index);
    }
}
