public class MSI_practice_04 {
    static void main(String[] args) {
        buildHouse();
    }
    public static void buildHouse(){
        int total= 14000+bestFrined(30000);
        System.out.println(total);
        System.out.println("Yeii,Now i can build the house.");
    }
    public static int bestFrined(int a){
        int sum = a+30000;
        return sum;
    }
}
