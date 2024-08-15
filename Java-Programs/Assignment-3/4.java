// Write a Java program to calculate Sum of two 2-dimensional arrays.

public class SumOf2DArrays {
    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] array2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] sum = addArrays(array1, array2);

        System.out.println("Sum of the two arrays:");
        printArray(sum);
    }

    public static int[][] addArrays(int[][] array1, int[][] array2) {
        int rows = array1.length;
        int columns = array1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

        return result;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
