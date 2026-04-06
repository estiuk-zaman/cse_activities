//Tower of Hanoi [TAP ACADEMY] (https://www.youtube.com/watch?v=3aag8Wpv8XM)

public class ApnaCollege_07_class02 {
    public static void towerOfHanoi(int n , char src ,char aux , char des){
        if (n==1){
            System.out.println("Transfered disk "+n+" from "+ src + " to "+ des);
            return;
        }
        towerOfHanoi(n-1,src,des,aux);
        towerOfHanoi(1,src,aux,des);
        towerOfHanoi(n-1,aux,src,des);
    }

    static void main(String[] args) {
        towerOfHanoi(3,'A','B','C');
    }

}
