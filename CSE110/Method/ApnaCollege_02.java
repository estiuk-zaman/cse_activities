//sum of first n natural number


/*  public class ApnaCollege_02 {
    public static int narutalNumber(int n){
        if (n==0){
            return 0;
        }
        return n+narutalNumber(n-1);
    }

    static void main(String[] args) {
        int num =5;
        int result=narutalNumber(num);
        System.out.println("Answer: "+ result);
    }
}       */

public class ApnaCollege_02 {
    public static void naturalNumber(int i,int n,int sum){
        if (i==5){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        naturalNumber(i+1,n,sum);
    }

    static void main(String[] args) {
        int i=1;
        int n=5;
        int sum=0;
        naturalNumber(i,n,sum);
    }
}
