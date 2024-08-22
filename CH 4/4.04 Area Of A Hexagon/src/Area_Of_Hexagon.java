import java.util.Scanner;

public class Area_Of_Hexagon {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter side
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // Compute area of a hexagon
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

        // Display results
        System.out.printf("The area of the hexagon is %4.2f\n", area);
    }
}
