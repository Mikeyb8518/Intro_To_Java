import java.util.Scanner;

public class Area_Of_Hexagon {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter length of side
        System.out.print("Enter the length of side: ");
        // side variable
        double side = input.nextDouble();

        // area formula
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);

        // Display results
        System.out.println("The area of the hexagon is: " + area);
    }
}
