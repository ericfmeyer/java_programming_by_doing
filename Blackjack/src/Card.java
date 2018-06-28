/**
 * Class: Card
 * @author  Eric Meyer
 */
public class Card {
    private final int rank;

    public Card(int rank) {
        if (!isValidRank(rank)) {
            throw new IllegalArgumentException();
        } else {
            this.rank = rank;
        }
    }

    public boolean isValidRank(int rank) {
        return 2 <= rank && rank <= 11;
    }

    public int getRank() {
        return this.rank;
    }
}
