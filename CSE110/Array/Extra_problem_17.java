public class Extra_problem_17 {
    static void main(String[] args) {
        int [] array ={-2, 6, -3, -10, 0, 2};
        int max=0;
        for (int i =0;i< array.length;i++){
            int prod=1;
            for (int j=i;j< array.length;j++){
                prod=prod*array[j];
                if (prod>max){
                    max=prod;
            }

            }
        }
        System.out.println(max);
    }
}
