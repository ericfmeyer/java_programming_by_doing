import java.util.Scanner;

public class Nim {
    private int numberOfPiles;
    private GroupOfPiles theBoard;
    private String[] thePlayers = {"", ""};

    public Nim() {
        for (int i = 0; i < 2; i++) {
            thePlayers[i] = "Player " + i;
        }
    }

    public Nim(String p1, String p2) {
        thePlayers[0] = p1;
        thePlayers[1] = p2;
    }

    public void setPlayer(int index, String name) {
        thePlayers[index] = name;
    }

    public String getPlayer(int index) {
        return thePlayers[index];
    }

    public static void main(String[] args) {
        Nim game = new Nim();
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Player " + i + ", enter your name: ");
            game.setPlayer(i, keyboard.next());
        }
//
//        do {
//            System.out.println(theGame.generateOutputString());
//
//            System.out.print("Select a pile to choose from: ");
//            String selectedPile = keyboard.next();
//
//            System.out.print("How many to remove from pile " + selectedPile + ": ");
//            int countToRemove = keyboard.nextInt();
//
//            theGame.getPileByName(selectedPile).removeFromPile(countToRemove);
//        } while (!theGame.areAllPilesEmpty());

        System.out.println("\nAll piles are empty. Good job!");
    }
}
