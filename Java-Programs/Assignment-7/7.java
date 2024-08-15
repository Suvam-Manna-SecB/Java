/* Write a program that outputs the name of the capital of the country entered at the
command line. The program should throw a “NoMatchFoundException” when it fails
to print the capital of the country entered at the command line. */

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}
public class CountryCapitalFinder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java CountryCapitalFinder <country>");
            return;
        }
        String country = args[0];
        try {
            String capital = getCapital(country);
            System.out.println("Capital of " + country + " is: " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static String getCapital(String country) throws NoMatchFoundException {
        String[][] countryCapitalMap = {
            {"USA", "Washington D.C."},
            {"UK", "London"},
            {"France", "Paris"}
        };
        for (String[] pair : countryCapitalMap) {
            if (pair[0].equalsIgnoreCase(country)) {
                return pair[1];
            }
        }
        throw new NoMatchFoundException("No capital found for country: " + country);
    }
}
