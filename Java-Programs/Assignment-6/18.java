// Java program to perform Payroll using Interface (Multiple Inheritance).

interface Payroll {
    double calculatePay();
}
class Employee implements Payroll {
    private String name;
    private double hourlyRate;
    private int hoursWorked;
    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
class Contractor implements Payroll {
    private String name;
    private double hourlyRate;
    private int hoursWorked;
    public Contractor(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
public class PayrollDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 20.0, 40);
        Contractor contractor = new Contractor("Jane Smith", 25.0, 30);
        System.out.println("Pay for Employee " + employee.calculatePay());
        System.out.println("Pay for Contractor " + contractor.calculatePay());
    }
}
