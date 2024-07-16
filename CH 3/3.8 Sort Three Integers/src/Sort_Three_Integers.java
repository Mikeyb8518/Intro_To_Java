import java.util.Scanner;

public class Sort_Three_Integers {
    public static void main(String[] args) {
        // create scanner input
        Scanner input = new Scanner(System.in);

        // prompt user to enter 3 numbers to sort
        System.out.print("Enter 3 numbers to sort: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // sort numbers
        int temp;
        if (num2 < num1 || num3 < num1) {

            if (num2 < num1) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            if (num3 < num1) {
                temp = num1;
                num1 = num3;
                num3 = temp;
            }
        }

        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Display numbers in accending order
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
