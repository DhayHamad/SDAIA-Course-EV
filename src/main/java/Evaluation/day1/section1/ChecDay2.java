package day1.section1;

import java.util.Scanner;

public class ChecDay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day number: ");
        int day = sc.nextInt();

        if (day == 7 || day >=1  && day <= 4){
            System.out.println("Work-day");

        } else if (day == 5 || day == 6) {
            System.out.println("off-day");

        }
        else {
            System.out.println("Invalid");
        }
    }
}
