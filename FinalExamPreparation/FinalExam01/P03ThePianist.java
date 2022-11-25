package FinalExam.ProgrammingFundamentals.FinalExam01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, String>> collectionMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] favouritePiecesArr = scanner.nextLine().split("\\|");
            String piece = favouritePiecesArr[0];
            String composer = favouritePiecesArr[1];
            String key = favouritePiecesArr[2];

            collectionMap.putIfAbsent(piece, new LinkedHashMap<>());
            collectionMap.get(piece).put(key, composer);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandArr = command.split("\\|");

            if (command.contains("Add")) {
                String pieceToAdd = commandArr[1];
                String composer = commandArr[2];
                String key = commandArr[3];

                if (collectionMap.containsKey(pieceToAdd)) {
                    System.out.printf("%s is already in the collection!%n", pieceToAdd);
                } else {
                    collectionMap.putIfAbsent(pieceToAdd, new LinkedHashMap<>());
                    collectionMap.get(pieceToAdd).put(key, composer);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieceToAdd, composer, key);
                }

            } else if (command.contains("Remove")) {
                String pieceToRemove = commandArr[1];

                if (collectionMap.containsKey(pieceToRemove)) {
                    collectionMap.remove(pieceToRemove);
                    System.out.printf("Successfully removed %s!%n", pieceToRemove);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                }

            } else if (command.contains("ChangeKey")) {
                String piece = commandArr[1];
                String newKey = commandArr[2];

                if (collectionMap.containsKey(piece)) {
                    for (Map.Entry<String, LinkedHashMap<String, String>> entry : collectionMap.entrySet()) {
                        if (entry.getKey().equals(piece)) {
                            for (Map.Entry<String, String> stringEntry : entry.getValue().entrySet()) {
                                String composer = stringEntry.getValue();
                                collectionMap.get(piece).remove(stringEntry.getKey());
                                collectionMap.get(piece).put(newKey, composer);
                                break;
                            }
                        }
                    }

                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, String>> entry : collectionMap.entrySet()) {
            for (Map.Entry<String, String> stringEntry : entry.getValue().entrySet()) {
                System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), stringEntry.getValue(), stringEntry.getKey());
            }

        }

    }
}
