package day1.section1;

import java.util.Scanner;

public class ChecEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        System.out.println(x % 2 ==0 ? "Even" : "Odd");
    }
}
