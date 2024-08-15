// Write a Java Program to Find All Possible Subsets of given Length in String.

import java.util.ArrayList;
import java.util.Scanner;
public class SubsetsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the length of subsets: ");
        int length = scanner.nextInt();
        scanner.close();
        ArrayList<String> subsets = findSubsets(str, length);
        System.out.println("All possible subsets of length " + length + " in the string '" + str + "' are:");
        for (String subset : subsets) {
            System.out.println(subset);
        }
    }
    public static ArrayList<String> findSubsets(String str, int length) {
        ArrayList<String> subsets = new ArrayList<>();
        generateSubsets(str, length, 0, "", subsets);
        return subsets;
    }
    private static void generateSubsets(String str, int length, int index, String current, ArrayList<String> subsets) {
        if (current.length() == length) {
            subsets.add(current);
            return;
        }
        if (index >= str.length()) {
            return;
        }
        generateSubsets(str, length, index + 1, current + str.charAt(index), subsets);
        generateSubsets(str, length, index + 1, current, subsets);
    }
}
