/* Write a Java Program to Access the Characters or the ASCII of the Character
Available in the String. */

public class CharASCII {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Characters and their ASCII values using for loop:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiValue = (int) ch;
            System.out.println("Character: " + ch + ", ASCII value: " + asciiValue);
        }
        System.out.println("\nCharacters and their ASCII values using enhanced for loop:");
        for (char ch : str.toCharArray()) {
            int asciiValue = (int) ch;
            System.out.println("Character: " + ch + ", ASCII value: " + asciiValue);
        }
    }
}
