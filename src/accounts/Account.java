package accounts;

public class Account {
    private  double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        System.out.println("Account constructor");
        //this.balance = balance;
        //this.interestRate = interestRate;
    }


    public boolean withdraw(double amount){
        if ( amount > balance){
            return false;
        }

        balance -= amount;
        return true;
    }

    public void deposit (double amount){
        balance += amount;

    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void status(){
        System.out.printf("Balance: %.2f\n ", balance);
    }
}