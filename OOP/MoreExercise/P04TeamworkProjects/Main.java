package ObjectsAndClasses.MoreExercise.P04TeamworkProjects;

import java.util.*;

public class Main {


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         List<Team> teams = new ArrayList<>();
         
         int n = Integer.parseInt(scanner.nextLine());
         for (int i = 0; i < n; i++) {
            String[] registerInformation = scanner.nextLine().split("-");
            String creator = registerInformation[0];
            String teamName = registerInformation[1];

            boolean isValidTeam = true;
             for (int j = 0; j < teams.size(); j++) {
                 if (teams.get(j).getName().equals(teamName)) {
                     isValidTeam = false;
                     break;
                 }
             }

             boolean isValidCreator = true;
             for (int j = 0; j < teams.size(); j++) {
                 if (teams.get(j).getCreator().equals(creator)) {
                     isValidCreator = false;
                     break;
                 }
             }
             
             if (!isValidTeam) {
                 System.out.printf("Team %s was already created!%n", teamName);
             } else if (!isValidCreator) {
                 System.out.printf("%s cannot create another team!%n", creator);
             } else {
                 Creator currentCreator = new Creator(creator, teamName);
                 Team team = new Team(teamName, new ArrayList<>(), creator);
                 teams.add(0, team);
                 System.out.printf("Team %s has been created by %s!%n", teamName, creator);
             }

         }


        String command = scanner.nextLine();
        while (!command.equals("end of assignment")) {
            String[] joinInformation = command.split("->");
            String user = joinInformation[0];
            String teamName = joinInformation[1];

            boolean isValidTeam = false;
            for (int j = 0; j < teams.size(); j++) {
                if (teams.get(j).getName().equals(teamName)) {
                    isValidTeam = true;
                    break;
                }
            }

            boolean isValidMember = true;
            for (int i = 0; i < teams.size(); i++) {
                if (teams.get(i).getMembers().contains(user)) {
                    isValidMember = false;
                    break;
                }
            }

            if (!isValidTeam) {
                System.out.printf("Team %s does not exist!%n", teamName);
            } else if (!isValidMember) {
                System.out.printf("Member %s cannot join team %s!%n", user, teamName);
            } else {
                for (int i = 0; i < teams.size(); i++) {
                    if (teams.get(i).getName().equals(teamName)) {
                        teams.get(i).getMembers().add(user);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }

        teams.sort(Comparator.comparing(Team::getName));
        teams.sort(Comparator.comparing(Team::membersCount).reversed());

        for (Team currentTeam : teams) {
            currentTeam.getMembers().sort(String::compareTo);
            if (!currentTeam.getMembers().isEmpty()) {
                System.out.println(currentTeam.getName());
                System.out.printf("- %s%n", currentTeam.getCreator());
                currentTeam.getMembers().remove(currentTeam.getCreator());
                for (String member : currentTeam.getMembers()) {
                    System.out.printf("-- %s%n", member);
                }
            }
        }

        System.out.println("Teams to disband:");
        for (Team team : teams) {
            if (team.getMembers().isEmpty()) {
                System.out.println(team.getName());
            }
        }

    }
}
