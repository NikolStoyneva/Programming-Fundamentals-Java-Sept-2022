package Data.Types.And.Variables.More.Exercise;

import java.util.Scanner;

public class P02FromLeftToTheRight {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String numberOne = "";
        String numberTwo = "";

        for (int i = 1; i <= n; i++) {
            String numbers = scanner.nextLine();
            int length = numbers.length();

            boolean numberOneIsReady = false;

            for (int m = 0; m < length; m++) {
                char digit = numbers.charAt(m);

                if (digit == ' ') {
                    numberOneIsReady = true;
                    continue;
                }

                if (!numberOneIsReady) {
                    numberOne += digit;
                } else {
                    numberTwo += digit;
                }
            }

            long n1 = Long.parseLong(numberOne);
            long n2 = Long.parseLong(numberTwo);

            if (n1 > n2) {
                long n11 = Math.abs(n1);
                int currentLength1 = numberOne.length();
                int sumN1 = 0;

                for (int j = 0; j <= currentLength1; j++) {
                    sumN1 += n11 % 10;
                    n11 /= 10;
                }

                System.out.println(sumN1);
            } else {
                long n22 = Math.abs(n2);
                int currentLength2 = numberTwo.length();
                int sumN2 = 0;

                for (int j = 1; j <= currentLength2; j++) {
                    sumN2 += n22 % 10;

                    n22 /= 10;
                }

                System.out.println(sumN2);
            }


            numberOne = "";
            numberTwo = "";
        }


    }
}
