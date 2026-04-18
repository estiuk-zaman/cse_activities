import java.util.jar.Attributes.Name;

public class CSEStudent extends Student {
    public CSEStudent(String name,int id){
        Name=name;
        ID=id;
    }

    public void doLabClass(){
        System.out.println(Name+" is doing Lab");
    }

}
