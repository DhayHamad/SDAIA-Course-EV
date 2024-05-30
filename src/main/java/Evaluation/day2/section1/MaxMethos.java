package Evaluation.day2.section1;

public class MaxMethos {
    public static double calcMARK(double marks, int fullMark){
        return (marks /fullMark) * 100;
    }

    public static String getGtade(double marks){
        if (marks >85) return "Excellent";
        else if (marks >75) return "V.Good";
        else if (marks >65) return "Good";
        else if (marks >= 50) return "Pass";
        else return "Fail";
    }
}
