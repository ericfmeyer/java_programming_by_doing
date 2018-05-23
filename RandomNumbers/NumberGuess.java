import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int secret = 1 + r.nextInt(10);
        int guess, tries = 1;

        System.out.println("I'm thinking of a number from 1 to 10. Try to guess it.");
        System.out.print("Your guess: ");
        guess = keyboard.nextInt();

        while (guess != secret) {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
            tries++;
        }

        System.out.println("That's right! My secret number was " + secret + "!");
        System.out.println("It took you " + tries + " tries to guess the number.");
    }
}
