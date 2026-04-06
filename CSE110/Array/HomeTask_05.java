import java.util.Scanner;

public class HomeTask_05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {100, 47, 85, 94, 5, 50};
        String [] names = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};
        for (int i =0;i< marks.length;i++){
            for (int j =0;j< marks.length-i-1;j++){
                if (marks[j]>marks[j+1]){
                    int temp = marks[j];
                    String temp_name = names[j];
                    marks[j]=marks[j+1];
                    names[j]=names[j+1];
                    marks[j+1]=temp;
                    names[j+1]=temp_name;
                }
            }
        }
        for (int k=0;k< marks.length;k++){
            System.out.print(marks[k]+" ");
        }
        System.out.println();
        for (int l=0;l< names.length;l++){
            System.out.print(names[l]+ " ");
        }
    }
}
