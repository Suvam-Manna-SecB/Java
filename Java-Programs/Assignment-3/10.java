// Write a Java program to enter n elements in an array and find smallest number among them.

import java.util.Scanner;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be greater than zero.");
            return;
        }
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int smallest = findSmallest(array);
        System.out.println("The smallest number in the array is: " + smallest);
    }

    public static int findSmallest(int[] array) {
        if (array.length == 0) {
            return Integer.MAX_VALUE;
        }

        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    }
}
