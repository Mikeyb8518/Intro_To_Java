import java.util.Scanner;

public class Distance_Of_Two_Points {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to Enter x1, y1
        System.out.print("Enter x1 and y1: ");

        // x1, y1 variables
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // prompt user to enter x2, y2
        System.out.print("\nEnter x2 and y2: ");

        // x2 and y2 variables
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Distance formula
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        // Display results
        System.out.println("\nThe distance between the two points is " + distance);
    }
}