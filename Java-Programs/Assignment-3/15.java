// Write a Java program to find the second highest element of an array.

public class SecondHighestElement {
    public static void main(String[] args) {
        int[] array = {12, 5, 19, 27, 8, 33, 21};

        int secondHighest = findSecondHighest(array);

        System.out.println("Second highest element in the array: " + secondHighest);
    }

    public static int findSecondHighest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
    }
}
