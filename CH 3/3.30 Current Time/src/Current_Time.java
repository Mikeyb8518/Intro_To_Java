import java.util.Scanner;

public class Current_Time {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Have user input offset from GMT
        System.out.print("Enter the timezone offset to GMT: ");
        int offset = input.nextInt(); // Offset variable

        // Obtain the total milliseconds since midnight Jan 1st, 1970
        long milliseconds = System.currentTimeMillis();
        // Obtain the total seconds since midnight Jan 1st, 1970
        long totalSeconds = milliseconds / 1000;
        // Obtain the current seconds since midnight Jan 1st, 1970
        long currentSecond = totalSeconds % 60;
        // Obtain the total minutes since midnight Jan 1st, 1970
        long totalMinutes = totalSeconds / 60;
        // Obtain the current minute since midnight Jan 1st, 1970
        long currentMinute = totalMinutes % 60;
        // Obtain the total hour since midnight Jan 1st, 1970
        long totalHours = totalMinutes / 60;
        // Obtain the current hour since midnight Jan 1st, 1970
        long currentHour = totalHours % 24;
        currentHour = currentHour + offset;

        // Display results
        System.out.println(
                "Current time is " + ((currentHour > 12) ? currentHour - 12 :
                        currentHour) + ":" + currentMinute + ":" + currentSecond +
                        ((currentHour > 12) ? " PM" : " AM"));
    }
}
