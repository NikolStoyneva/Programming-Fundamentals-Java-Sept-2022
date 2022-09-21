package Basic.Syntax.Conditional.Statements.And.Loops.More.Exercises;

import java.util.Scanner;

public class P05Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String message = "";

        for (int i = 1; i <= n; i++) {
            int currentInput = Integer.parseInt(scanner.nextLine());

            if (currentInput == 2) {
                message += 'a';
            } else if (currentInput == 22) {
                message += "b";
            }  else if (currentInput == 222) {
                message += "c";
            }  else if (currentInput == 3) {
                message += "d";
            } else if (currentInput == 33) {
                message += "e";
            } else if (currentInput == 333) {
                message += "f";
            } else if (currentInput == 4) {
                message += "g";
            } else if (currentInput == 44) {
                message += "h";
            } else if (currentInput == 444) {
                message += "i";
            } else if (currentInput == 5) {
                message += "j";
            } else if (currentInput == 55) {
                message += "k";
            } else if (currentInput == 555) {
                message += "l";
            } else if (currentInput == 6) {
                message += "m";
            } else if (currentInput == 66) {
                message += "n";
            } else if (currentInput == 666) {
                message += "o";
            } else if (currentInput == 7) {
                message += "p";
            } else if (currentInput == 77) {
                message += "q";
            } else if (currentInput == 777) {
                message += "r";
            } else if (currentInput == 7777) {
                message += "s";
            } else if (currentInput == 8) {
                message += "t";
            } else if (currentInput == 88) {
                message += "u";
            } else if (currentInput == 888) {
                message += "v";
            } else if (currentInput == 9) {
                message += "w";
            } else if (currentInput == 99) {
                message += "x";
            } else if (currentInput == 999) {
                message += "y";
            } else if (currentInput == 9999) {
                message += "z";
            } else {
                message += " ";
            }
        }
        System.out.println(message);
    }
}
