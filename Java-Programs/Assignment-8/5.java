// Write a Java Program to Concatenate Two Strings.

import java.util.Scanner;
public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        scanner.close();
        String concatenatedString1 = str1 + str2;
        System.out.println("Concatenated string using + operator: " + concatenatedString1);
        String concatenatedString2 = str1.concat(str2);
        System.out.println("Concatenated string using concat() method: " + concatenatedString2);
    }
}
