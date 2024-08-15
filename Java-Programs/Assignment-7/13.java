/* Consider an Employee recruitment system that prints the candidate name based on
the age criteria. The name and age of the candidate are taken as Input.Create two
user-defined exceptions named “TooOlder” and “TooYounger”
If age>45, throw exception “TooOlder”.
If age<20, throw exception “TooYounger”.
Otherwise, print “Eligible” and print the name of the candidate. */

class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}
class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}
public class CandidateRecruitmentSystem {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CandidateRecruitmentSystem <name> <age>");
            return;
        }
        String name = args[0];
        try {
            int age = Integer.parseInt(args[1]);
            if (age > 45) {
                throw new TooOlderException("Candidate is too older (>45)");
            } else if (age < 20) {
                throw new TooYoungerException("Candidate is too younger (<20)");
            } else {
                System.out.println("Eligible");
                System.out.println("Candidate Name: " + name);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid age provided");
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
