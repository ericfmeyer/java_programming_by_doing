import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NimTest {
    private Nim testGameOfNim;

    @Before
    public void setUp() {
        testGameOfNim = new Nim();
    }

    @Test
    public void GivenNoNamesProvidedThenPlayerNameIsCorrect() {
        for (int i = 0; i < 2; i++) {
            Assert.assertEquals("Player " + i, testGameOfNim.getPlayer(i));
        }
    }

    @Test
    public void GivenNamesAreProvidedThenPlayerNameIsCorrect() {
        testGameOfNim = new Nim("Eric", "Dariela");
        Assert.assertEquals("Eric", testGameOfNim.getPlayer(0));
        Assert.assertEquals("Dariela", testGameOfNim.getPlayer(1));
    }

    @Test
    public void GivenNameExistsWhenPlayerNameIsChangedThenPlayerNameIsUpdated() {
        testGameOfNim.setPlayer(0, "Cappu");
        Assert.assertEquals("Cappu", testGameOfNim.getPlayer(0));
    }

    @Test
    public void GivenGameExistsThenBoardIsNotNull() {
        Assert.assertNotNull(testGameOfNim.getTheBoard());
    }

    @Test
    public void GivenGameExistsThenBoardIsNotEmpty() {
        Assert.assertFalse(testGameOfNim.isFinished());
    }

    @Test
    public void GivenGameExistsWhenBoardHasOnlyOneCountLeftThenGameIsFinished() {
        testGameOfNim.clearBoard();
        testGameOfNim.getTheBoard().getPileByIndex(0).setCount(1);
        Assert.assertTrue(testGameOfNim.isFinished());
    }

    @Test
    public void GivenGameExistsThenNoPileIsEmpty() {
        Assert.assertFalse(testGameOfNim.isPileEmpty("A"));
    }

    @Test
    public void GivenGameExistsWhenLastCountIsRemovedFromPileThenPileIsEmpty() {
        testGameOfNim.clearBoard();
        Assert.assertTrue(testGameOfNim.isPileEmpty("A"));
    }

    @Test
    public void testGetPileCount() {
        int expected = testGameOfNim.getTheBoard().getPileByName("A").getCount();
        Assert.assertEquals(expected, testGameOfNim.getPileCount("A"));
    }
}
