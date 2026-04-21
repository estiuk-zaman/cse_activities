public class Animalkeepers {
    private int id;
    public String name;
    private static int nextid = 100;
    public static String[] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
    public static String[] task = new String[5];
    public static Animalkeepers[] assigned = new Animalkeepers[5];
    public static int keeper;
    public static int task_assigned;

    public Animalkeepers(String name) {
        this.name = name;
        keeper++;
        id = ++nextid;
        System.out.println(name + " with ID " + id + " got the job!");
    }

    public void doTask(String animal, String t) {
        boolean isFound = false;

        for (int i = 0; i < Animals.length; i++) {
            if (animal.equals(Animals[i])) {
                if (assigned[i] == null) task_assigned++;
                assigned[i] = this;
                task[i] = t;
                isFound = true;
                System.out.println("Task assigned to " + this.name);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Animal not in the Safari");
        }
    }

    public static void details() {
        if (keeper == 0) {
            System.out.println("No Animal Keepers working yet.");
            return;
        }
        System.out.println("Total Animal Keeper: " + keeper);
        System.out.println("Total Task assigned: " + task_assigned);
        printTasks();
    }

    public static void printTasks() {
        boolean anyTask = false;
        for (int i = 0; i < Animals.length; i++) {
            if (assigned[i] != null) {
                System.out.println(task[i] + " (Keeper - " + assigned[i].name + ") === " + Animals[i]);
                anyTask = true;
            }
        }
        if (!anyTask) System.out.println("No tasks assigned.");
    }
}