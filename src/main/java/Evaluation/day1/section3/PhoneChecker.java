package day1.section3;

import java.util.Scanner;

public class PhoneChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a phone number: ");
        String phone = sc.nextLine();

        if (phone.length() <= 10 && phone.startsWith("05")){
            int digitCount = 0;
            for (int i = 0; i < phone.length(); i++) {
                if (Character.isDigit(phone.charAt(i))) {
                    digitCount++;
                }
            }
            System.out.println("The phone number is valid and has " + digitCount + "digit");
        } else {
            System.out.println("The phone number is not valid.");

        }
    }
}
