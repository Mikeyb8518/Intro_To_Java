import java.util.Scanner;

public class Point_In_Rectangle {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter coordinate
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Test and see if point is valid
        boolean pointWithinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10.0 / 2.0) ||
                (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 /2);

        // Display results
        System.out.println("Point (" + x + ", " + y + ") is " +
                ((pointWithinRectangle) ? "in " : "not within ") + "the rectangle");
    }
}
