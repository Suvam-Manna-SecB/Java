/* Write a program to define a class having one 3-digit number, num as data member. Initialize and display the reverse of that number. */

class Number {
    private int num;

    public Number(int num) {
        if (num >= 100 && num <= 999) {
            this.num = num;
        } else {
            System.out.println("Invalid input! Number must be a 3-digit number.");
        }
    }

    public void displayReverse() {
        int reversedNumber = 0;
        int originalNumber = num;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            originalNumber /= 10;
        }

        System.out.println("Reverse of " + num + " is: " + reversedNumber);
    }
}

public class NumberReverseDemo {
    public static void main(String[] args) {
        Number number = new Number(456);
        number.displayReverse();
    }
}
