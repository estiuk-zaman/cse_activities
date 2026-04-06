import java.util.Scanner;

public class MSI_practice_01 {

    public static int addNumber(int num01,int num02){
        int sum = num01+num02;
        return sum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        int result = addNumber(a,b);
        System.out.println("The result is : "+ result);
    }
}