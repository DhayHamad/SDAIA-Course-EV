package Evaluation.day3.section1;

public class Accounts {
    String name;
    private double balance;
     static double annanualRate =0.04;


    public Accounts(String name, double balance, double annanualRate){
        this.annanualRate=annanualRate;
        this.balance=balance;
        this.name=name;
    }


    public static double getMonthyRate(){
        return annanualRate /12;
    }


    public double getMonthyInt(){
        return balance * getMonthyRate();
    }

    public double dePosit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }

    public double getBalance(){
        return balance;
    }
}
