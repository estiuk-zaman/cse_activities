public class Prac_ApnaCollege_12 {
    public static boolean [] isFound = new boolean[26];
    public static void removeDublicates(String msg,int index,String Final){
        if (index==msg.length()){
            System.out.println(Final);
            return;
        }
        char ch = msg.charAt(index);
        if (isFound[ch-'a']){
            removeDublicates(msg, index+1, Final);
        }
        else {
            Final=Final+ch;
            isFound[ch-'a']=true;
            removeDublicates(msg, index+1, Final);
        }
    }

    static void main(String[] args) {
        removeDublicates("abbceeddesaaa",0,"");
    }
}
