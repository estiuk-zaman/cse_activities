import java.util.Arrays;

public class Prac_Extra_06 {
    static void main(String[] args) {
        int [] array ={0,1,0,3,12};
        int index=0;
        for (int i =0;i< array.length;i++){
            if (array[i]!=0){
                array[index]=array[i];
                index++;
            }
        }
        for (int j=index;j< array.length;j++){
            array[j]=0;
        }
        System.out.println(Arrays.toString(array));
    }
}
