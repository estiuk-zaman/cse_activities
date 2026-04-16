public class Account {

    public String userName;
    public String address;
    private double balance;
    public static String bankName="Badda Bank";
    public static int count;
    public static double totalBalance;

    public Account(String userName,String address){
        this.userName=userName;
        this.address=address;
        count++;
    }

    public void setBalance(double tk){
        balance+=tk;
        totalBalance+=tk;
    }
    public double getBalance(){
        return balance;
    }

    public void printInfo(){
        System.out.println("Name: "+ userName+" Address: "+address);
        System.out.println("Balance: "+getBalance()+" Taka");
    }
}