import java.util.Scanner;

public class Heads_Tails_Game {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Coin variable
        int coin = (int)(Math.random() * 2);

        // Prompt user to enter a guess
        System.out.print("Enter a guess 0-heads or 1-tails: ");
        int guess = input.nextInt();

        // Display results
        System.out.println(((guess == coin) ? "Correct" : "Incorrect") + " guess.");
    }
}
