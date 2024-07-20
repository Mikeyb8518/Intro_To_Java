import java.util.Scanner;

public class ISBN_10 {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // ask user to enter the first nine digits of the ISBN
        System.out.print("Enter the first 9 digits of the ISBN: ");
        int isbn = input.nextInt();

        int d1 = isbn / 100000000;
        int remainer = isbn % 100000000;

        int d2 = isbn / 10000000;
        remainer %= 10000000;

        int d3 = isbn / 1000000;
        remainer %= 1000000;

        int d4 = isbn / 100000;
        remainer %= 100000;

        int d5 = isbn / 10000;
        remainer %= 10000;

        int d6 = isbn / 1000;
        remainer %= 1000;

        int d7 = isbn / 100;
        remainer %= 100;

        int d8 = isbn / 10;
        remainer %= 10;

        int d9 = remainer;

        // Compute d10
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
                + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        // Display the 10-digit ISBN
        System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5
                + d6 + d7 + d8 + d9);

        if (d10 == 10) {
            System.out.println("X");
        }
        else {
            System.out.println(d10);
        }
    }
}
