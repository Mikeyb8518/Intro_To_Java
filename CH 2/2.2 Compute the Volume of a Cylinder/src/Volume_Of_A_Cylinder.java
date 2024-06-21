import java.util.Scanner;

public class Volume_Of_A_Cylinder {
    public static void main(String[] args) {
        // Create a Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter radius and length
        System.out.print("Enter the radius and length of a cylinder: ");

        // Radius variable
        double radius = input.nextDouble();

        // Length variable
        double length = input.nextDouble();

        // Area variable
        double area = radius * radius * 3.14159;

        // Volume variable
        double volume = area * length;

        // Display area
        System.out.println("The area is " + area);

        // Display volume
        System.out.println("The length is " + volume);
    }
}
