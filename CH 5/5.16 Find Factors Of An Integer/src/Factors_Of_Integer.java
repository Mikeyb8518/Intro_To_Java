import java.util.Scanner;
import java.util.WeakHashMap;

public class Factors_Of_Integer {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int index = 2; // number to test as factor

        // Find the factors and display them in incrementing order
        while (number / index != 1) {
            // Test factor of number
            if (number % index == 0) {
                System.out.print(index + ", ");
                number /= index;
            }
            else {
                index++;
            }
        }

        System.out.println(number + ".");
    }
}
