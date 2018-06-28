import org.junit.Assert;
import org.junit.Test;

/**
 * Class: CardTest
 * Tests the implementation of the Card class.
 *
 * @author Eric Meyer
 */
public class CardTest {
    @Test
    public void canCreateCard() {
        Assert.assertNotNull(new Card(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void cardWithLowRankThrowsException() {
        new Card(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cardWithHighRankThrowsException() {
        new Card(12);
    }

    @Test
    public void getRankReturnsCorrectRank() {
        Assert.assertEquals(7, new Card(7).getRank());
    }
}
