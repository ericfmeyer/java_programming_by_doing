/**
 * Created by fx06001 on 5/24/2018.
 */

public class Pile {
    private String pileName;
    private int pileCount;

    public void Pile() {
        pileName = "";
        pileCount = 0;
    }
    public void Pile(String name, int count) {
        pileName = name;
        pileCount = count;
    }

    public void setName(String name) {
        pileName = name;
    }

    public String getName() {
        return pileName;
    }

    public void setCount(int x) {
        pileCount = x;
    }

    public int getCount() {
        return pileCount;
    }

    public void removeFromPile(int x) {
        pileCount -= x;
    }

    public boolean isEmpty() {
        return (pileCount == 0);
    }
}
