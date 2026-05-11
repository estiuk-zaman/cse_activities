public class Butterfly extends Caterpillar {
    public Butterfly(String food,int age){
        super(food, age);
    }
    public void transform(){
        System.out.println("Caterpillar transforms into Butterfly");
    }
    public void eat(int unit){
        energy=energy+5*unit-5;
        System.out.println("Butterfly lost energy while flying and absorbed nectar");
    }
    public void showDetails() {
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy+" joules");
  }

}
