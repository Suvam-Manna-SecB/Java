/* Write a Java program to find duplicate elements in a 1D array and find their frequency of occurrence.
*/

public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 3, 4, 5};

        int[] uniqueElements = removeDuplicates(array);
        int[] frequencies = findFrequency(array, uniqueElements);

        System.out.println("Duplicate elements and their frequency:");
        for (int i = 0; i < uniqueElements.length; i++) {
            if (frequencies[i] > 1) {
                System.out.println("Element: " + uniqueElements[i] + ", Frequency: " + frequencies[i]);
            }
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        int[] temp = new int[length];
        int j = 0;

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = array[i];
            }
        }

        int[] uniqueElements = new int[j];
        System.arraycopy(temp, 0, uniqueElements, 0, j);
        return uniqueElements;
    }

    public static int[] findFrequency(int[] array, int[] uniqueElements) {
        int[] frequencies = new int[uniqueElements.length];

        for (int i = 0; i < uniqueElements.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (uniqueElements[i] == array[j]) {
                    frequencies[i]++;
                }
            }
        }

        return frequencies;
    }
}
