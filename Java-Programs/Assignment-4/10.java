/* Write a Java program which creates a base class Num and contains an integer number along with a method shownum() which displays the number. Now create a derived class HexNum which inherits Num and overrides shownum() which displays the hexadecimal value of the number. Demonstrate the working of the classes. */

class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Hexadecimal value: " + Integer.toHexString(number));
    }
}

public class NumDemo {
    public static void main(String[] args) {
        Num num = new Num(100);

        System.out.println("Using Num class:");
        num.showNum();

        HexNum hexNum = new HexNum(100);

        System.out.println("\nUsing HexNum class:");
        hexNum.showNum();
    }
}
