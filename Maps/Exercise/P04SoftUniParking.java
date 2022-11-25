package AssociativeArrays.Exercise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> registeredPeopleMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] registerInformation = scanner.nextLine().split(" ");

            if (registerInformation[0].equals("register")) {
                if (registeredPeopleMap.containsKey(registerInformation[1])) {
                    System.out.printf("ERROR: already registered with plate number %s%n", registeredPeopleMap.get(registerInformation[1]));
                } else {
                    registeredPeopleMap.put(registerInformation[1], registerInformation[2]);
                    System.out.printf("%s registered %s successfully%n", registerInformation[1], registerInformation[2]);
                }
            } else {
                if (registeredPeopleMap.containsKey(registerInformation[1])) {
                    registeredPeopleMap.remove(registerInformation[1]);
                    System.out.printf("%s unregistered successfully%n", registerInformation[1]);
                } else {
                    System.out.printf("ERROR: user %s not found%n", registerInformation[1]);
                }
            }
        }

        for (Map.Entry<String, String> entry : registeredPeopleMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
