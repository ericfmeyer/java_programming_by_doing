import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int secret = 1 + r.nextInt(100);
        int guess;
        String text;

        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it.");
        System.out.print("> ");
        guess = keyboard.nextInt();

        System.out.println();
        if (guess == secret) {
            System.out.println("You guessed it! What are the odds?!?");
        } else {
            if (guess > secret) {
                text = "high";
            } else {
                text = "low";
            }
            System.out.print("Sorry, you are too " + text + ". I was thinking of " + secret);
        }
    }
}
