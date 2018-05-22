import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int secret_card = 1 + r.nextInt(3);
        int guess;

        System.out.println("Fast Eddie lays down three cards.");
        System.out.println("Which one is the Ace?\n");

        // print cards face down
        System.out.println("\t##\t##\t##");
        System.out.println("\t##\t##\t##");
        System.out.println("\t1\t2\t3");

        // user guess
        System.out.print("\n> ");
        guess = keyboard.nextInt();

        if (guess == secret_card) {
            System.out.println("\nYou nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n");
        } else {
            System.out.println("\nHa! Fast Eddie wins again! The ace was card number " + secret_card + ".\n");
        }

        // print cards, face up
        switch (secret_card) {
            case 1: System.out.println("\tAA\t##\t##");
                    System.out.println("\tAA\t##\t##");
                    System.out.println("\t1\t2\t3");
                    break;
            case 2: System.out.println("\t##\tAA\t##");
                    System.out.println("\t##\tAA\t##");
                    System.out.println("\t1\t2\t3");
                    break;
            case 3: System.out.println("\t##\t##\tAA");
                    System.out.println("\t##\t##\tAA");
                    System.out.println("\t1\t2\t3");
                    break;
            default: System.out.println("ERROR");
        }
    }
}
