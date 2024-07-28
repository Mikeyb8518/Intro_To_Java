import java.util.Scanner;

public class Day_Of_Week {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);
        // Prompt user to enter year, month, day
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        System.out.print("Enter Month: ");
        int month = input.nextInt();
        System.out.print("Enter day of month: ");
        int day = input.nextInt();
        // If statement to turn month jan, feb to 13 or 14
        if (month == 1 || month == 2) {
            month = (month == 1) ? 13 : 14;
            year--;
        }
        // Calculate day of week formula
        int dayOfWeek = (day +(26 * (month + 1)) + (year % 100) + (year % 100) / 4
        + (year / 100) / 4 + 5 * (year / 100)) % 7;

        // Display results
        System.out.print("The day of week is ");
        switch (dayOfWeek) {
            case 0: System.out.print("Saturday");
            case 1: System.out.print("Sunday");
            case 2: System.out.print("Monday");
            case 3: System.out.print("Tuesday");
            case 4: System.out.print("Wednesday");
            case 5: System.out.print("Thursday");
            case 6: System.out.print("Friday");
        }
    }
}
