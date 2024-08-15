/* Write a program called Factorial.java that computes factorials and catches the result
in an array of type long for reuse. The long type of variable has its own range. For
example 20! Is as high as the range of long type. So check the argument passes and
“throw an exception”, if it is too big or too small.
If x is less than 0 throw an IllegalArgumentException with a message “Value
of x must be positive”.
If x is above the length of the array throw an IllegalArgumentException with a
message “Result will overflow”.
Here x is the value for which we want to find the factorial. */

public class Factorial {
    private static long[] factorials;
    public static void main(String[] args) {
        int x = 20;

        try {
            long result = computeFactorial(x);
            System.out.println(x + "! = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static long computeFactorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Value of x must be positive");
        }

        if (x >= factorials.length) {
            throw new IllegalArgumentException("Result will overflow");
        }

        if (factorials[x] == 0) {
            factorials[x] = (x == 0) ? 1 : x * computeFactorial(x - 1);
        }

        return factorials[x];
    }
    static {
        factorials = new long[21];
    }
}
