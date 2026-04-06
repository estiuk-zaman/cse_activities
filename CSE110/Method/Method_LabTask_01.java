public class Method_LabTask_01 {
    public static void evenChecker(int num){
        if (num%2==0){
            System.out.println("Even!!");
        }
        else {
            System.out.println("Odd!!");
        }
    }

    static void main(String[] args) {
        evenChecker(7);

        Boolean result_isEven = isEven(9);
        System.out.println(result_isEven);

        Boolean result_ispos= isPos(5);
        System.out.println(result_ispos);

        sequence(7);
    }

    public static boolean isEven (int num){
        if (num%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPos (int num){
        if (num>=0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void sequence(int num){
        if (isPos(num)){
            for (int i =0;i<=num;i++){
                if (isEven(i)){
                    System.out.print(i+" ");
                }
            }
        }
        else {
            for (int i =num;i<=-1;i++){
                if (!isEven(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }
}