public class Animalkeepers {
    private int id;
    public String name;
    private static int nextid=100;
    public static String [] Animals = {“Lion”, “Tiger”, “Seal”, “Gorilla”, “Deer”};
    public String [] task = new String[5];
    public Animalkeepers [] assigned = new Animalkeepers[5];
    public static int keeper;
    public static int task_assigned;

    public Animalkeepers(String name){
        this.name=name;
        keeper++;
        id=++nextid;
        System.out.println(name+" with ID "+id+" got the job!");
    }

    public void doTask(String animal,String task){
        boolean isFound=false;

        for(int i =0;i<Animals.length;i++){
            if (animal.equals(Animals[i])) {
                assigned[i]=this.name;
                task[i]=task;
                task_assigned++;
                isFound=true;
                System.out.println("Task assigned to "+this.name);
                break;
            }
        }
        if (!isFound) {
            System.out.println("Animal not in the Safari");
        }
    }

    public static void details(){
        System.out.println("Total Animal Keeper: "+keeper);
        System.out.println("Total Task assigned: "+task_assigned);
        printTasks();
    }

    public static void printTasks(){
        for(int i =0;i<Animals.length;i++){
            if (assigned[i]!=null) {
                System.out.println(task[i]+"(Keeper - "+keeper[i]+") === "+Animals[i]);
            }
        }
    }
    

}
