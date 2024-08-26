import java.util.Scanner;

public class Decimal_To_Hex {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter an integer from 1 - 15
        System.out.print("Enter a decimal value (0-15): ");
        int decimal = input.nextInt();

        // Display corresponding hex number
        if (decimal >= 0 && decimal <= 9) {
            System.out.println("The hex value is " + decimal);
        } else if (decimal >= 10 && decimal <= 15) {
            System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
        }
        else {
            System.out.println(decimal + " is an invalid input");
            System.exit(0);
        }
    }
}
