package accounts;

public class Savings extends Account{
    public Savings(double balance, double interestRate) {
        super(balance, interestRate);
    }

    public boolean withdraw(double amount){
        double fee = 0.25 * amount;
        amount += fee;

       return  super.withdraw(amount);
    }
}
