package accounts;

public class CheckingAccounts extends Account{
    public CheckingAccounts(double balance, double interestRate) {
        super(balance, interestRate);
        System.out.println("CheckingAccount constructor");
    }
}
