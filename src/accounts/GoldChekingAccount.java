package accounts;

public class GoldChekingAccount  extends CheckingAccounts{
    public GoldChekingAccount(double balance, double interestRate, int rewardPoints) {
        super(balance, interestRate, rewardPoints);
    }

    @Override
    public int calculateRewardPoint(double cost) {
        return 0;
    }


}
