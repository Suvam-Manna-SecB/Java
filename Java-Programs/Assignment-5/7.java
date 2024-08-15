/* Write a program to define a class Fraction having data members numerator and denominator. Initialize three objects using different constructors and display its fractional value. */

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public void displayFraction() {
        System.out.println(numerator + "/" + denominator);
    }
}

public class FractionDemo {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(5);
        Fraction fraction3 = new Fraction();

        System.out.println("Fraction 1:");
        fraction1.displayFraction();

        System.out.println("\nFraction 2:");
        fraction2.displayFraction();

        System.out.println("\nFraction 3:");
        fraction3.displayFraction();
    }
}
