/* Consider a Student examination database system that prints the mark sheet of
students. Input the following from the command line.
(a) Student’s Name
(b) Marks in six subjects
These marks should be between 0 to 50. If the marks are not in the specified range,
raise a RangeException, else find the total marks and prints the percentage of the
students. */

class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}
public class StudentMarkSheet {
    public static void main(String[] args) {
        if (args.length != 7) {
            System.out.println("Usage: java StudentMarkSheet <Name> <Mark1> <Mark2> <Mark3> <Mark4> <Mark5> <Mark6>");
            return;
        }
        String name = args[0];
        try {
            int[] marks = new int[6];
            for (int i = 1; i < args.length; i++) {
                marks[i - 1] = Integer.parseInt(args[i]);
                if (marks[i - 1] < 0 || marks[i - 1] > 50) {
                    throw new RangeException("Marks should be between 0 to 50");
                }
            }
            int totalMarks = calculateTotalMarks(marks);
            double percentage = (totalMarks / 300.0) * 100;
            System.out.println("Student Name: " + name);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid marks provided");
        } catch (RangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
}
