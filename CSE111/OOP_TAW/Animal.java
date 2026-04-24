public class Animal
{
    public String name;
    public Animal(String nm){
        name = nm;
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public String toString(){
        return "It's a animal";
    }
}