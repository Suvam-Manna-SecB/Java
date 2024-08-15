// Write a Java program to find the sum of diagonal elements in a 2D array.

public class SumOfDiagonalElements {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = sumOfDiagonalElements(array);

        System.out.println("Sum of diagonal elements in the array: " + sum);
    }

    public static int sumOfDiagonalElements(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == array.length - 1) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }
}
