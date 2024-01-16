package accounts;

public abstract class CheckingAccounts extends Account{
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

    public abstract  int calculateRewardPoint(double cost);



    public int getRewardPoints() {
        return rewardPoints;
    }
}
