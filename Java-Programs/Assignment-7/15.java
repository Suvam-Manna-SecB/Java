// Write a Java Program that Implement the Nested Try Statements.

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try block started");
            
            try {
                System.out.println("Inner try block started");
                System.out.println("Accessing element at index 3: " + numbers[3]);
                System.out.println("Inner try block ended");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch block executed: " + e.getMessage());
            }
            
            System.out.println("Outer try block ended");
        } catch (Exception e) {
            System.out.println("Outer catch block executed: " + e.getMessage());
        }
    }
}
