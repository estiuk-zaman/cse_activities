public class Artifact {

    private String ArtifactName;
    private String addBy;
    private int power;
    private static String strongest;
    private static int strongestPower;
    private static Artifact [] vault = new Artifact[4];
    private static int count;

    public Artifact(String ArtifactName,String addBy){
        this.ArtifactName=ArtifactName;
        this.addBy=addBy;
        powerCalculate(ArtifactName);
        FindStrongest();
    }
    public Artifact(String ArtifactName){
        this.ArtifactName=ArtifactName;
        this.addBy="Okabe";
        powerCalculate(ArtifactName);
        FindStrongest();
    }

    private void powerCalculate(String name){
        int p=0;
        if (name.length()%2==0) {
            for(int i=0;i<name.length();i+=2){
                p+=((int)(name.charAt(i)));
            }
        }
        else{
            for(int i=1;i<name.length();i+=2){
                p+=((int)(name.charAt(i)));
            }
        }
        power=p;
    }

    private void FindStrongest(){
        if (power>strongestPower) {
            strongestPower=power;
            strongest=this.ArtifactName;
        }
    }

    public static void AddtoVault(Artifact obj){
        if (count<4) {
            vault[count]=obj;
            count++;
            System.out.println(obj.addBy+" added "+obj.ArtifactName+" successfully to the vault.");
        }
        else{
            System.out.println("!!"+obj.addBy+" unsuccesful in adding artifact to the vault!!");
        }
    }

    public static void labReport(){
        System.out.println("=== Future Gadget Lab ===");
        for (int i = 0; i < count; i++) {
            System.out.println(vault[i].ArtifactName + " added by " + vault[i].addBy + " has power of " + vault[i].power + ".");
        }
    }

    public static String strongest(){
        return strongest;
    }

    public String GetName(){
        return this.ArtifactName;
    }

    public int CalcPower(){
        return this.power;
    }

    public void revealArtifact(){
        System.out.println(this.ArtifactName + " added by " + this.addBy + " has power of " + this.power + ".");
    }

    public void changeName(String name){
        this.ArtifactName=name;
        powerCalculate(name);
        FindStrongest();
        System.out.println("Name changed and power recalculated");
    }

}