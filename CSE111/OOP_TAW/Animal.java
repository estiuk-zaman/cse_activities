public class Animal {
    public String name;
    public Animal(){
        System.out.println("No Parameter is working");
    }
    public Animal(String name){
        this.name=name;
        System.out.println("1 Paramenter is working");
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
}
