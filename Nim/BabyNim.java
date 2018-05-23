import java.util.Random;
import java.util.Scanner;

public class BabyNim {
    final static int NUMBER_OF_PILES = 3;

    public static int[] fillPiles(int n) {
        Random r = new Random();
        int[] retval = new int[n];

        for (int i = 0; i < n; i++) {
            retval[i] = 1 + r.nextInt(5);
        }

        return retval;
    }

    public static void printPiles(int[] piles) {
        for (int i = 0; i < piles.length; i++) {
            System.out.print((char) ((int) 'A' + i) + ": " + piles[i] + "\t");
        }
    }

    public static boolean areAllPilesEmpty(int[] piles) {
        boolean retval = true;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > 0) {
                retval = false;
                break;
            }
        }
        return retval;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] piles = fillPiles(NUMBER_OF_PILES);
        String pile;
        int to_remove;

        do {
            printPiles(piles);
            System.out.print("\nChoose a pile: ");
            pile = keyboard.next();
            System.out.print("How many to remove from pile " + pile + ": ");
            to_remove = keyboard.nextInt();
            piles[(int) pile.charAt(0) - (int) 'A'] -=  to_remove;
        } while (!areAllPilesEmpty(piles));

        System.out.println("\nAll piles are empty.Good job!");
    }
}
