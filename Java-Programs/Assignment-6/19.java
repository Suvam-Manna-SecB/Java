// Implement the following diagram.

public interface Exam {
  public double getPercent_cal();
}
public class Student {
  private String name;
  private String roll_no;
  public Student(String name, String roll_no) {
    this.name = name;
    this.roll_no = roll_no;
  }
  public String getName() {
    return name;
  }
  public String getRoll_no() {
    return roll_no;
  }
  public void takeExam() {
  }
}
public class Result implements Exam {
  private Student student;
  private double marks1;
  private double marks2;
  public Result(Student student, double marks1, double marks2) {
    this.student = student;
    this.marks1 = marks1;
    this.marks2 = marks2;
  }
  public Student getStudent() {
    return student;
  }
  public double getMarks1() {
    return marks1;
  }
  public double getMarks2() {
    return marks2;
  }
  @Override
  public double getPercent_cal() {
    return (marks1 + marks2) / 2;
  }
}

