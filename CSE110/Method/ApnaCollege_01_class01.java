//print 1 to 5
public class ApnaCollege_01_class01 {
    public static void method(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        method(n+1);
    }

    static void main(String[] args) {
        int num =1;
        method(num);
    }
}
