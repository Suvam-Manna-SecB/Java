// Write a Java Program to Count a Group of Words in a String.

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java is a programming language. Java is used for developing various applications.";
        String[] wordsToCount = {"Java", "is"};
        int totalCount = 0;
        for (String word : wordsToCount) {
            int wordCount = countWordOccurrences(sentence, word);
            System.out.println("Occurrences of '" + word + "': " + wordCount);
            totalCount += wordCount;
        }
        System.out.println("Total occurrences: " + totalCount);
    }
    public static int countWordOccurrences(String sentence, String word) {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
