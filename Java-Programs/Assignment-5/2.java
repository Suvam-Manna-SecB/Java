/* Create a class called Time, which has three private instance variables – hour, min and sec. It contains a method called add() which takes one Time object as parameter and prints the added value of the calling Time object and passes Time object. In the main method, declare two Time objects and assign values using the constructor and call the add() method. */

class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void add(Time t) {
        int totalSec1 = this.hour * 3600 + this.min * 60 + this.sec;
        int totalSec2 = t.hour * 3600 + t.min * 60 + t.sec;
        int totalSeconds = totalSec1 + totalSec2;

        int newHour = totalSeconds / 3600;
        int newMin = (totalSeconds % 3600) / 60;
        int newSec = totalSeconds % 60;

        System.out.println("Added Time: " + newHour + " hours " + newMin + " minutes " + newSec + " seconds");
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time time1 = new Time(2, 30, 45);
        Time time2 = new Time(1, 15, 30);
        time1.add(time2);
    }
}
