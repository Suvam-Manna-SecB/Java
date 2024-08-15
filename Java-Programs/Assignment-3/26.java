// Write a Java program to show constructor overloading.

public class ConstructorOverloading {
    private int value;

    public ConstructorOverloading() {
        this.value = 0; // Default value
    }

    public ConstructorOverloading(int value) {
        this.value = value;
    }

    public ConstructorOverloading(int value1, int value2) {
        this.value = value1 + value2;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(); 
        ConstructorOverloading obj2 = new ConstructorOverloading(10); 
        ConstructorOverloading obj3 = new ConstructorOverloading(5, 7);

        System.out.println("Value of obj1: " + obj1.getValue()); 
        System.out.println("Value of obj2: " + obj2.getValue());
        System.out.println("Value of obj3: " + obj3.getValue());
    }
}
