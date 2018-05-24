/**
 * Created by fx06001 on 5/24/2018.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GroupOfPilesTest {
    private GroupOfPiles theGroupOfTestPiles;

    @Before
    public void setUp() {
        theGroupOfTestPiles = new GroupOfPiles(3);
    }

    @Test
    public void getSizeShouldReturnCorrectSize() {
        Assert.assertEquals(3, theGroupOfTestPiles.getSize());
    }

    @Test
    public void allPilesShouldHaveCorrectNames() {
        String[] expectedNames = {"A", "B", "C"};
        for (int i = 0; i < theGroupOfTestPiles.getSize(); i++) {
            Assert.assertEquals(expectedNames[i], theGroupOfTestPiles.getPileByIndex(i).getName());
        }
    }

    @Test
    public void allPilesShouldHavePositiveCount() {
        for (int i = 0; i < theGroupOfTestPiles.getSize(); i++) {
            Assert.assertTrue(theGroupOfTestPiles.getPileByIndex(i).getCount() > 0);
        }
    }

    @Test
    public void getPileByNameShouldReturnCorrectPile() {
        int expectedCount = 123;
        theGroupOfTestPiles.getPileByIndex(0).setCount(expectedCount);
        Assert.assertEquals(expectedCount, theGroupOfTestPiles.getPileByName("A").getCount());
    }

    @Test
    public void getPileByNameShouldReturnNullIfPileDoesNotExist() {
        Assert.assertNull(theGroupOfTestPiles.getPileByName("123"));
    }

    @Test
    public void outputIsCorrect() {
        theGroupOfTestPiles.setUpPiles(0);
        String expected = "A: 0\tB: 0\tC: 0\t";
        Assert.assertEquals(expected, theGroupOfTestPiles.generateOutputString());
    }

    @Test
    public void areAllPilesEmptyWithAllPilesAtZero() {
        theGroupOfTestPiles.setUpPiles(0);
        theGroupOfTestPiles.getPileByIndex(0).setCount(1);
        Assert.assertFalse(theGroupOfTestPiles.areAllPilesEmpty());
        theGroupOfTestPiles.getPileByIndex(0).setCount(0);
        Assert.assertTrue(theGroupOfTestPiles.areAllPilesEmpty());
    }

    @Test
    public void areAllPilesEmptyWithALLPilesNegative() {
        theGroupOfTestPiles.setUpPiles(-1);
        Assert.assertTrue(theGroupOfTestPiles.areAllPilesEmpty());
    }
}
