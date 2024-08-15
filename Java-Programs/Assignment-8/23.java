// Write a Java Program to Store String Literals Using String Buffer.

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello, ");
        stringBuffer.append("Java ");
        stringBuffer.append("Programmers!");
        System.out.println("Contents of StringBuffer: " + stringBuffer.toString());
    }
}
