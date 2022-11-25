package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String hometown;

        public Student (String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getHometown () {
            return hometown;
        }
        public String getFirstName () {
            return firstName;
        }
        public String getLastName () {
            return lastName;
        }
        public String getAge () {
            return age;
        }

    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

         List<Student> studentsList = new ArrayList<>();

         while (!command.equals("end")) {
             String[] studentsArr = command.split(" ");

             Student currentStudent = new Student(studentsArr[0], studentsArr[1], studentsArr[2], studentsArr[3]);

             studentsList.add(currentStudent);

             command = scanner.nextLine();
         }

         String town = scanner.nextLine();

         for (Student person : studentsList) {
             if (person.getHometown().equals(town)) {
                 System.out.println(person.getFirstName() + " " + person.getLastName() + " is " + person.getAge() + " years old");
             }
         }
    }
}
