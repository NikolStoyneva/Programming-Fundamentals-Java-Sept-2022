package MidExam.ProgrammingFundamentals.MidExam02;

import java.util.Scanner;

public class P01SoftUniReception {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int firstEmployeeCapacity = Integer.parseInt(scanner.nextLine());
         int secondEmployeeCapacity = Integer.parseInt(scanner.nextLine());
         int thirdEmployeeCapacity = Integer.parseInt(scanner.nextLine());

         int students = Integer.parseInt(scanner.nextLine());

         int allEmployeesForHour = firstEmployeeCapacity + secondEmployeeCapacity + thirdEmployeeCapacity;

         int hoursNeeded = 0;

         while (students > 0) {
             hoursNeeded++;

             if (hoursNeeded % 4 == 0 && hoursNeeded != 0) {

             } else {
                 students -= allEmployeesForHour;
             }
         }

        System.out.printf("Time needed: %dh.", hoursNeeded);
    }
}
