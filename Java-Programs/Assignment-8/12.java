// Write a Java Program to Reverse a String.

public class ReverseString2 {
    public static void main(String[] args) {
        String inputString = "Hello World";
        String reversedString = reverseString(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
