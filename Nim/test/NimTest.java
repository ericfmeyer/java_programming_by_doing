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
    public void getPlayersReturnsCorrectNameWithDefaultConstructor() {
        for (int i = 0; i < 2; i++) {
            Assert.assertEquals("Player " + i, testGameOfNim.getPlayer(i));
        }
    }

    @Test
    public void getPlayersReturnsCorrectNameWithArgumentConstructor() {
        testGameOfNim = new Nim("Eric", "Dariela");
        Assert.assertEquals("Eric", testGameOfNim.getPlayer(0));
        Assert.assertEquals("Dariela", testGameOfNim.getPlayer(1));
    }

    @Test
    public void setPlayerModifiesPlayerName() {
        testGameOfNim.setPlayer(0, "Cappu");
        Assert.assertEquals("Cappu", testGameOfNim.getPlayer(0));
    }
}
