/* Write a Java Program to Accept 2 String & Check Whether all Characters in First
String is Present in Second String & Print. */

import java.util.Scanner;
public class CheckCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        boolean allCharactersPresent = checkCharactersPresent(str1, str2);
        if (allCharactersPresent) {
            System.out.println("All characters in the first string are present in the second string.");
        } else {
            System.out.println("Not all characters in the first string are present in the second string.");
        }
        scanner.close();
    }
    public static boolean checkCharactersPresent(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
