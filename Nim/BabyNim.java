import java.util.Random;
import java.util.Scanner;

class Pile {
    private String name;
    private int count;

    public void Pile(String s, int n) {
        name = s;
        count = n;
    }

    public void setPileCount(int n) {
        count = n;
    }

    public int getPileCount() {
        return count;
    }

    public void setPileName(String s) {
        name = s;
    }

    public String getPileName() {
        return name;
    }

    public boolean isEmpty() {
        return (count > 0) ? false : true;
    }
}

class Piles {
    private Pile[] pile_list;

    public void Piles(int size) {
        Random r = new Random();
        String pile_name;
        pile_list = new Pile[size];

        for (int i = 0; i < size; i++) {
            pile_name = Character.toString((char) ((int) 'A' + i));
            pile_list[i].setPileName(pile_name);
            pile_list[i].setPileCount(1 + r.nextInt(5));
        }
    }

    public int getSize() {
        return pile_list.length;
    }

    public Pile getPileByIndex(int index) {
        return pile_list[index];
    }

    public Pile getPileByName(String pile_name) {
        Pile retval = null;
        for (int i = 0; i < pile_list.length; i++) {
            if (pile_list[i].getPileName() == pile_name) {
                retval = pile_list[i];
                break;
            }
        }
        return retval;
    }

    public boolean areAllPilesEmpty() {
        boolean isempty = true;
        for (int i = 0; i < pile_list.length; i++) {
            if (!pile_list[i].isEmpty()) {
                isempty = false;
                break;
            }
        }
        return isempty;
    }

    public void print() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.print(this.getPileByIndex(i).getPileName() + ": " + this.getPileByIndex(i).getPileCount() + "\t");
        }
    }
}

public class BabyNim {
    final static int NUMBER_OF_PILES = 3;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Piles the_piles = new Piles();
        String pile_choice;
        int to_remove;
        int pile_index;

        do {
            the_piles.print();
            System.out.print("\nChoose a pile: ");
            pile_choice = keyboard.next();
            System.out.print("How many to remove from pile " + pile_choice + ": ");
            to_remove = keyboard.nextInt();
            the_piles.getPileByName(pile_choice).setPileCount(the_piles[pile_index].getPileCount() - to_remove);
        } while (!areAllPilesEmpty(the_piles));

        System.out.println("\nAll piles are empty.Good job!");
    }
}
