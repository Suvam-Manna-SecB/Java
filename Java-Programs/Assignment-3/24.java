// Write a Java program to show 0-arguments constructor.

public class ZeroArgumentsConstructor {
    private int value;

    public ZeroArgumentsConstructor() {
        this.value = 0; // Default value
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        ZeroArgumentsConstructor obj = new ZeroArgumentsConstructor();
        System.out.println("Value: " + obj.getValue());
    }
}
