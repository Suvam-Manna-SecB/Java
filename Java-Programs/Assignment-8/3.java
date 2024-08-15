// Write a Java program to merge two strings.

public class MergeStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String mergedString1 = str1 + " " + str2;
        System.out.println("Merged string using + operator: " + mergedString1);
        String mergedString2 = str1.concat(" ").concat(str2);
        System.out.println("Merged string using concat() method: " + mergedString2);
    }
}
