import java.util.Scanner;

public class Current_Time {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the time offset of GMT
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Total milliseconds
        long totalMilliseconds = System.currentTimeMillis();

        // Total seconds
        long totalSeconds = totalMilliseconds / 1000;

        // Current Seconds
        long currentSecond = totalSeconds % 60;

        // Total minutes
        long totalMinutes = totalSeconds / 60;

        // Current minute
        long currentMinute = totalMinutes % 60;

        // Total hours
        long totalHours = totalMinutes / 60;

        // Current hours
        long currentHour = totalHours % 24;

        // Compute current hour
        currentHour = currentHour + offset;

        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond);
    }
}
