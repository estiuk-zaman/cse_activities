public class Recursion_LabTask_04 {
    public static void reverseString (String msg,int indx){
        if (indx==msg.length()){
            return;
        }
        reverseString(msg,indx+1);
        System.out.print(msg.charAt(indx));
    }

    static void main(String[] args) {
        reverseString("swan",0);
    }
}
