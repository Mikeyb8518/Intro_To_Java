import java.util.Scanner;

public class Unicode_Of_Character {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);
        // Prompt user to enter a character
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        // Display unicode character
        System.out.println("The unicode for the character " + s + " is " + (int)ch);
    }
}
