/* Write a Java program for calculating Factorial. Number should be taken through user
input (Using Scanner, BufferedReader both). */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FactorialCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number to calculate factorial (using Scanner): ");
            int number1 = scanner.nextInt();
            System.out.println("Factorial of " + number1 + " is: " + calculateFactorial(number1));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            scanner.close();
        }
        try {
            System.out.print("Enter a number to calculate factorial (using BufferedReader): ");
            int number2 = Integer.parseInt(reader.readLine());
            System.out.println("Factorial of " + number2 + " is: " + calculateFactorial(number2));
        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
