import java.util.Scanner;

public class Process_A_String {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Display the string length and the first character
        System.out.println(str + " has a length of " + str.length() +
                " and the first character is " + str.charAt(0));
    }
}
