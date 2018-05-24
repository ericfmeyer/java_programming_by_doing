import java.util.Scanner;

public class Nim {
    private int numberOfPiles = 3;
    private GroupOfPiles theBoard;
    private String[] thePlayers = {"", ""};

    public Nim() {
        for (int i = 0; i < 2; i++) {
            thePlayers[i] = "Player " + i;
        }
        createBoard();
    }

    public Nim(String p1, String p2) {
        thePlayers[0] = p1;
        thePlayers[1] = p2;
    }

    public void createBoard() {
        theBoard = new GroupOfPiles(numberOfPiles);
    }

    public void clearBoard() {
        for (int i = 0; i < theBoard.getSize(); i++) {
            theBoard.getPileByIndex(i).setCount(0);
        }
    }

    public void setPlayer(int index, String name) {
        thePlayers[index] = name;
    }

    public String getPlayer(int index) {
        return thePlayers[index];
    }

    public GroupOfPiles getTheBoard() {
        return theBoard;
    }

    public boolean isFinished() {
        return theBoard.areAllPilesEmpty();
    }

    public static void main(String[] args) {
        Nim game = new Nim();
        Scanner keyboard = new Scanner(System.in);
        String selectedPile;
        int countToRemove;
        int player = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Player " + i + ", enter your name: ");
            game.setPlayer(i, keyboard.next());
            System.out.println(game.getPlayer(i));
        }

        do {
            System.out.println(game.theBoard.generateOutputString());

            System.out.print(game.thePlayers[player] + ", select a pile to choose from: ");
            selectedPile = keyboard.next();

            System.out.print("How many to remove from pile " + selectedPile + ": ");
            countToRemove = keyboard.nextInt();

            game.theBoard.getPileByName(selectedPile).removeFromPile(countToRemove);
            player = (player + 1) % 2;
        } while (!game.isFinished());

        System.out.println("\nAll piles are empty. Good job!");
    }
}
