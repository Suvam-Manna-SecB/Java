// Write a Java Program to Find the Length of the String.

import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        int length = str.length();
        System.out.println("Length of the string '" + str + "' is: " + length);
    }
}
