import java.util.Scanner;

public class Vowel_Or_Consonant {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a letter
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        if (Character.isLetter(ch)) {
            switch (Character.toUpperCase(ch)) {
                case 'A':
                case 'E':
                case 'I':
                case 'U': System.out.println(ch + " is a vowel"); break;
                default: System.out.println(ch + " is a consonant");
            }
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
