package MidExam.ProgrammingFundamentals.MidExam06;

import java.util.Scanner;

public class P02TreasureHunt {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] treasureChest = scanner.nextLine().split("\\|");

         String command = scanner.nextLine();

         while (!command.equals("Yohoho!")) {
             String[] commandElements = command.split(" ");

             if (commandElements[0].equals("Loot")) {

                 for (int i = 1; i < commandElements.length; i++) {
                     boolean isExist = false;
                     for (int j = 0; j < treasureChest.length; j++) {
                         if (commandElements[i].equals(treasureChest[j])) {
                             isExist= true;
                             break;
                         }
                     }

                     if (!isExist) {
                         String[] newArr = new String[treasureChest.length + 1];
                         newArr[0] = commandElements[i];

                         for (int j = 1; j < newArr.length; j++) {
                             newArr[j] = treasureChest[j -1];
                         }

                         treasureChest = newArr;
                     }
                 }

             } else if (commandElements[0].equals("Drop")) {
                 int index = Integer.parseInt(commandElements[1]);

                 if (index >= 0 && index < treasureChest.length) {
                     String[] newArr = new String[treasureChest.length];
                     String valueIndex = treasureChest[index];

                     for (int i = 0; i < treasureChest.length - 1; i++) {
                         if (i < index) {
                             newArr[i] = treasureChest[i];
                         } else {
                             newArr[i] = treasureChest[i + 1];
                         }
                     }
                     newArr[newArr.length - 1] = valueIndex;

                     treasureChest = newArr;
                 }


             } else if (commandElements[0].equals("Steal")) {
                 int count = Integer.parseInt(commandElements[1]);

                 if (count <= treasureChest.length) {
                     String[] newArr = new String[treasureChest.length - count];

                     for (int i = 0; i < treasureChest.length - 1; i++) {
                         if (i < newArr.length) {
                             newArr[i] = treasureChest[i];
                         } else {
                             System.out.print(treasureChest[i] + ", ");
                         }
                     }
                     System.out.println(treasureChest[treasureChest.length - 1]);
                     treasureChest = newArr;
                 } else {
                     for (int i = 0; i < treasureChest.length - 1; i++) {
                         System.out.print(treasureChest[i] + ", ");
                     }
                     System.out.println(treasureChest[treasureChest.length - 1]);
                     treasureChest = new String[0];
                 }
             }
             command = scanner.nextLine();
         }

         double averageGain = 0;

        for (int i = 0; i < treasureChest.length; i++) {
            averageGain += treasureChest[i].length();
        }
        averageGain /= treasureChest.length;

        if (treasureChest.length > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
