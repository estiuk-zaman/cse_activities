public class Dog extends Animal
{
    public String color;
    public Dog(String nm, String clr){
        super(nm);
        color = clr;
    }
    public void bark(){
        System.out.println(color + " " + name + " is barking");
    }

    // public String toString(){
    //     return "It's a dog";
    // }
}