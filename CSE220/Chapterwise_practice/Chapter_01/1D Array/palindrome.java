public class palindrome {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 2, 1};
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
