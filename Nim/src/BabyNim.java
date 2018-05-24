import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        GroupOfPiles theGame = new GroupOfPiles(3);
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println(theGame.generateOutputString());

            System.out.print("Select a pile to choose from: ");
            String selectedPile = keyboard.next();

            System.out.print("How many to remove from pile " + selectedPile + ": ");
            int countToRemove = keyboard.nextInt();

            theGame.getPileByName(selectedPile).removeFromPile(countToRemove);
        } while (!theGame.areAllPilesEmpty());

        System.out.println("\nAll piles are empty. Good job!");
    }
}
