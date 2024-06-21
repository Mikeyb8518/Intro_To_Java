import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter celsius degree
        System.out.print("Enter a Celsius degree: ");
        double celsius = input.nextDouble();

        // Fahrenheit variable
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Display results
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
