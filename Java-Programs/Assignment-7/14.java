/* Consider a “Binary to Decimal” Number conversion system which only accepts
binary number as Input. If user provides a decimal number a custom Exception
“WrongNumberFormat” exception will be thrown. Otherwise, it will convert into
decimal and print into the screen. */

class WrongNumberFormatException extends Exception {
    public WrongNumberFormatException(String message) {
        super(message);
    }
}
public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java BinaryToDecimalConverter <binary_number>");
            return;
        }
        String binaryNumber = args[0];
        try {
            if (!isBinary(binaryNumber)) {
                throw new WrongNumberFormatException("Invalid number format. Please provide a binary number.");
            }
            
            int decimalValue = binaryToDecimal(binaryNumber);
            System.out.println("Decimal equivalent: " + decimalValue);
        } catch (WrongNumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static boolean isBinary(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0' && number.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }
    public static int binaryToDecimal(String binaryNumber) {
        int decimalValue = 0;
        int power = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            int digit = binaryNumber.charAt(i) - '0';
            decimalValue += digit * Math.pow(2, power);
            power++;
        }
        return decimalValue;
    }
}
