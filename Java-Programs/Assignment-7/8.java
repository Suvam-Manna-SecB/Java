/* Write a program that takes a value at the command line for which factorial is to be
computed. The program must convert the string to its integer equivalent. There are
three possible user input errors that can prevent the program from executing
normally.
The first error is when the user provides no argument while executing the
program and an ArrayIndexOutOfBoundsException is raised. You must write a
catch block for this.
The second error is NumberFormatException that is raised in case the user
provides a non-integer (float double) value at the command line.
The third error is IllegalArgumentException. This needs to be thrown manually if
the value at the command line is 0. */

public class FactorialCalculator {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("No argument provided");
            }
            int value = Integer.parseInt(args[0]);
            if (value == 0) {
                throw new IllegalArgumentException("Value cannot be 0");
            }
            long factorial = computeFactorial(value);
            System.out.println("Factorial of " + value + " is: " + factorial);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Non-integer value provided");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static long computeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
