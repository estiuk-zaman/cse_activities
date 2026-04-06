import java.util.Scanner;

public class Method_HomeTask_03 {
    public static double calcTax (int age,double salary){
        double tax =0.0;
        if (age<18){
            tax=0.0;
        }
        else {
            if (salary<10000){
                tax=0.0;
            } else if (salary>=10000 && salary<=20000) {
                tax=salary*(7.0/100.0);
            }
            else {
                tax=salary*(14.0/100.0);
            }
        }
        return tax;
    }

    static void main(String[] args) {
        calcYearlyTax();
    }

    public static void calcYearlyTax(){
        Scanner sc = new Scanner(System.in);
        double yearly_tax = 0.0;
        System.out.print("Enter your age: ");
        int age0 = sc.nextInt();
        for(int i=1;i<13;i++){
            System.out.print("Enter your salary in month "+i+" : ");
            int salary0 = sc.nextInt();
            double tax = calcTax(age0,salary0);
            System.out.println("Month"+i+" tax: "+tax);
            yearly_tax += tax;
        }
        System.out.println("Total Yearly Tax: "+yearly_tax);
    }
}
