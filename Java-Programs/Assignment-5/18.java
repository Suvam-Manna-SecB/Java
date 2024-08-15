// Write a program to demonstrate use of ‘static’ keyword.

public class StaticDemo {
    private static int count = 0;

    public StaticDemo() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        StaticDemo.displayCount();
    }
}
