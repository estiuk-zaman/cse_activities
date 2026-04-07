public class Student {

    public String Name;
    public int ID;
    public static int count=0;

    public Student(String name,int id){
        this.Name=name;
        this.ID=id;
        count+=1;
    }

    public void showdetails(){
        System.out.println("Name: "+Name);
        System.out.println("ID: "+ID);
    }

    // public void count(){
    //     System.out.println(count);
    // }
}