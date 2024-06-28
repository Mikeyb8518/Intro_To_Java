import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter v0, v1, t
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        // Acceleration formula
        double acceleration = (v1 - v0) / t;

        // Display results
        System.out.println("The average acceleration is " + acceleration);
    }
}
