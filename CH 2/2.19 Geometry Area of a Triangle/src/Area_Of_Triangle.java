import java.util.Scanner;

public class Area_Of_Triangle {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three points
        System.out.print("Enter the coordinates of three points separated by spaces like " +
                "x1 y1 x2 y2 x3 y3: ");
        // x1 y1 x2 y2 x3 y3 variables
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Compute side and area
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        // Display results
        System.out.println("The area of a triangle is: " + area);
    }
}
