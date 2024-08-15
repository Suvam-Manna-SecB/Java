/* Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write a Java program to merge them into single sorted array C that contains every item from arrays A & B, in ascending order.
*/

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 10};

        int[] C = mergeSortedArrays(A, B);

        System.out.println("Merged Sorted Array C:");
        System.out.println(Arrays.toString(C));
    }

    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < A.length) {
            C[k++] = A[i++];
        }

        while (j < B.length) {
            C[k++] = B[j++];
        }

        return C;
    }
}
