import java.util.Random;

/**
 * Created by fx06001 on 5/24/2018.
 */

public class GroupOfPiles {
    private Pile[] pilesList;

    public GroupOfPiles(int size) {
        pilesList = new Pile[size];
        setUpPiles();
    }

    public void setUpPiles(int value) {
        for (int i = 0; i < pilesList.length; i++) {
            pilesList[i] = new Pile(this.generatePileName(i), value);
        }
    }

    public void setUpPiles() {
        Random r = new Random();

        for (int i = 0; i < pilesList.length; i++) {
            pilesList[i] = new Pile(this.generatePileName(i), 1 + r.nextInt(5));
        }
    }

    public String generatePileName(int i) {
        return Character.toString((char) ((int) 'A' + i));
    }

    public int getSize() {
        return pilesList.length;
    }

    public Pile getPileByIndex(int index) {
        return pilesList[index];
    }

    public String generateOutputString() {
        String output = "";
        for (int i = 0; i < pilesList.length; i++) {
//            System.out.print(this.getPileByIndex(i).getName() + ": " + this.getPileByIndex(i).getCount() + "\t");
            output += this.getPileByIndex(i).getName() + ": " + this.getPileByIndex(i).getCount() + "\t";
        }
//        System.out.println();
        return output;
    }

    public boolean areAllPilesEmpty() {
        boolean retval = true;
        for (Pile p : pilesList) {
            if (!p.isEmpty()) {
                retval = false;
                break;
            }
        }
        return retval;
    }

    public Pile getPileByName(String name) {
        for (Pile p : pilesList) {
            if (name.equals(p.getName())) {
                return p;
            }
        }
        return null;
    }
}
