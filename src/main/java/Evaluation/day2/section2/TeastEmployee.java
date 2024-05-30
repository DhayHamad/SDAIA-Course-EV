package Evaluation.day2.section2;

public class TeastEmployee {
    public static void main(String[] args) {

        Employee x = new Employee("Ahmad",11.1,1990);
        Employee y = new Employee("Wael",12,2001);


        System.out.println(x.name);
        System.out.println(x.caleEMP());
        System.out.println(x.getHear());
        System.out.println("-----------------");
        System.out.println(y.name);
        System.out.println(y.caleEMP());
        System.out.println(y.getHear());

    }
}
