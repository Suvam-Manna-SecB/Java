// Write a Java Program to Compare Performance of Two Strings.

public class StringComparisonPerformance {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        long startTime1 = System.nanoTime();
        boolean result1 = compareStringsUsingEquals(str1, str2);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        long startTime2 = System.nanoTime();
        boolean result2 = compareStringsUsingEqualsOperator(str1, str2);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Using equals() method:");
        System.out.println("Result: " + result1);
        System.out.println("Time taken: " + duration1 + " nanoseconds");
        System.out.println("\nUsing == operator:");
        System.out.println("Result: " + result2);
        System.out.println("Time taken: " + duration2 + " nanoseconds");
    }

    public static boolean compareStringsUsingEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    public static boolean compareStringsUsingEqualsOperator(String str1, String str2) {
        return str1 == str2;
    }
}
