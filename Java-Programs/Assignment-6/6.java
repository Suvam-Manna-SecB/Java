/* Create an interface Department containing attributes deptName and deptHead. It also has abstract methods for printing the attributes. Create a class hostel containing hostelName, hostelLocation and numberOfRooms. The class contains methods for getting and printing the attributes. Then write Student class extending the Hostel class and implementing the Department Interface. This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and printData methods for this class. Also implement the abstract methods of the Department interface. Write a driver class to test the Student class. The program should be menu driven containing the options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option a search is to be made on the basics of the entered registration number.
*/

import java.util.*;
interface Department {
    void printDeptDetails();
}
class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberOfRooms;
    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }
    public void printHostelDetails() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}
class Student extends Hostel implements Department {
    private String studentName;
    private String regdNo;
    private String electiveSubject;
    private double avgMarks;
    public Student(String hostelName, String hostelLocation, int numberOfRooms,
                   String studentName, String regdNo, String electiveSubject, double avgMarks) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();
        System.out.print("Enter Registration Number: ");
        regdNo = scanner.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = scanner.nextLine();
        System.out.print("Enter Average Marks: ");
        avgMarks = scanner.nextDouble();
    }
    public void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }
    public void printDeptDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
    private String deptName;
    private String deptHead;
    public void setDeptData(String deptName, String deptHead) {
        this.deptName = deptName;
        this.deptHead = deptHead;
    }
}
public class HostelDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details of a student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter student details:");
                    Student student = new Student("", "", 0, "", "", "", 0.0);
                    student.getData();
                    students.add(student);
                    break;
                case 2:
                    // Migrate a student
                    break;
                case 3:
                    System.out.print("\nEnter registration number to search: ");
                    String regNo = scanner.next();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.regdNo.equals(regNo)) {
                            s.printData();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with registration number " + regNo + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
