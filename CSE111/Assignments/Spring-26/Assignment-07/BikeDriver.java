public class BikeDriver extends GenericDriver{
    public String type;
    public static String [] restrictedAreas = new String[0];

    public BikeDriver(String name,String type){
        super(name);
        this.type=type;
    }

    public String toString(){
        return (getName()+"'s profile is "+type);
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

    public String acceptRide(boolean hasVehicle){
    String s = "All Pathao drivers can accept rides.\n";
    if(!hasVehicle) s += "Driver does not have a verified vehicle.\n";
    else            s += "Driver has a verified vehicle.\n";
    s += toString();
    return s;
}

}
