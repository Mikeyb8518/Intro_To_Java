import java.util.Scanner;

public class Population_Projection {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter number of years
        System. out.print("Enter the number of years: ");
        // years variable
        int years = input.nextInt();
        // population formula
        // Calculate population projection
        int population = 312032486 + (((31536000 / 7) - (31536000 / 13)
                + (31536000 / 45)) * years);

        // display results
        System.out.println("The population in " + years + " years is " + population);
    }
}
