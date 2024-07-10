import java.util.Scanner;

public class Future_Dates {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter today date
        System.out.print("Enter today's day: ");
        int day = input.nextInt();

        // Prompt user to enter the days after date entered
        System.out.print("Enter the number of days elapsed since today: ");
        int days_elapsed = input.nextInt();

        // Calculate future date
        int future_Date = (day + days_elapsed) % 7;

        System.out.print("Today is ");
        switch (day)
        {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }

        System.out.print(" and the future day is ");
        switch (future_Date)
        {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }
    }
}
