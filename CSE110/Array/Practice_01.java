import java.util.Scanner;

public class Practice_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Koyta number nite chau bolo: ");
        int num = sc.nextInt();
        int [] array = new int[num];
        System.out.print("Target:");
        int target = sc.nextInt();
        System.out.print("Number gula deu vai :");


        for (int i = 0 ; i < array.length;i++){
            array[i]= sc.nextInt();
        }
        int count =0;
        for (int j =0; j < array.length;j++){
            for (int k =j+1 ; k< array.length ; k++){
                if (array[j]+array[k]==target){
                    System.out.println("Elements need to be added: "+ array[j]+ " " + array[k]);
                    System.out.println("Index of the elements: "+ j + " " + k);
                    count++;
                    break;
                }
            }
            if (count==1){
                break;
            }
        }
    }
}
