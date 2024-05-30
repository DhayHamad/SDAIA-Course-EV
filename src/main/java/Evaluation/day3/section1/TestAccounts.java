package Evaluation.day3.section1;

public class TestAccounts {

    public static void main(String[] args) {
        Accounts a1 = new Accounts("Wael", 1200.72,0.04);
        Accounts a2 = new Accounts("Ali", 2560.054,0.04);

        System.out.println(a1.name);
        System.out.println(a1.getBalance());
        System.out.println(a1.getMonthyInt());
        System.out.println("-------------------");

        System.out.println(a2.name);
        System.out.println(a2.getBalance());
        System.out.println(a2.getMonthyInt());
        System.out.println("-------------------");


        var s1 = new SavingAccount("Hamad",7600.52,0.04,700);
        var c1 = new CheckingAccount("Fahad",9000.0,0.04);

        System.out.println(s1.name);
        System.out.println(s1.getBalance());
        s1.withdraw(555);
        System.out.println(s1.getBalance());
        System.out.println("-------------------");

        System.out.println(c1.name);
        System.out.println(c1.getBalance());
        s1.withdraw(555);
        System.out.println(c1.getBalance());
        System.out.println("-------------------");

    }
}
