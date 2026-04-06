//find the first and last occurence of an element in string

public class  ApnaCollege_09 {
    public static int first_a_index = -1;
    public static int last_a_index = -1;
    public static void occurance ( int current_index ,String msg){
        char ch = msg.charAt(current_index);
        if (current_index==0){
            if (ch=='a'){
                first_a_index=current_index;
                System.out.println("Last 'a' index: "+ last_a_index);
                System.out.println("First 'a' index: "+ first_a_index);
                return;
            }
        }
        if (ch=='a'){
            if (last_a_index==-1) {
                last_a_index = current_index;
            }
            else {
                first_a_index=current_index;
            }
        }
        occurance(current_index-1,msg);
    }

    static void main(String[] args) {
        String message = "abaacdaefaah";
        int index = message.length()-1;
        occurance(index,message);
    }
}
