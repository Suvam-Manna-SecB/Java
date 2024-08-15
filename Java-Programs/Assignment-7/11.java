/* Write a java program to create an custom Exception that would handle at least 2 kind
of Arithmetic Exceptions while calculating a given equation (e.g. X+Y*(P/Q)Z-I) */

class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}
public class EquationCalculator {
    public static void main(String[] args) {
        try {
            int x = 10, y = 0, p = 5, q = 0, z = 2, i = 3;
            int result = calculateEquation(x, y, p, q, z, i);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int calculateEquation(int x, int y, int p, int q, int z, int i) throws CustomArithmeticException {
        try {
            int temp = p / q; // This might throw ArithmeticException if q is 0
            int equationResult = x + y * temp * z - i;
            return equationResult;
        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("Arithmetic error occurred while calculating the equation: " + e.getMessage());
        }
    }
}
