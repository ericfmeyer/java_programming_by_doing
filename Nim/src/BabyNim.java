import java.util.Random;

/**
 * Created by fx06001 on 5/24/2018.
 */

public class BabyNim {
    private Pile[] pilesList;

    public BabyNim(int size) {
        pilesList = new Pile[size];
        setUpPiles();
    }

    public void setUpPiles() {
        Random r = new Random();
        String name;
        int count;

        for (int i = 0; i < this.getSize(); i++) {
            name = Character.toString((char) ((int) 'A' + i));
            count = 1 + r.nextInt(5);
            pilesList[i] = new Pile(name, count);
        }
    }

    public int getSize() {
        return pilesList.length;
    }

    public String getPileNameByIndex(int index) {
        return pilesList[index].getName();
    }

    public int getPileCountByIndex(int index) {
        return pilesList[index].getCount();
    }

    public void print() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.print(this.getPileNameByIndex(i) + ": " + this.getPileCountByIndex(i) + "\t");
        }
    }

    public static void main(String[] args) {
        BabyNim the_game = new BabyNim(3);
        the_game.print();
    }
}
