package Methods.MoreExercise;

import java.util.Scanner;

public class P01DataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();

        switch (dataType) {
            case "int":
                int integerNumber = Integer.parseInt(scanner.nextLine());
                System.out.println(getResult(integerNumber));
                break;
            case "real":
                double floatingPointNumber = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f", getResult(floatingPointNumber));
                break;
            case "string":
                String input = scanner.nextLine();
                System.out.println(getResult(input));
                break;
        }
    }
    public static int getResult (int n) {
        return n * 2;
    }
    public static double getResult (double n) {
        return n * 1.5;
    }
    public static String getResult (String input) {
        return "$" + input + "$";
    }
}
