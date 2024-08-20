import java.util.Scanner;

public class Area_Of_Pentagon {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // prompt user to enter length from the center to a vertex
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        // Formulas to compute area/length of side
        double s = (2 * r) * Math.sin(Math.PI / 5); // Length of side
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5)); // Area of pentagon

        // Display results
        System.out.printf("The area of the pentagon is %5.2f\n", area);
    }
}
