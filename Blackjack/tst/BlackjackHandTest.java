import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class: BlackjackHandTest
 * Tests the implementation of the BlackjackHand class.
 *
 * @author Eric Meyer
 */
public class BlackjackHandTest {
    BlackjackHand testHand;

    @Before
    public void setUp() {
        testHand = new BlackjackHand("Eric");
        testHand.addCard(new Card(8));
        testHand.addCard(new Card(9));
    }

    @Test
    public void canCreateHand() {
        Assert.assertNotNull(testHand);
    }

    @Test
    public void getPlayerNameReturnsCorrectName() {
        Assert.assertEquals("Eric", testHand.getPlayerName());
    }

    @Test
    public void getTotalReturnsCorrectTotal() {
        Assert.assertEquals(17, testHand.getTotal());
    }

    @Test
    public void isBustedReturnsCorrectValue() {
        testHand.addCard(new Card(4));
        Assert.assertFalse(testHand.isBusted());
        testHand.addCard(new Card(2));
        Assert.assertTrue(testHand.isBusted());
    }

    @Test
    public void getCardReturnsCorrectCard() {
        Assert.assertEquals(8, testHand.getCard(0).getRank());
        Assert.assertEquals(9, testHand.getCard(1).getRank());
    }
}
