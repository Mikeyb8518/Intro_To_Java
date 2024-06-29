import java.util.Scanner;

public class Calculate_Energy {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        // water variable represented as M
        double m = input.nextDouble();
        // Prompt user to enter initial temperature
        System.out.print("\nEnter the initial temperature: ");
        // Initial temperature variable
        double initialTemp = input.nextDouble();
        // Prompt user to enter final temperature
        System.out.print("\nEnter the final temperature: ");
        // Final temperature variable
        double finalTemp = input.nextDouble();

        // Energy formula represented as q
        double q = m * (finalTemp - initialTemp) * 4184;

        // Display results
        System.out.println("\nThe energy needed is " + q);
    }
}
