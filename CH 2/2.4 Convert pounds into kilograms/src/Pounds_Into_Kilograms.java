import java.util.Scanner;

public class Pounds_Into_Kilograms {
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a pound value
        System.out.print("Enter a number in pounds: ");

        // Pound variable
        double pound = input.nextDouble();

        // Kilogram variable
        double kilogram = pound * 0.454;

        // Display results
        System.out.println(pound + " pounds is " + kilogram + " kilograms");
    }
}
