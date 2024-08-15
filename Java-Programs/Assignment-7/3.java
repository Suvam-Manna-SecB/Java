/* Define an exception called “NoMatchFoundException” that is thrown when a string is
not equal to “University”. Write a program that uses this exception. */

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}
public class NoMatchFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            String input = "College";
            if (!input.equals("University")) {
                throw new NoMatchFoundException("String does not match 'University'");
            }
            System.out.println("String matches 'University'");
        } catch (NoMatchFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
