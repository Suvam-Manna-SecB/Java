/* Write a class that keeps a running total of all characters passed to it (one at a time)
and throws an exception if it is passed a non-alphabetic character. */

class InvalidCharacterException extends Exception {
    public InvalidCharacterException(String message) {
        super(message);
    }
}
public class RunningTotal {
    private int total;
    public RunningTotal() {
        total = 0;
    }
    public void addChar(char c) throws InvalidCharacterException {
        if (Character.isAlphabetic(c)) {
            total++;
        } else {
            throw new InvalidCharacterException("Non-alphabetic character detected: " + c);
        }
    }
    public int getTotal() {
        return total;
    }
    public static void main(String[] args) {
        RunningTotal rt = new RunningTotal();
        String input = "abc123def";

        for (char c : input.toCharArray()) {
            try {
                rt.addChar(c);
            } catch (InvalidCharacterException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        System.out.println("Total alphabetic characters: " + rt.getTotal());
    }
}
