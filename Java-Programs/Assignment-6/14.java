/* Write a program to implement the Multiple Inheritance (Gross Interface, Employee & Salary classes). */

interface Gross {
    double calculateGross();
}
class Employee {
    private String name;
    private String id;
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
class Salary implements Gross {
    private Employee employee;
    private double basicSalary;
    private double allowances;
    public Salary(String name, String id, double basicSalary, double allowances) {
        this.employee = new Employee(name, id);
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }
    public double calculateGross() {
        return basicSalary + allowances;
    }
    public void display() {
        employee.display();
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + calculateGross());
    }
}
public class MultipleInheritanceDemo2 {
    public static void main(String[] args) {
        Salary salary = new Salary("John Doe", "E123", 50000, 10000);
        salary.display();
    }
}
