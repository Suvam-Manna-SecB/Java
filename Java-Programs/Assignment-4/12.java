/* Combine Question number 10 and 11 and have all the three classes together. Now describe the working of all classes. */

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

class OctNum extends Num {
    public OctNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Octal value: " + Integer.toOctalString(number));
    }
}

public class NumDemo3 {
    public static void main(String[] args) {
        Num num = new Num(100);

        System.out.println("Using Num class:");
        num.showNum();

        HexNum hexNum = new HexNum(100);

        System.out.println("\nUsing HexNum class:");
        hexNum.showNum();

        OctNum octNum = new OctNum(100);

        System.out.println("\nUsing OctNum class:");
        octNum.showNum();
    }
}
