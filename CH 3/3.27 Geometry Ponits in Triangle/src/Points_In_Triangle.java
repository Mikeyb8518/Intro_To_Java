import java.util.Scanner;

public class Points_In_Triangle {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter x and y coordinate
        System.out.print("Enter a x- and y coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Check if points intersect
        double intersectX = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersectY = (-y * (200 * 100)) / (-y * 200 - x * 100);

        // Display results
        System.out.println("The point " + ((x > intersectX || y > intersectY)
                   ? "is not " : "is ") + "in the triangle");
    }
}
