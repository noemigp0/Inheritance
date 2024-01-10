package accounts;

public class SilverCheckingAccount extends CheckingAccounts{

    public SilverCheckingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoint(double cost) {
        return (int )(cost * 25);
    }
}
