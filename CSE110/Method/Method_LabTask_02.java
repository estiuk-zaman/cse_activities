public class Method_LabTask_02 {
    public static double circleArea (double area_R){
        double area = 3.1416*area_R*area_R;
        return area;
    }

    static void main(String[] args) {
        double area = circleArea(5);
        System.out.println(area);
        double volume = sphereVolume(5.0);
        System.out.println(volume);
        findSpace(5,"square");

    }

    public static double sphereVolume (double volume_R){
        double volume = (4.0/3.0)*3.1416*volume_R*volume_R*volume_R;
        return volume;
    }

    public static void findSpace (int diameter, String msg){
        int radius = diameter/2;
        if (msg.equals("circle")){
            double result = circleArea(radius);
            System.out.println(result);
        } else if (msg.equals("sphere")) {
            double result = sphereVolume(radius);
            System.out.println(result);
        }
        else {
            System.out.println("Wrong parameter");
        }
    }
}
