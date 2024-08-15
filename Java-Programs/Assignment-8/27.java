// Write a Java Program to Count Number of Words in a given Text or Sentence.

public class WordCount2 {
    public static void main(String[] args) {
        String text = "This is a sample sentence. Counting the number of words in this sentence.";
        int wordCount = countWords(text);
        System.out.println("Number of words in the text: " + wordCount);
    }
    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
