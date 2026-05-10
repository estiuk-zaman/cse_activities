public class PlatinumCard extends CreditCard {

    int prevPoints;

    PlatinumCard(String name, String accNum) {
        super(name, accNum, 100);
    }

    public void spendCash(int spentAmount) {
        int basePoints = spentAmount / 100;
        prevPoints = this.rewardPoints;
        this.rewardPoints += (basePoints * 2);

        System.out.println("Previous Reward Points: " + prevPoints);
        System.out.println("Reward points after spending " + spentAmount + " taka: " + this.rewardPoints);
    }
}