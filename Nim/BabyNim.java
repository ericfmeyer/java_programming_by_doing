import java.util.Random;
import java.util.Scanner;

class Pile {
    private int count;

    public void Pile(int n) {
        count = n;
    }

    public void setPileCount(int n) {
        count = n;
    }

    public int getPileCount() {
        return count;
    }
}

class Piles {
    private int number_of_piles;

    public void Piles(int size) {
        
    }
}

public class BabyNim {
    final static int NUMBER_OF_PILES = 3;

    public static Pile[] fillPiles(int n) {
        Random r = new Random();
        Pile[] retval = new Pile[n];

        for (int i = 0; i < n; i++) {
            retval[i].setPileCount(1 + r.nextInt(5));
        }

        return retval;
    }

    public static void printPiles(Pile[] piles) {
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
        Pile[] piles = fillPiles(NUMBER_OF_PILES);
        String pile;
        int to_remove;
        int pile_index;

        do {
            printPiles(piles);
            System.out.print("\nChoose a pile: ");
            pile = keyboard.next();
            System.out.print("How many to remove from pile " + pile + ": ");
            to_remove = keyboard.nextInt();
            pile_index = (int) pile.charAt(0) - (int) 'A';
            piles[pile_index].setPileCount(piles[pile_index].getPileCount() - to_remove);
        } while (!areAllPilesEmpty(piles));

        System.out.println("\nAll piles are empty.Good job!");
    }
}
