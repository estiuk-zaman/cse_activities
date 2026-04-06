import java.util.Scanner;
public class LabTask_06{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String marksta="101";
        int mark = 0 ;

        for( int i =0 ; i< marksta.length(); i++){
            char ch = marksta.charAt(i);
            int a = ch-'0';
            mark = mark*10 + a ;
        }
        if (mark >= 90 && mark <= 100) { System.out.println("Grade: A"); } else if (mark >= 80 && mark <= 89) { System.out.println("Grade: A-"); } else if (mark >= 70 && mark <= 79) { System.out.println("Grade: B"); } else if (mark >= 60 && mark <= 69) { System.out.println("Grade: C"); } else if (mark >= 50 && mark <= 59) { System.out.println("Grade: D"); } else if (mark < 50) { System.out.println("Grade: F"); }
        else{System.out.println("Invalid Mark"); }
        sc.close();

    }
}
     