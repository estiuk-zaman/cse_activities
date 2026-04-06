public class Recursion_LabTask_01 {
    public static void oneToN (int a ,int N){
        if (a>N){
            return;
        }
        System.out.print(a+" ");
        oneToN(a+1,N);
    }

    static void main(String[] args) {
        oneToN(1,11);
        System.out.println();
        NtoOne(6,1);
        System.out.println();
        System.out.println(recursiveSum(1,4,0));
    }
    public static void NtoOne (int N,int a){
        if (N<a){
            return;
        }
        System.out.print(N+" ");
        NtoOne(N-1,a);
    }
    public static int recursiveSum(int a ,int N,int sum){
        if (a>N){
            return sum;
        }
        sum=sum+a;
        return recursiveSum(a+1,N,sum);
    }
}
