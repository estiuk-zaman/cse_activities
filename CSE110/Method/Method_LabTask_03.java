public class Method_LabTask_03 {
    public static boolean isTriangle(int a,int b,int c){
        if(a+b>c && a+c>b && b+c>a){
            return true;
        }
        else {
            return false;
        }
    }

    static void main(String[] args) {
        Boolean result = isTriangle(3,2,1);
        System.out.println(result);
        triAre(7,5,10);
    }

    public static void triAre ( int a,int b,int c){
        if (isTriangle(a,b,c)){
            double s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }
        else {
            System.out.println("Can’t form triangle");
        }
    }
}
