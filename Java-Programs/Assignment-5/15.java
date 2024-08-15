/* Write a program that reads ten numbers, computes their average, and finds out how many numbers are above the average. [Use this keyword] */

import java.util.Scanner;

public class AverageNumbers {
    private double[] numbers;
    private int aboveAverageCount;

    public AverageNumbers() {
        numbers = new double[10];
        aboveAverageCount = 0;
    }

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
    }

    public double computeAverage() {
        double sum = 0;
        for (double num : this.numbers) {
            sum += num;
        }
        return sum / this.numbers.length;
    }

    public void countAboveAverage() {
        double average = computeAverage();
        for (double num : this.numbers) {
            if (num > average) {
                aboveAverageCount++;
            }
        }
    }

    public void displayResults() {
        double average = computeAverage();
        System.out.println("The average of the ten numbers is: " + average);
        System.out.println("Numbers above the average: " + aboveAverageCount);
    }

    public static void main(String[] args) {
        AverageNumbers avgNumbers = new AverageNumbers();
        avgNumbers.readNumbers();
        avgNumbers.countAboveAverage();
        avgNumbers.displayResults();
    }
}
