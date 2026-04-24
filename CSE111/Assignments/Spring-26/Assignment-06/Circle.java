public class Circle extends Shape {
    public double radius;

    public void area(){
        double area = (3.1416*radius*radius);
        System.out.println("Area of Red Circle: "+area); 
    }
}