// Write a Java Program to Count Replace First Occurrence of a String.

public class CountReplaceFirstOccurrence {
    public static void main(String[] args) {
        String inputString = "hello world hello universe hello";
        String targetString = "hello";
        String replacementString = "hey";
        System.out.println("Original string: " + inputString);
        System.out.println("Target string: " + targetString);
        System.out.println("Replacement string: " + replacementString);
        int count = countAndReplaceFirstOccurrence(inputString, targetString, replacementString);
        System.out.println("Number of occurrences replaced: " + count);
        System.out.println("Modified string: " + inputString);
    }
    public static int countAndReplaceFirstOccurrence(String str, String target, String replacement) {
        int count = 0;
        int index = str.indexOf(target);
        if (index != -1) { 
            count++; 
            str = str.substring(0, index) + replacement + str.substring(index + target.length());
        }
        return count;
    }
}
