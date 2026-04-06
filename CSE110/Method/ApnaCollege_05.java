//Print x^n(stack height n)

public class ApnaCollege_05 {
    public static int calcPower ( int x,int n ){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        return x* calcPower(x,n-1);
    }

    static void main(String[] args) {
        System.out.println(calcPower(5,3));
    }
}
