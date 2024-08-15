/* Write a class that keeps a running total of all characters passed to it (one at a time)
and throws an exception if it is passed a non-alphabetic character. */

class NonAlphabeticCharacterException extends Exception {
    public NonAlphabeticCharacterException(String message) {
        super(message);
    }
}
public class RunningTotal2 {
    private int total;

    public RunningTotal2() {
        total = 0;
    }
    public void addChar(char c) throws NonAlphabeticCharacterException {
        if (Character.isAlphabetic(c)) {
            total++;
        } else {
            throw new NonAlphabeticCharacterException("Non-alphabetic character detected: " + c);
        }
    }
    public int getTotal() {
        return total;
    }
    public static void main(String[] args) {
        RunningTotal2 rt = new RunningTotal2();
        String input = "abc123def";

        for (char c : input.toCharArray()) {
            try {
                rt.addChar(c);
            } catch (NonAlphabeticCharacterException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        System.out.println("Total alphabetic characters: " + rt.getTotal());
    }
}
