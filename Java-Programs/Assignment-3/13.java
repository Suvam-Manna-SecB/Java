// Write a Java program to check whether a given matrix is sparse or not.

public class SparseMatrixChecker {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 0, 0},
            {0, 5, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };

        boolean isSparse = isSparseMatrix(matrix);

        if (isSparse) {
            System.out.println("The given matrix is sparse.");
        } else {
            System.out.println("The given matrix is not sparse.");
        }
    }

    public static boolean isSparseMatrix(int[][] matrix) {
        int zeroCount = 0;
        int totalElements = matrix.length * matrix[0].length;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 0) {
                    zeroCount++;
                }
            }
        }
        return zeroCount > totalElements / 2;
    }
}
