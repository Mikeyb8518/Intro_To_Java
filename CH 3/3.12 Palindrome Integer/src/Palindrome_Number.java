import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        // create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a three digit number
        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();

        // Copying the input
        int copy = num;

        // Variable to store the result
        int revVal = 0;

        // Loop to check if palindrome
        while (copy != 0) {
            int rem = copy % 10; // Extracting number
            copy /= 10; // dividing and storing the number
            revVal = revVal * 10 + rem; // Reversing
        }

        // checking whether the reverse and original number is same or not
        if(num == revVal) {
            System.out.println(num + " is a Palindrome number");
        }
        else {
            System.out.println(num + " is not a Palindrome number");
        }
    }
}
