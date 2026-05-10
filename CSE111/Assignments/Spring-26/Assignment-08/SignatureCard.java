public class SignatureCard extends CreditCard {

    int prevPoints;

    SignatureCard(String name, String accNum) {
        super(name, accNum, 200);
    }

    public void spendCash(int spentAmount) {
        int basePoints = spentAmount / 100;
        prevPoints = this.rewardPoints;
        this.rewardPoints += (basePoints * 4);

        System.out.println("Previous Reward Points: " + prevPoints);
        System.out.println("Reward points after spending " + spentAmount + " taka: " + this.rewardPoints);
    }

    public void cardDetails() {
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: 5");
    }
}