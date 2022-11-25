package FinalExam.ProgrammingFundamentals.FinalExam04;

import java.util.*;

public class P03HeroesOfCodeAndLogicVII {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Integer>> heroesMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] heroInformationArr = scanner.nextLine().split(" ");
            String hero = heroInformationArr[0];
            int hitPoints = Integer.parseInt(heroInformationArr[1]);
            int manaPoints = Integer.parseInt(heroInformationArr[2]);

            if (hitPoints <= 100 && manaPoints <= 200) {
                heroesMap.putIfAbsent(hero, new ArrayList<>());
                heroesMap.get(hero).add(0, hitPoints);
                heroesMap.get(hero).add(1, manaPoints);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandArr = command.split(" - ");

            if (command.contains("CastSpell")) {
                String hero = commandArr[1];
                int mpNeeded = Integer.parseInt(commandArr[2]);
                String spellName = commandArr[3];

                if (heroesMap.get(hero).get(1) >= mpNeeded) {
                    int updatedMp = heroesMap.get(hero).get(1) - mpNeeded;
                    heroesMap.get(hero).set(1, updatedMp);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, spellName, updatedMp);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", hero, spellName);
                }

            } else if (command.contains("TakeDamage")) {
                String hero = commandArr[1];
                int damage = Integer.parseInt(commandArr[2]);
                String attacker = commandArr[3];
                int currentHp = heroesMap.get(hero).get(0) - damage;
                if (currentHp > 0) {
                    heroesMap.get(hero).set(0, currentHp);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", hero, damage, attacker, currentHp);
                } else {
                    System.out.printf("%s has been killed by %s!%n", hero, attacker);
                    heroesMap.remove(hero);
                }

            } else if (command.contains("Recharge")) {

                String hero = commandArr[1];
                int amount = Integer.parseInt(commandArr[2]);
                int currentMp = heroesMap.get(hero).get(1);
                int rechargedMp = currentMp + amount;

                if (rechargedMp > 200) {
                    rechargedMp = 200;
                }

                heroesMap.get(hero).set(1, rechargedMp);
                System.out.printf("%s recharged for %d MP!%n", hero, rechargedMp - currentMp);

            } else if (command.contains("Heal")) {
                String hero = commandArr[1];
                int amount = Integer.parseInt(commandArr[2]);
                int currentHp = heroesMap.get(hero).get(0);
                int rechargedHp = currentHp + amount;

                if (rechargedHp > 100) {
                    rechargedHp = 100;
                }

                heroesMap.get(hero).set(0, rechargedHp);
                System.out.printf("%s healed for %d HP!%n", hero, rechargedHp - currentHp);
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : heroesMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            System.out.printf("  HP: %d%n", entry.getValue().get(0));
            System.out.printf("  MP: %d%n", entry.getValue().get(1));
        }

    }
}
