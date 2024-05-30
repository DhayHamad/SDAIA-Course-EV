package Evaluation.day3.section1;

public class SavingAccount extends Accounts{
    private double limits;

    public SavingAccount(String name, double balance, double annanualRate,double limits) {
        super(name, balance, annanualRate);
        this.limits = limits;
    }

    @Override
    public double withdraw(double amount) {
        if (getBalance() -amount >= limits) {
            return super.withdraw(amount);
        }
        return getBalance();
    }

}
