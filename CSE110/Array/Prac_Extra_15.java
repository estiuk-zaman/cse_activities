public class Prac_Extra_15 {
    static void main(String[] args) {
        int [] array ={1,2,3,4};
        int total=0;
        for (int i =0;i< array.length;i++){
            int currentSum=0;
            for (int j=i;j< array.length;j++){
                currentSum=currentSum+array[j];
            }
            total=total+currentSum;
        }
        System.out.println(total);
    }
}
