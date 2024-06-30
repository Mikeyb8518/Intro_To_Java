import java.util.Scanner;

public class Finding_Runway_Length {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter speed and acceleration
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        // length formula
        double length = Math.pow(speed, 2) / (2 * acceleration);

        // display results
        System.out.println("The minimum runway length for this airplane is: " + length);
    }
}
