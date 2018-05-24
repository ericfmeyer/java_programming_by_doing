/**
 * Created by fx06001 on 5/24/2018.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BabyNimTest {
    private BabyNim b;

    @Before
    public void setUp() {
        b = new BabyNim(3);
    }

    @Test
    public void getSizeShouldReturnCorrectSize() {
        Assert.assertEquals(3, b.getSize());
    }

    @Test
    public void allPilesShouldHaveCorrectNames() {
        String[] expectedNames = {"A", "B", "C"};
        for (int i = 0; i < b.getSize(); i++) {
            Assert.assertEquals(expectedNames[i], b.getPileNameByIndex(i));
        }
    }

    @Test
    public void allPilesShouldHavePositiveCount() {
        for (int i = 0; i < b.getSize(); i++) {
            Assert.assertTrue(b.getPileCountByIndex(i) > 0);
        }
    }
}
