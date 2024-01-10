package accounts;

public class CheckingAccounts extends Account{
    public int rewardPoints;
    public CheckingAccounts(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate);
        this.rewardPoints = rewardPoints;
    }

    public boolean purchase(double cost){
        if (cost > balance){
            return false;
        }

        balance -= cost;
        rewardPoints += calculateRewardPoint(cost);
        return true;
    }

    public int calculateRewardPoint(double cost){
        return (int) (cost * 10);
    }

    public int getRewardPoints() {
        return rewardPoints;
    }
}
