package day1.section2;

import java.util.Scanner;

public class QuizV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x =(int)(Math.random() * 10);
        int y =(int)(Math.random() * 10);
        System.out.printf("What is %d * %d ? ", x, y);
        int answer = sc.nextInt();

        while (answer !=x * y){
            System.out.printf("Try again ");
            System.out.printf("What is %d * %d ? ", x, y);
            answer = sc.nextInt();
        }
        System.out.println("Correct!!");

    }
}
