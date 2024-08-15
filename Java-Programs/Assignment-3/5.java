// Write a Java program to find the range of a 1D array.

public class ArrayRange {
    public static void main(String[] args) {
        int[] array = {12, 5, 19, 27, 8, 33, 21};

        int range = findRange(array);

        System.out.println("The range of the array is: " + range);
    }

    public static int findRange(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min;
    }
}
