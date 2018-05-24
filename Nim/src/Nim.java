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

    public boolean isPileEmpty(String name) {
        return this.getTheBoard().getPileByName(name).isEmpty();
    }

    public int getPileCount(String name) {
        return this.getTheBoard().getPileByName(name).getCount();
    }

    public boolean isFinished() {
        return theBoard.areAllPilesEmpty();
    }

    public static void main(String[] args) {
        Nim game = new Nim();
        Scanner keyboard = new Scanner(System.in);
        String selectedPile;
        int countToRemove;
        int currentPlayer = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Player " + i + ", enter your name: ");
            game.setPlayer(i, keyboard.next());
            System.out.println(game.getPlayer(i));
        }

        while (!game.isFinished()) {
            System.out.println(game.theBoard.generateOutputString());

            System.out.print(game.getPlayer(currentPlayer) + ", select a pile to choose from: ");
            selectedPile = keyboard.next();
            while (game.isPileEmpty(selectedPile)) {
                System.out.print("\nNice try, " + game.getPlayer(currentPlayer) + ". That pile is empty. Choose again: ");
                selectedPile = keyboard.next();
            }

            System.out.print("How many to remove from pile " + selectedPile + ": ");
            countToRemove = keyboard.nextInt();
            while (countToRemove <= 0 || game.getPileCount(selectedPile) < countToRemove) {
                if (game.getPileCount(selectedPile) < countToRemove) {
                    System.out.print("\nPile " + selectedPile + " does not have that many. Try again: ");
                } else if (countToRemove <= 0) {
                    System.out.print("\nYou must choose at least 1. How many? ");
                }
                countToRemove = keyboard.nextInt();
            }

            game.theBoard.getPileByName(selectedPile).removeFromPile(countToRemove);
            currentPlayer = (currentPlayer + 1) % 2;
        }

        System.out.println("\n" + game.getPlayer(currentPlayer) + ", there are no counters left, so you WIN!. Good job!");
    }
}
