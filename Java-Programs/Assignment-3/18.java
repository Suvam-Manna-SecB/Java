/* Write a Java program where elements of two integer arrays get added index wise and get stored into a third array.
*/

import java.util.Arrays;

public class AddArraysIndexWise {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] result = addArraysIndexWise(array1, array2);

        if (result != null) {
            System.out.println("Resultant Array: " + Arrays.toString(result));
        } else {
            System.out.println("Arrays must have the same length");
        }
    }

    public static int[] addArraysIndexWise(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return null;
        }

        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        return result;
    }
}
