// Write a Java program which counts the non-zero elements in an integer array.

public class NonZeroElementCounter {
    public static void main(String[] args) {
        int[] array = {0, 5, 0, 8, 0, 12, 0, 0, 15};

        int count = countNonZeroElements(array);

        System.out.println("Number of non-zero elements in the array: " + count);
    }

    public static int countNonZeroElements(int[] array) {
        int count = 0;

        for (int num : array) {
            if (num != 0) {
                count++;
            }
        }

        return count;
    }
}
