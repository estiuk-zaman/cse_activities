import java.util.Scanner;

public class MSI_practice_02 {

    public static int addNumber(int num01,int num02){
        int sum = num01+num02;
        return sum;
    }
    public static int prodNumber(int num01,int num02){
        int prod = num01*num02;
        return prod;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        int result01 = addNumber(a,b);
        int result02 = prodNumber(a,b);
        System.out.println("The result is : "+ result01);
        System.out.println("Another result is : "+ result02);
    }
}