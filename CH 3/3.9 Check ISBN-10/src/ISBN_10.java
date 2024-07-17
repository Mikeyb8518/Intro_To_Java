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

        
    }
}
