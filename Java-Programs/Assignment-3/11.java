// Write a Java program to find the sum of all odd numbers in a 2D array.

public class SumOfOddNumbersIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = sumOfOddNumbers(array);

        System.out.println("Sum of all odd numbers in the 2D array: " + sum);
    }

    public static int sumOfOddNumbers(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }
}
