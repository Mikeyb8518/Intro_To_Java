import java.util.Scanner;

public class Count_Positive_Negative {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);
        // variables to hold count of positive and negative
        int positive = 0, negative = 0, count = 0;
        // total variable
        double total = 0;

        // prompt user to enter integers positive or negative or 0 to exit
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        if(number == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(1);
        }

        while (number != 0) {
            if (number > 0)
                positive++;
            else
                negative++;
            total += number;
            count++;
            number = input.nextInt();
        }

        // Calculate average
        double average = total / count;

        // Display results
        System.out.println(
                "The number of positive is " + positive +
                        "\nThe number of negatives is " + negative +
                        "\nThe total is total " + total +
                        "\nThe average is " + average);
    }
}
