public class Recursion_LabTask_02 {
    public static void reverseDigits(int num){
        if (num==0){
            return ;
        }
        System.out.println(num%10);
        reverseDigits(num/10);
    }

    static void main(String[] args) {
        reverseDigits(649);
    }
}
