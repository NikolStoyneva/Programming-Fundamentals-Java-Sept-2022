package ObjectsAndClasses.Lab;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {

    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String town;

        public Student (String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while (!command.equals("end")) {
            String[] student = command.split(" ");

            Student currentStudent = new Student(student[0], student[1], student[2], student[3]);
            boolean isExist = false;
            for (Student item : studentList) {
                if (currentStudent.getFirstName().equals(item.getFirstName()) && currentStudent.getLastName().equals(item.getLastName())) {
                    item.setAge(currentStudent.age);
                    item.setTown(currentStudent.town);
                    isExist = true;
                    break;
                }
            }

            if (!isExist) {
                studentList.add(currentStudent);
            }
            command = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student person : studentList) {
            if (person.getTown().equals(town)) {
                System.out.println(person.getFirstName() + " " + person.getLastName() + " is " + person.getAge() + " years old");
            }
        }

    }
}
