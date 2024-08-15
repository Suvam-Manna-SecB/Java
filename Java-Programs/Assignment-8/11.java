// Write a Java Program to Remove a Particular Character from a String.

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String inputString = "Hello World";
        char charToRemove = 'o';
        String result = removeCharacter(inputString, charToRemove);
        System.out.println("Original string: " + inputString);
        System.out.println("String after removing '" + charToRemove + "': " + result);
    }
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
