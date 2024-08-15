/* Write a program to define a class ‘employee’ with data members as empid, name and salary. Accept data for 5 objects using Array of objects and print it. */

import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(empId, name, salary);
        }

        System.out.println("\nEmployee Details:");
        System.out.println("ID\tName\tSalary");
        for (Employee employee : employees) {
            System.out.println(employee.getEmpId() + "\t" + employee.getName() + "\t" + employee.getSalary());
        }
    }
}
