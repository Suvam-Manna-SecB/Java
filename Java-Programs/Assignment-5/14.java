/* Write a test program that prompts the user to enter the investment amount (e.g., 1000) and the interest rate (e.g., 9%), and print a table that displays future value for the years from 1 to 30, as shown below:
The amount invested: 1000
Annual interest rate: 9%
Years		Future Value
    1		1093.8
    2		1196.41
    ..
   29		13467.25
   30		14730.57
*/

import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        System.out.printf("%-10s%-20s\n", "Years", "Future Value");

        for (int years = 1; years <= 30; years++) {
            double futureValue = calculateFutureValue(investmentAmount, monthlyInterestRate, years);
            System.out.printf("%-10d%-20.2f\n", years, futureValue);
        }
    }

    public static double calculateFutureValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
