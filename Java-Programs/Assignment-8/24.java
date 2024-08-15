// Write a Java Program to Verify a Class is StringBuffer Class Method.

public class StringBufferClassVerifier {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        if (stringBuffer instanceof StringBuffer) {
            System.out.println("The object is an instance of StringBuffer class.");
        } else {
            System.out.println("The object is not an instance of StringBuffer class.");
        }
    }
}
