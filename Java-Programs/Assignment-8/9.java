// Write a Java Program to Use compareTo Method In a String Class.

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        int result1 = str1.compareTo(str2);
        System.out.println("Comparison of '" + str1 + "' and '" + str2 + "': " + result1);
        int result2 = str2.compareTo(str1);
        System.out.println("Comparison of '" + str2 + "' and '" + str1 + "': " + result2);
        int result3 = str1.compareTo(str3);
        System.out.println("Comparison of '" + str1 + "' and '" + str3 + "': " + result3);
    }
}
