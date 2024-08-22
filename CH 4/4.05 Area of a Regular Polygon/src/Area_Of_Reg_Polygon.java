import java.util.Scanner;

public class Area_Of_Reg_Polygon {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter number of sides
        System.out.print("Enter the number of sides: ");
        double num_Of_Sides = input.nextDouble();

        // Prompt user to enter side length
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // formula for area of regular polygon
        double area = (num_Of_Sides * Math.pow(s, 2) / (4 * Math.tan(Math.PI / num_Of_Sides)));

        // Display results
        System.out.printf("The area of the polygon is %4.5f", area);
    }
}
