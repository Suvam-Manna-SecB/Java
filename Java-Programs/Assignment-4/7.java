/* An educational institution maintains a database of its employees. The database is divided into a number of classes whose hierarchical relationships are shown below. Write all the classes and define the methods to create the database and retrieve individual information as and when needed.
Write a driver program to test the classes.
Staff (code, name)                                      Teacher (subject, publication) is a Staff
Officer (grade) is a Staff                             Typist (speed) is a Staff
RegularTypist (renumeration) is a Typist    CasualTypist (daily wages) is a Typist.
*/

import java.util.ArrayList;

class Staff {
    protected String code;
    protected String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    public Teacher(String code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    public Officer(String code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    private int speed;

    public Typist(String code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Speed: " + speed);
    }
}

class RegularTypist extends Typist {
    private int renumeration;

    public RegularTypist(String code, String name, int speed, int renumeration) {
        super(code, name, speed);
        this.renumeration = renumeration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Renumeration: " + renumeration);
    }
}

class CasualTypist extends Typist {
    private int dailyWages;

    public CasualTypist(String code, String name, int speed, int dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

public class InstitutionDatabase {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("T001", "John Doe", "Math", "Advanced Algebra");
        Officer officer = new Officer("O001", "Jane Smith", "Grade A");
        RegularTypist regularTypist = new RegularTypist("RT001", "Alice", 60, 5000);
        CasualTypist casualTypist = new CasualTypist("CT001", "Bob", 50, 100);

        System.out.println("Teacher Information:");
        teacher.displayInfo();
        System.out.println();

        System.out.println("Officer Information:");
        officer.displayInfo();
        System.out.println();

        System.out.println("Regular Typist Information:");
        regularTypist.displayInfo();
        System.out.println();

        System.out.println("Casual Typist Information:");
        casualTypist.displayInfo();
        System.out.println();
    }
}
