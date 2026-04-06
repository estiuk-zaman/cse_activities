public class Extra_problem_16 {
    static void main(String[] args) {
        int [] array = {2, 3, -8, 7, -1, 2, 3};
        int max=0;
        for (int i =0;i <array.length;i++){
            int currentSum=0;
            for (int j =i ; j< array.length;j++){
                currentSum=currentSum+array[j];
                if (currentSum>max){
                    max=currentSum;
            }
            }
        }
        System.out.println(max);
    }
}
