//fibonacci till nth term
public class ApnaCollege_04 {
    public static void fibonacci(int a,int b,int n){
        if (n==2){
            return;
        }
        int c =a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);

    }

    static void main(String[] args) {
        int a=0;
        System.out.println(a);
        int b =1 ;
        System.out.println(b);
        int n =5;
        fibonacci(a,b,n);
    }
}
