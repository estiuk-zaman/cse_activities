//print string in reverse

public class ApnaCollege_08 {
    public static void reverse(int i, String msg) {
        char ch = msg.charAt(i);
        if (i == 0){
            System.out.print(ch);
            return;
        }
        System.out.print(ch);
        reverse(i-1,msg);
    }


    void main(String[] args) {
        String message = "abcd";
        int index = message.length() - 1;
            reverse(index,message);
    }
}
