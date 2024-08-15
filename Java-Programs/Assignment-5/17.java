// Write a program to demonstrate use of ‘this’ keyword.

public class MyClass {
    private int number;

    public MyClass(int number) {
        this.number = number;
    }

    public void displayNumber() {
        System.out.println("Number: " + this.number);
    }

    public void updateNumber(int number) {
        this.number = number;
        System.out.println("Number updated to: " + this.number);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        obj.displayNumber();
        obj.updateNumber(20);
    }
}
