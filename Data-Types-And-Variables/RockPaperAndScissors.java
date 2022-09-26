import java.util.Random;
import java.util.Scanner;

public class RockPaperAndScissors {
    public static void main(String[] args) {

        Scanner scanner = new  Scanner (System.in);

        String rock = "Rock";
        String paper = "Paper";
        String scissors = "Scissors";

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playerMove = scanner.nextLine();

        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = "Rock";
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = "Paper";
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = "Scissors";
        } else {
            System.out.println("Invalid Input. Try again...");
            return;
        }

        int computerRandomNumber = (int) (Math.random() * 3);

        String computerMove = "";

        switch (computerRandomNumber) {
            case 0:
                computerMove = "Rock";
                break;
            case 1:
                computerMove = "Paper";
                break;
            case 2:
                computerMove = "Scissors";
                break;
        }

        System.out.println("The computer chose " + computerMove + ".");

        String result = "";

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            result = "You win.";
        } else if (playerMove.equals("Rock") && computerMove.equals("Paper") ||
            playerMove.equals("Paper") && computerMove.equals("Scissors") ||
        playerMove.equals("Scissors") && computerMove.equals("Rock")) {
            result = "You lose.";
        } else {
            result = "The game was a draw.";
        }

        System.out.println(result);
    }
}