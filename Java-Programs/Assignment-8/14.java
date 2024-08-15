// Write a Java Program to Find the Consecutive Occurrence of any Vowel in a String.

public class ConsecutiveVowelOccurrence {
    public static void main(String[] args) {
        String inputString = "hello world";
        System.out.println("Original string: " + inputString);
        System.out.println("Consecutive occurrence of any vowel: " + findConsecutiveVowel(inputString));
    }
    public static int findConsecutiveVowel(String str) {
        int consecutiveCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            if (isVowel(currentChar) && isVowel(nextChar)) {
                consecutiveCount++;
            }
        }
        return consecutiveCount;
    }
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
