package ObjectsAndClasses.MoreExercise.P01CompanyRoster;

import java.util.*;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] employeeData = scanner.nextLine().split(" ");

            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String department = employeeData[3];
            String email = "";
            int age = 0;

            if (employeeData.length == 4) {
                email = "n/a";
                age = -1;
            } else if (employeeData.length == 5) {
               if (!employeeData[employeeData.length - 1].contains("@")) {
                   email = "n/a";
                   age = Integer.parseInt(employeeData[4]);
               } else {
                   age = -1;
                   email = employeeData[4];
               }
            } else {
                email = employeeData[4];
                age = Integer.parseInt(employeeData[5]);
            }

            Employee employee = new Employee(name, salary, position, department, email, age);
            Department department1 = new Department(department);

            if (!departmentList.contains(department1)) {
                departmentList.add(department1);
            }

            employeeList.add(employee);
        }

        double maxSalary = 0;
        String bestDepartment = "";

        for (int i = 0; i < departmentList.size(); i++) {
            double currentSalary = 0;
            String department = departmentList.get(i).getDepartment();
            int counter = 0;
            for (int j = 0; j < employeeList.size(); j++) {
              if (employeeList.get(j).getDepartment().equals(department)) {
                  currentSalary += employeeList.get(j).getSalary();
                  counter++;
              }
            }
            currentSalary /= counter;
            if (currentSalary > maxSalary) {
                maxSalary = currentSalary;
                bestDepartment = department;
            }
        }


        System.out.printf("Highest Average Salary: %s%n", bestDepartment);

        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());

        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals(bestDepartment)) {
                System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
            }
        }
    }
}
