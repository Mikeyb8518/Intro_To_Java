import java.util.Scanner;

public class Compare_Cost {
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight and price for package 1 and package 2
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        // Display results
        if (price1 / weight1 < price2 / weight2) {
            System.out.println("Package 1 has the better price.");
        } else if (price1 / weight1 > price2 / weight2) {
            System.out.println("Package 2 has the better price.");
        } else {
            System.out.println("Both packages have the same price.");
        }
    }
}
