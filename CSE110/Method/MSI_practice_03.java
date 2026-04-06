public class MSI_practice_03 {
    static void main(String[] args) {
        System.out.println("The Result is: "+ methodOne(4));
    }
    public static int methodOne(int a){
        int sum = methodTwo(5,6)+a;
        return sum;
    }
    public static int methodTwo(int a,int b){
        int sum02= (a*b)+4;
        return sum02;
    }
}
