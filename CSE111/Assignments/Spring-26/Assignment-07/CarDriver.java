public class CarDriver extends GenericDriver{
    public static String [] restrictedAreas = new String[0];
    
    public CarDriver(String name){
        super(name);
    }

    public String toString(){
       return (getName()+"'s profile is Premium");
    }

    public static void restrictedAreas(String areaName){
        String [] newArr = new String[restrictedAreas.length+1];
        for(int i =0;i<restrictedAreas.length;i++){
            newArr[i]=restrictedAreas[i];
        }
        newArr[restrictedAreas.length]=areaName;
        restrictedAreas=newArr;
    }

    public void fightRestriction(String[] arr){
        for(int j =0;j<arr.length;j++){
            boolean isFound=false;
            for(int i =0;i<restrictedAreas.length;i++){
                if (arr[j].equals(restrictedAreas[i])) {
                    isFound=true;
                    break;
                }
            }
            if (isFound) {
    System.out.println(getName()+" cannot enter "+arr[j]);
}
else {
    System.out.println(getName()+" can enter "+arr[j]);
}

        }
    }
}
