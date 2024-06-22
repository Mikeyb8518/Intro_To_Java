import java.util.Scanner;

public class Feet_Into_Meters {
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a foot value
        System.out.print("Enter a value for feet: ");

        // foot variable
        double foot = input.nextDouble();

        // Meter variable
        double meter = foot * 0.305;

        // Display results
        System.out.println(foot + " feet is " + meter + " meters");
    }
}
