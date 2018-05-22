import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random r = new Random();
        int dice1 = 1, dice2 = 0;
        int rolls = 0;

        System.out.println("HERE COMES THE DICE!");
        while (dice1 != dice2) {
            dice1 = (1 + r.nextInt(6));
            dice2 = (1 + r.nextInt(6));
            System.out.println("\nRoll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.println("The total is " + (dice1 + dice2) + "!");
            rolls++;
        }
        System.out.println("\nIt took " + rolls + " rolls to get a double!");
    }
}
