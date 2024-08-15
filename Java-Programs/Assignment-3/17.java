// Write a Java program to merge two float arrays.

import java.util.Arrays;

public class MergeFloatArrays {
    public static void main(String[] args) {
        float[] array1 = {1.1f, 2.2f, 3.3f};
        float[] array2 = {4.4f, 5.5f, 6.6f};

        float[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static float[] mergeArrays(float[] array1, float[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        float[] mergedArray = new float[length1 + length2];

        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        return mergedArray;
    }
}
