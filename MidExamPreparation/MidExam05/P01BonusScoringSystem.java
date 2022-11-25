package MidExam.ProgrammingFundamentals.MidExam05;

import java.util.Scanner;

public class P01BonusScoringSystem {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double students = Double.parseDouble(scanner.nextLine());
         double lectures = Double.parseDouble(scanner.nextLine());
         int additionalBonus = Integer.parseInt(scanner.nextLine());

         double maxBonus = 0;
         double attendancesBestStudent = 0;

        for (int i = 1; i <= students; i++) {
            int attendanceCurrentStudent = Integer.parseInt(scanner.nextLine());

            double currentBonus = (attendanceCurrentStudent / lectures) * (5 + additionalBonus);

            if (currentBonus > maxBonus) {
                maxBonus = currentBonus;
                attendancesBestStudent = attendanceCurrentStudent;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %.0f lectures.", attendancesBestStudent);
    }
}
