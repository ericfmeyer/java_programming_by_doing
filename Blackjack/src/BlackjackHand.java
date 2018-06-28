import java.util.ArrayList;

/**
 * Class: BlackjackHand
 *
 * @author Eric Meyer
 */
public class BlackjackHand {
    private String playerName;
    private ArrayList<Card> cards;

    public BlackjackHand(String name) {
        this.playerName = name;
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public Card getCard(int index) {
        return this.cards.get(index);
    }

    public int getTotal() {
        int total = 0;
        for (Card c : this.cards) {
            total += c.getRank();
        }
        return total;
    }

    public boolean isBusted() {
        return this.getTotal() > 21;
    }
}
