/* Write a Java program using try and catch to generate NegativeArrayIndex Exception
and Arithmetic Exception. */

public class NegativeArrayIndexExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[-1] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Negative array index: " + e.getMessage());
        }

        try {
            int result = divide(10, 0); 
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
    }
    public static int divide(int a, int b) {
        return a / b;
    }
}
