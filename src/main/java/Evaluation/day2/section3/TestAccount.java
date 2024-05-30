package Evaluation.day2.section3;

public class TestAccount {
    public static void main(String[] args) {
        var s1 = new Account("Ahmad",1200.22,0.04);
        var s2 = new Account("Wael",2100.72,0.04);

        System.out.println("Initial balance "+s1.getBalance());
        System.out.println("Balance after deposit "+s1.getBalance());
        System.out.println("Balance after withdraw "+s1.getBalance());
        System.out.println("Monthly interest "+s1.getBalance());

        System.out.println("------------------");
        System.out.println("Initial balance "+s2.getBalance());
        System.out.println("Balance after deposit "+s2.getBalance());
        System.out.println("Balance after withdraw "+s2.getBalance());
        System.out.println("Monthly interest "+s2.getBalance());
    }
}
