// Class to represent a Time object
class Time {
    int hours;
    int minutes;

    // Constructor
    Time(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    // Method to add two Time objects
    Time add(Time t) {
        int sumHours = this.hours + t.hours;
        int sumMinutes = this.minutes + t.minutes;

        // Convert minutes to hours if >= 60
        sumHours += sumMinutes / 60;
        sumMinutes = sumMinutes % 60;

        return new Time(sumHours, sumMinutes);
    }

    // Method to print time
    void show() {
        System.out.println(hours + " hours " + minutes + " minutes");
    }
}

// Main class
public class AddTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(1, 50);
        Time t2 = new Time(2, 30);

        // Add the times
        Time result = t1.add(t2);

        // Display the result
        System.out.print("Total Time: ");
        result.show();
    }
}
