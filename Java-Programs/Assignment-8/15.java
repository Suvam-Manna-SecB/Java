/* Write a Java Program to Find First and Last Occurrence of Given Character in a String. */

public class FirstLastOccurrence {
    public static void main(String[] args) {
        String inputString = "hello world";
        char targetChar = 'l';
        int firstOccurrence = findFirstOccurrence(inputString, targetChar);
        int lastOccurrence = findLastOccurrence(inputString, targetChar);
        System.out.println("Original string: " + inputString);
        System.out.println("First occurrence of '" + targetChar + "': " + firstOccurrence);
        System.out.println("Last occurrence of '" + targetChar + "': " + lastOccurrence);
    }
    public static int findFirstOccurrence(String str, char targetChar) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                return i;
            }
        }
        return -1;
    }
    public static int findLastOccurrence(String str, char targetChar) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == targetChar) {
                return i;
            }
        }
        return -1;
    }
}
