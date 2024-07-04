import java.util.Scanner;

public class Cost_Of_Driving {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter Driving distance
        System.out.print("Enter the driving distance: ");
        // Distance variable
        double distance = input.nextDouble();

        // user to enter MPG
        System.out.print("\nEnter miles per gallon: ");
        // MPG variable
        double MPG = input.nextDouble();

        // user to enter price per gallon
        System.out.print("\nEnter price per gallon: ");
        // price per gallon variable
        double gallon_Price = input.nextDouble();

        // Cost of driving formula
        double cost_Driving = (distance / MPG) * gallon_Price;

        // Display results
        System.out.println("\nThe cost of driving is $" + cost_Driving);
    }
}
