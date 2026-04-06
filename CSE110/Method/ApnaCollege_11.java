//move all x to the right

public class ApnaCollege_11 {
    public static String firstPart="";
    public static String secondPart="";
    public static void method(int currentIndx,int lastIndx,String msg){
        char ch =msg.charAt(currentIndx);
        if (currentIndx==lastIndx){
            if (ch=='x'){
                secondPart=secondPart+ch;
            }
            else {
                firstPart=firstPart+ch;
            }
            System.out.println(firstPart+secondPart);
            return;
        }
        if (ch =='x'){
            secondPart=secondPart+ch;
        }
        else {
            firstPart=firstPart+ch;
        }
        method(currentIndx+1,lastIndx,msg);
    }

    static void main(String[] args) {
        String message ="axbcxxd";
        int currentIndex=0;
        int lastIndex=message.length()-1;
        method(currentIndex,lastIndex,message);
    }
}
