//remove dublicates

public class ApnaCollege_12 {
    public static boolean [] isfound = new boolean[26];
    public static void rmvDub(String msg , int indx,String Final){
        if (indx==msg.length()){
            System.out.println(Final);
            return;
        }
        char ch = msg.charAt(indx);
        if (isfound[ch-'a']){
            rmvDub(msg, indx+1, Final);
        }
        else {
            Final=Final+ch;
            isfound[ch-'a']=true;
            rmvDub(msg, indx+1, Final);
        }
    }

    static void main(String[] args) {
        String message = "axbcxxd";
        rmvDub(message,0,"");
    }
}
