import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int secret = 1 + r.nextInt(10);
        int number, guesses = 0;

        System.out.println("I'm thinking of a number from 1 to 10. Try to guess it.");
        System.out.print("Your guess: ");
        number = keyboard.nextInt();

        while (number != secret) {
            guesses++;
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            number = keyboard.nextInt();
        }

        System.out.println("That's right! My secret number was " + secret + "!");
    }
}
