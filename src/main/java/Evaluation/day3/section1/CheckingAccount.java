package Evaluation.day3.section1;

public class CheckingAccount extends Accounts{


    public CheckingAccount(String name, double balance, double annanualRate) {
        super(name, balance, annanualRate);
    }

    @Override
    public double withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            return super.withdraw(amount);
        }
        return getBalance();
    }
}
