public class MSI_practice_07 {
    static void main(String[] args) {
        reverseMethod(10);
    }
    public static void reverseMethod (int val){
        if (val==0){
            return;
        }
        System.out.println(val);
        reverseMethod(val-1);
    }
}
