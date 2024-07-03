import java.util.Scanner;

public class Wind_Chill {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter temp between -58F and 41F
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        // temp variable
        double temp = input.nextDouble();

        // Prompt user to enter wind speed
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        // wind-speed variable
        double wind_Speed = input.nextDouble();

        // Wind chill formula
        double chill = 35.74 + 0.6215 * temp -
                35.75 * Math.pow(wind_Speed, 0.16) + 0.4275 * temp * Math.pow(wind_Speed, 0.16);

        // Display results
        System.out.println("The wind chill index is: " + chill);
    }
}