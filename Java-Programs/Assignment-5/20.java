/* Write program, which finds the sum of numbers formed by consecutive digits.
Input: 2415
Output: 24+41+15=80. */

import java.util.Scanner;

public class ConsecutiveDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        String numberStr = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i < numberStr.length() - 1; i++) {
            int digit1 = Character.getNumericValue(numberStr.charAt(i));
            int digit2 = Character.getNumericValue(numberStr.charAt(i + 1));

            sum += Integer.parseInt("" + digit1 + digit2);

            System.out.print(digit1 + "" + digit2);
            if (i < numberStr.length() - 2) {
                System.out.print("+");
            }
        }

        System.out.println("=" + sum);
    }
}
