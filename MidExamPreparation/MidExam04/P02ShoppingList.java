package MidExam.ProgrammingFundamentals.MidExam04;

import java.util.Scanner;

public class P02ShoppingList {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String[] initialProducts = scanner.nextLine().split("!");

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] commandElements = command.split(" ");

            if (commandElements[0].equals("Urgent")) {
                String item = commandElements[1];

                if (!ifProductExist(initialProducts, item)) {
                    String[] newArr = new String[initialProducts.length + 1];
                    newArr[0] = item;

                    for (int i = 0; i < initialProducts.length; i++) {
                        newArr[i + 1] = initialProducts[i];
                    }

                    initialProducts = newArr;

                }
            } else if (commandElements[0].equals("Unnecessary")) {
                String item = commandElements[1];
                if (ifProductExist(initialProducts,item)) {
                    int indexItem = 0;

                    for (int i = 0; i < initialProducts.length; i++) {
                        if (initialProducts[i].equals(item)) {
                            indexItem = i;
                            break;
                        }
                    }

                    String[] newArr = new String[initialProducts.length - 1];

                    for (int i = 0; i < initialProducts.length; i++) {
                        if (i < indexItem) {
                            newArr[i] = initialProducts[i];
                        } else if (i > indexItem) {
                            newArr[i - 1] = initialProducts[i];
                        }
                    }
                    initialProducts = newArr;
                }
            } else if (commandElements[0].equals("Correct")) {
                String oldItem = commandElements[1];
                String newItem = commandElements[2];

                if (ifProductExist(initialProducts, oldItem)) {
                    for (int i = 0; i < initialProducts.length; i++) {
                        if (initialProducts[i].equals(oldItem)) {
                            initialProducts[i] = newItem;
                            break;
                        }
                    }
                }

            } else if (commandElements[0].equals("Rearrange")) {
                String item = commandElements[1];


                if (ifProductExist(initialProducts, item)) {
                    int indexItem = 0;

                    for (int i = 0; i < initialProducts.length; i++) {
                        if (initialProducts[i].equals(item)) {
                            indexItem = i;
                            break;
                        }
                    }

                    String[] newArr = new String[initialProducts.length];

                    for (int i = 0; i < initialProducts.length; i++) {
                        if (i < indexItem) {
                            newArr[i] = initialProducts[i];
                        } else if (i > indexItem) {
                            newArr[i - 1] = initialProducts[i];
                        }
                    }
                    newArr[newArr.length - 1] = item;

                    initialProducts = newArr;
                }
            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", initialProducts));
    }
    public static boolean ifProductExist (String[] products, String item) {
        boolean isExist = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(item)) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }
}
