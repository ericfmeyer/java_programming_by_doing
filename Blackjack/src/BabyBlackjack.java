import java.util.Random;

/**
 * Class: BabyBlackjack
 *
 * @author Eric Meyer
 */
public class BabyBlackjack {
    private static Random rng = new Random();

    private static void drawCards(BlackjackHand theHand) {
        theHand.addCard(new Card(rng.nextInt(10) + 1));
        theHand.addCard(new Card(rng.nextInt(10) + 1));
    }

    private static void printHand(BlackjackHand theHand) {
        System.out.println(theHand.getPlayerName() + " drew " + theHand.getCard(0).getRank() +
                " and " + theHand.getCard(1).getRank() + ".");
        System.out.println(theHand.getPlayerName() + "'s total is " + theHand.getTotal() + ".");
        System.out.println();
    }


    public static void main(String[] args) {
        BlackjackHand playerHand = new BlackjackHand("The player");
        BlackjackHand dealerHand = new BlackjackHand("The dealer");

        System.out.println("Baby Blackjack!\n");

        drawCards(playerHand);
        printHand(playerHand);

        drawCards(dealerHand);
        printHand(dealerHand);

        if (playerHand.getTotal() == dealerHand.getTotal()) {
            System.out.println("IT'S A DRAW!");
        } else if (playerHand.getTotal() > dealerHand.getTotal()) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("THE DEALER WINS!");
        }
    }
}
