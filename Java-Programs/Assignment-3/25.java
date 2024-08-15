// Write a Java program to show parameterized constructor.

public class ParameterizedConstructor {
    private int value;

    public ParameterizedConstructor(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10); 
        System.out.println("Value: " + obj.getValue());
    }
}
