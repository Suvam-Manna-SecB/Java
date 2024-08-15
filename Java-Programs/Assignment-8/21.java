// Write a Java Program to Check Whether Date is in Proper Format or Not.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DateFormatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD format): ");
        String date = scanner.nextLine();
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            System.out.println("The date is in proper format (YYYY-MM-DD).");
        } else {
            System.out.println("The date is not in proper format (YYYY-MM-DD).");
        }
        scanner.close();
    }
}
