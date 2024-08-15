/* Write a program to define a class Employee to accept emp_id, enmp_name, basic_salary from the user and display gross_salary. */

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double basicSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public double calculateGrossSalary() {
        // Assuming 20% of basic salary is added as allowances
        double allowances = 0.2 * basicSalary;
        double grossSalary = basicSalary + allowances;
        return grossSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, basicSalary);

        System.out.println("\nEmployee Details:");
        employee.displayDetails();
    }
}
