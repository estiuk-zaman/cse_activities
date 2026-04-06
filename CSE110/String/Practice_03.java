import java.util.Scanner;
public class Practice_03{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentece = sc.nextLine();
        String word = sc.nextLine();
        int count =0;
        for(int i =0; i < sentece.length();i++){
            char ch = sentece.charAt(i);
            if(ch == word.charAt(0)){
                int index = i;
                Boolean flag = true;
                for (int j = 0; j< word.length(); j++){
                    if (sentece.charAt(index) != word.charAt(j)){
                        flag =false;
                        break;
                    }
                    index++;
                }
                if(flag = true){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}