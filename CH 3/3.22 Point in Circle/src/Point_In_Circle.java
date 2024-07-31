import java.util.Scanner;

public class Point_In_Circle {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter point within circle
        System.out.print("Enter a point with 2 coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Verify if point is valid
        boolean withinCircle =
                (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

        // Display results
        System.out.println("Point (" + x +", " + y + ") is "
        + ((withinCircle) ? "in " : "not in ") + "the circle");
    }
}
