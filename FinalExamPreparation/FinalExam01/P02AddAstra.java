package FinalExam.ProgrammingFundamentals.FinalExam01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AddAstra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([|#])(?<item>[A-Za-z\\s]+)\\1(?<expirationDate>\\d{2}[\\/]{1}\\d{2}[\\.|\\/]{1}\\d{2})\\1(?<calories>\\d{1,5})\\1");
        Matcher matcher = pattern.matcher(input);

        int totalCalories = 0;
        List<Food> foodList = new ArrayList<>();

        while (matcher.find()) {
            String item = matcher.group("item");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
            Food food = new Food(item, expirationDate, calories);
            foodList.add(food);
        }

        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

        for (int i = 0; i < foodList.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", foodList.get(i).getItem(),
                    foodList.get(i).getExpirationDate(), foodList.get(i).getCalories());
        }
    }

    static class Food {
        private String item;
        private String expirationDate;
        private int calories;

        public Food (String item, String expirationDate, int calories) {
            this.item = item;
            this.expirationDate = expirationDate;
            this.calories = calories;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        public String getItem() {
            return item;
        }

        public int getCalories() {
            return calories;
        }
    }
}

