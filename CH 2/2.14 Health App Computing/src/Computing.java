import java.util.Scanner;

public class Computing {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // final pounds to kilograms
        final double KILOGRAMS_TO_POUNDS = 0.45359237;
        // final inches to meters
        final double INCHES_TO_METERS = 0.0254;

        // Prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        // pound variable
        double pound = input.nextDouble();

        // Prompt user to enter height in inches
        System.out.print("\nEnter height in inches: ");
        // height variable
        double height = input.nextDouble();

        // formula to convert pounds to kilograms
        pound = pound * KILOGRAMS_TO_POUNDS;
        // formula to convert inches to meters
        height = height * INCHES_TO_METERS;

        // BMI formula
        double BMI = pound / Math.pow(height, 2);

        // display results
        System.out.println("\nBMI is: " + BMI);
    }
}
