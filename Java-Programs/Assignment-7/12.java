/* Create two user-defined exceptions named “TooHot” and “TooCold” to check the
temperature (in Celsius) given by the user passed through the command line is too
hot or too cold.
If temperature > 35, throw exception “TooHot”.
If temperature <5, throw exception “TooCold”.

Otherwise, print “Normal” and convert it to Farenheit. */

class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}
class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}
public class TemperatureChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TemperatureChecker <temperature>");
            return;
        }
        try {
            int temperature = Integer.parseInt(args[0]);
            if (temperature > 35) {
                throw new TooHotException("Temperature is too hot (>35)");
            } else if (temperature < 5) {
                throw new TooColdException("Temperature is too cold (<5)");
            } else {
                System.out.println("Normal");
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid temperature provided");
        } catch (TooHotException | TooColdException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static double celsiusToFahrenheit(int celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
