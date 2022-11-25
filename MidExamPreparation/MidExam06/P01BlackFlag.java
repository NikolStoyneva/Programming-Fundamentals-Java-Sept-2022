package MidExam.ProgrammingFundamentals.MidExam06;

import java.util.Scanner;

public class P01BlackFlag {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int days = Integer.parseInt(scanner.nextLine());
         int dailyPlunder = Integer.parseInt(scanner.nextLine());
         double expectedPlunder = Double.parseDouble(scanner.nextLine());

         double gainedPlunder = 0;

        for (int i = 1; i <= days; i++) {
            gainedPlunder += dailyPlunder;

            if (i % 3 == 0) {
                gainedPlunder += dailyPlunder * 0.5;
            }

            if (i % 5 == 0) {
                gainedPlunder -= gainedPlunder * 0.3;
            }
        }


        if (gainedPlunder < expectedPlunder) {
            System.out.printf("Collected only %.2f%% of the plunder.", (gainedPlunder / expectedPlunder) * 100);
        } else {
            System.out.printf("Ahoy! %.2f plunder gained.", gainedPlunder);
        }
    }
}
