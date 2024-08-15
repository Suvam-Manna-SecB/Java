// Write a Java program to subtract two matrices.

public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] result = subtractMatrices(matrix1, matrix2);

        if (result != null) {
            System.out.println("Resultant Matrix:");
            printMatrix(result);
        } else {
            System.out.println("Matrices must have the same dimensions");
        }
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        if (rows1 != rows2 || columns1 != columns2) {
            return null;
        }

        int[][] result = new int[rows1][columns1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
