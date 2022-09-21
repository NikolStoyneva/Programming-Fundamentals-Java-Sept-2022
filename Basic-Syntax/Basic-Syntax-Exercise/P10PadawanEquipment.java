package Basic.Syntax.Conditional.Statements.And.Loops.Exercise;

import java.util.Scanner;

public class P10PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightSabersTotal = Math.ceil(students * 1.1) * lightSaberPrice;
        double beltsTotal = beltPrice * (students - Math.floor(students * 1.0/ 6));
        double robesTotal = students * robePrice;

        double total = lightSabersTotal + beltsTotal + robesTotal;

        if (budget >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - budget);
        }

    }
}
