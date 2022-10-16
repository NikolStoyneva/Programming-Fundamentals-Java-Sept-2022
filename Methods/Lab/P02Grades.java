package Methods.Lab;

import java.util.Scanner;

public class P02Grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printGrade(Double.parseDouble(scanner.nextLine()));

    }
    public static void printGrade (double grade) {
        String gradeWithWords = "";

        if (grade >= 2 && grade <= 2.99) {
             gradeWithWords = "Fail";
        } else if (grade <= 3.49) {
            gradeWithWords = "Poor";
        } else if (grade <= 4.49) {
            gradeWithWords = "Good";
        } else if (grade <= 5.49) {
            gradeWithWords = "Very good";
        } else if (grade >= 5.50) {
            gradeWithWords = "Excellent";
        }
        System.out.println(gradeWithWords);
    }
}
