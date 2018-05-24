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
    public void getNameShouldReturnPileName() {
        p.setName("A");
        Assert.assertEquals("A", p.getName());
    }

    @Test
    public void getCountShouldReturnPileCount() {
        p.setCount(3);
        Assert.assertEquals(3, p.getCount());
    }

    @Test
    public void removeFromPileShouldRemoveCorrectCount() {
        p.setCount(3);
        p.removeFromPile(1);
        Assert.assertEquals(2, p.getCount());
    }

    @Test
    public void testIsPileEmpty() {
        p.setCount(0);
        Assert.assertEquals(true, p.isEmpty());
    }
}
