/**
 * Created by fx06001 on 5/24/2018.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PileTest {
    private Pile p;

    @Before
    public void setUp() {
        p = new Pile();
    }

    @Test
    public void noArgumentConstructorShouldReturnCorrectPileNameAndPileCount() {
        Assert.assertEquals("", p.getName());
        Assert.assertEquals(0, p.getCount());
    }

    @Test
    public void argumentConstructorShouldReturnCorrectPileNameAndPileCount() {
        p = new Pile("X", 1);
        Assert.assertEquals("X", p.getName());
        Assert.assertEquals(1, p.getCount());
    }

    @Test
    public void getNameShouldReturnPileName() {
        String expectedName = "A";
        p.setName(expectedName);
        Assert.assertEquals(expectedName, p.getName());
    }

    @Test
    public void getCountShouldReturnPileCount() {
        int expectedCount = 123;
        p.setCount(expectedCount);
        Assert.assertEquals(expectedCount, p.getCount());
    }

    @Test
    public void removeFromPileShouldRemoveCorrectCount() {
        int expectedCount = 2;
        p.setCount(expectedCount + 1);
        p.removeFromPile(1);
        Assert.assertEquals(expectedCount , p.getCount());
    }

    @Test
    public void pileShouldBeEmptyWithZero() {
        p.setCount(0);
        Assert.assertTrue(p.isEmpty());
    }

    @Test
    public void pileShouldBeEmptyWithNegativeValue() {
        p.setCount(-1);
        Assert.assertTrue(p.isEmpty());
    }

    @Test
    public void pileShouldNotBeEmptyWithPositiveValue() {
        p.setCount(1);
        Assert.assertFalse(p.isEmpty());
    }
}
