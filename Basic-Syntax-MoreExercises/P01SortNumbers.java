package Basic.Syntax.Conditional.Statements.And.Loops.More.Exercises;

import java.util.Scanner;

public class P01SortNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        boolean n3IsBiggest = false;
        boolean n3IsSmaller = false;

        int biggest = Math.max(n1, n2);
        int middle = 0;
        int smaller = Math.min(n1, n2);

        if (n3 > biggest) {
            biggest = n3;
            n3IsBiggest = true;
        } else if (n3 < smaller) {
            smaller = n3;
            n3IsSmaller = true;
        }

        if (n3IsBiggest) {
            middle = Math.max(n1, n2);
        } else if (n3IsSmaller) {
            middle = Math.min (n1, n2);
        } else {
            middle = n3;
        }

        System.out.println(biggest);
        System.out.println(middle);
        System.out.println(smaller);
    }
}
