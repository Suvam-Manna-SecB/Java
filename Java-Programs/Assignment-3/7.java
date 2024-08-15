// Write a Java program to find the sum of even numbers in an integer array.

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        int sum = sumOfEvenNumbers(array);

        System.out.println("Sum of even numbers in the array: " + sum);
    }

    public static int sumOfEvenNumbers(int[] array) {
        int sum = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }
}
