import java.util.Scanner;

public class Wind_Chill {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter temp and wind speed
        System.out.print("Enter the temp in fahrenheit "
        + "between -58 and 41: ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed(>=2) in miles per hour: ");
        double speed = input.nextDouble();

        // If statement
        if (temp <= -58 || temp >= 41 || speed < 2) {
            System.out.print("The ");
            if (temp <= -58 || temp >= 41)
                System.out.print("temperature ");
            if ((temp <= -58 || temp >= 41) && speed < 2)
                System.out.print("and ");
            if (speed < 2)
                System.out.print("wind speed ");
            System.out.println("is invalid");
            System.exit(1);
        }
        // Compute the wind chill index
        double windChill = 35.74 + 0.6215 * temp -
                35.75 * Math.pow(speed, 0.16) +
                0.4275 * temp * Math.pow(speed, 0.16);

        // Display result
        System.out.println("The wind chill index is " + speed);
    }
}
