// Program to implement the MultipleInheritance (Exam Interface, Student & Result classes)

interface Exam {
    void displayMarks();
}
class Student {
    private String name;
    private int rollNumber;
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}
class Result implements Exam {
    private Student student;
    private int marks;
    public Result(String name, int rollNumber, int marks) {
        this.student = new Student(name, rollNumber);
        this.marks = marks;
    }
    public void displayMarks() {
        student.display();
        System.out.println("Marks: " + marks);
    }
}
public class MultipleInheritanceDemo3 {
    public static void main(String[] args) {
        Result result = new Result("John Doe", 123, 85);
        result.displayMarks();
    }
}
