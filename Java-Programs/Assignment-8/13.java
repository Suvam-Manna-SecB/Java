// Write a Java Program to Make First Character of Each Word in Uppercase.

public class UppercaseFirstLetter {
    public static void main(String[] args) {
        String inputString = "hello world";
        String result = uppercaseFirstLetter(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("String with first letter of each word in uppercase: " + result);
    }

    public static String uppercaseFirstLetter(String str) {
        String[] words = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            char firstChar = Character.toUpperCase(word.charAt(0));
            stringBuilder.append(firstChar).append(word.substring(1)).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
