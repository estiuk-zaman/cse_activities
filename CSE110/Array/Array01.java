public class Array01 {
    static void main(String[] args) {
        int [] array = new int [3];
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("---------------");
        array[0]= 11;
        array[1]= 22;
        array[2]= 33;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("Length: " + array.length);

    }
}