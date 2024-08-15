/* Write a program to define a class Student with four data members such as name, roll no., sub1 and sub2. Define appropriate methods to initialize and display the values of data members. Also, calculate total marks and percentage scored by the student. */

class Student {
    private String name;
    private int rollNo;
    private int sub1;
    private int sub2;

    public Student(String name, int rollNo, int sub1, int sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }

    public int calculateTotalMarks() {
        return sub1 + sub2;
    }

    public double calculatePercentage() {
        int totalMarks = calculateTotalMarks();
        return (double) totalMarks / 2; // Assuming each subject carries equal weightage
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("John", 101, 85, 90);
        student.displayDetails();
        int totalMarks = student.calculateTotalMarks();
        System.out.println("Total Marks: " + totalMarks);
        double percentage = student.calculatePercentage();
        System.out.println("Percentage Scored: " + percentage + "%");
    }
}
