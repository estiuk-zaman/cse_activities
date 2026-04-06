public class Recursion_LabTask_03 {
    public static int sumDigits(int num){
        if (num==0){
            return 0;
        }
        return (num%10)+sumDigits(num/10);
    }

    static void main(String[] args) {
        int  x= sumDigits(12345);
        System.out.println(x);
    }
}
