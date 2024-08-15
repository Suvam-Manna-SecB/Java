/* Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. Now create a derived class OctNum which inherits Num and overrides shownum() which displays the octal value of the number. Demonstrate the working of the classes. */

class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

class OctNum extends Num {
    public OctNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Octal value: " + Integer.toOctalString(number));
    }
}

public class NumDemo2 {
    public static void main(String[] args) {
        Num num = new Num(100);

        System.out.println("Using Num class:");
        num.showNum();

        OctNum octNum = new OctNum(100);

        System.out.println("\nUsing OctNum class:");
        octNum.showNum();
    }
}
