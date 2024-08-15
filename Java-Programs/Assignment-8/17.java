// Write a Java Program to Know the Last Index of a Particular Word in a String.

public class LastIndexOfWord {
    public static void main(String[] args) {
        String inputString = "hello world hello universe hello";
        String targetWord = "hello";
        int lastIndex = getLastIndexOfWord(inputString, targetWord);
        if (lastIndex != -1) {
            System.out.println("Last index of '" + targetWord + "': " + lastIndex);
        } else {
            System.out.println("Word '" + targetWord + "' not found in the string.");
        }
    }
    public static int getLastIndexOfWord(String str, String word) {
        int lastIndex = -1;
        int index = str.indexOf(word);
        while (index != -1) {
            lastIndex = index;
            index = str.indexOf(word, index + 1);
        }
        return lastIndex;
    }
}
