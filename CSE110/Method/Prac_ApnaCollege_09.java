public class Prac_ApnaCollege_09 {
    public static int last_index=-1;
    public static int first_index=-1;
    public static void occurence ( String msg,int index){
        if (index==-1){
            System.out.println("Firse 'a' : "+ first_index);
            System.out.println("Last 'a' : "+ last_index);
            return;
        }
        char ch = msg.charAt(index);
        if (ch=='a') {
            if (last_index == -1) {
                last_index=index;
            }
            else {
                first_index=index;
            }
        }
        occurence(msg,index-1);
    }

    static void main(String[] args) {
        String msg = "abaacdaefaah";
        int index = msg.length()-1;
        occurence(msg,index);
    }
}
