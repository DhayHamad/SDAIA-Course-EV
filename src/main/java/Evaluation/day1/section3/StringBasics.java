package day1.section3;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Omar";
        String phone = "056778899";
        String email ="ok@gmail.com";
        String massage ="Welcome to Java";


        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(massage.substring(0,7));

        System.out.println(massage.toLowerCase());
        System.out.println(massage.toUpperCase());

        System.out.println(email.endsWith(".com"));
        System.out.println(phone.startsWith("05"));
        System.out.println(email.contains("@"));

        char grade = 'A';
        System.out.println(Character.isUpperCase(grade));
        System.out.println(Character.isLetter(grade));
        System.out.println(Character.isDigit(grade));

    }
}
