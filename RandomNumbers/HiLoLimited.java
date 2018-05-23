import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {
    final static int MAX_TRIES = 7;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int secret = 1 + r.nextInt(100);
        int guess, tries = 1;

        System.out.println("I'm thinking of a number between 1 and 100. You have " + MAX_TRIES + " guesses.");
        System.out.print("First guess: ");
        guess = keyboard.nextInt();

        while (tries < MAX_TRIES && guess != secret) {
            if (guess < secret) {
                System.out.println("Sorry, you are too low.");
            } else {
                System.out.println("Sorry, that guess it too high.");
            }
            System.out.print("Guess # " + ++tries + ": ");
            guess = keyboard.nextInt();
        }

        if (tries < MAX_TRIES) {
            System.out.println("You guessed it! What are the odds?!?");
        } else {
            System.out.println("Sorry, you didn't guess it in " + tries + " tries. You lose!");
            System.out.println("My secret number was " + secret + ".");
        }
    }
}
