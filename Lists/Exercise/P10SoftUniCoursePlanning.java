package Lists.Exercise;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P10SoftUniCoursePlanning {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        List<String> lessons = new java.util.ArrayList<>(List.of(scanner.nextLine().split(", ")));

        String command = scanner.nextLine();
        
        while (!command.equals("course start")) {
            String[] commandElements = command.split(":");
            
            if (commandElements[0].equals("Add")) {
                String lessonToAdd = commandElements[1];

                if (!lessons.contains(lessonToAdd)) {
                    lessons.add(lessonToAdd);
                }

            } else if (commandElements[0].equals("Insert")) {
                String lessonToInsert = commandElements[1];
                int index = Integer.parseInt(commandElements[2]);

                if (!lessons.contains(lessonToInsert)) {
                    lessons.add(index, lessonToInsert);
                }

            } else if (commandElements[0].equals("Remove")) {
                String lessonToRemove = commandElements[1];

                if (lessons.contains(lessonToRemove)) {
                    lessons.remove(lessonToRemove);
                }

            } else if (commandElements[0].equals("Exercise")) {
                String lessonTitle = commandElements[1];

                if (lessons.contains(lessonTitle)) {
                    if (!lessons.contains(lessonTitle + "-Exercise")) {
                        for (int i = 0; i < lessons.size(); i++) {
                            if (lessons.get(i).equals(lessonTitle)) {
                                lessons.add(i + 1, lessonTitle + "-Exercise");
                                break;
                            }
                        }
                    }
                } else {
                    lessons.add(lessonTitle);
                    lessons.add(lessonTitle + "-Exercise");
                }

            } else if (commandElements[0].equals("Swap")) {
                String first = commandElements[1];
                String second = commandElements[2];

                int indexFirst = 0;
                int indexSecond = 0;

                if (lessons.contains(first) && lessons.contains(second)) {

                    for (int i = 0; i < lessons.size(); i++) {

                        if (lessons.get(i).equals(first)) {
                            indexFirst = i;
                            lessons.remove(i);
                            lessons.add(i, second);
                        } else if (lessons.get(i).equals(second)) {
                            indexSecond = i;
                            lessons.remove(i);
                            lessons.add(i, first);
                        }
                    }

                    if (lessons.contains(first + "-Exercise")) {
                        lessons.remove(indexFirst + 1);
                        lessons.add(indexSecond + 1, first + "-Exercise");
                    }

                    if (lessons.contains(second + "-Exercise")) {
                        lessons.remove(indexSecond + 1);
                        lessons.add(indexFirst + 1, second + "-Exercise");
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < lessons.size(); i++) {
            System.out.println(i + 1 + "." + lessons.get(i));
        }
    }
}
