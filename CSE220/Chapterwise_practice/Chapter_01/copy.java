package CSE220.Chapterwise_practice.Chapter_01;

public class copy {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int [] newArr = new int[5];

        for(int i =0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
    }
}
