// With a Java Program to Use compareToIgnoreCase Method In a String Class.

public class CompareStringsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "banana";
        String str3 = "apple";
        int result1 = str1.compareToIgnoreCase(str2);
        System.out.println("Comparison of '" + str1 + "' and '" + str2 + "': " + result1);
        int result2 = str2.compareToIgnoreCase(str1);
        System.out.println("Comparison of '" + str2 + "' and '" + str1 + "': " + result2);
        int result3 = str1.compareToIgnoreCase(str3);
        System.out.println("Comparison of '" + str1 + "' and '" + str3 + "': " + result3);
    }
}
