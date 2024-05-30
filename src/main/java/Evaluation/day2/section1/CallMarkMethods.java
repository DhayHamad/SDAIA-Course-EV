package Evaluation.day2.section1;

import java.util.Scanner;

import static Evaluation.day2.section1.MaxMethos.getGtade;

public class CallMarkMethods {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Enter a mark: ");

        double mark = sc.nextDouble();
        String grade = getGtade(mark);

        System.out.println("Your mark: "+ grade);
    }
}
