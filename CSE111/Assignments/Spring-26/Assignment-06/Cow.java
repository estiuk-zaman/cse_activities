public class Cow extends Animal{
    public String name;

    public Cow() {
      System.out.println("The cow says hello!");
    }
    public String getName(){
      return this.name;
    }
    public void updateSound(String sn){
      super.sound=sn;
    }
}