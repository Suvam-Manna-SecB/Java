// Write a Java program to show the use of all keywords for exception handling.

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[6] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
        try {
            int num = Integer.parseInt("abc"); // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }
        try {
            int result = divide(10, 0); // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
        try {
            String[] names = {"John", "Jane"};
            System.out.println(names[2]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } finally {
            System.out.println("Finally block is executed always.");
        }
        try {
            throw new CustomException("Custom exception occurred"); // CustomException
        } catch (CustomException e) {
            System.out.println("Custom exception: " + e.getMessage());
        }
    }
    public static int divide(int a, int b) {
        return a / b;
    }
}
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
