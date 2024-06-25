import java.util.Scanner;

public class Num_Of_Years {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter number of minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        // Calculate number of years and days
        int year = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        // Display results
        System.out.println(minutes + " minutes is approximately " + year + " years and " + days + " days");
    }
}
